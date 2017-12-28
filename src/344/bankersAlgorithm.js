const fs = require('fs');

/**
 * Load the resources file
 * @param {string} path - Path to file with resources
 * @returns {object} - Resources loaded from file
 */
function loadFile(path) {
  const processes = [];
  const currentResources = [];
  const maxResources = [];

  const fileContent = fs.readFileSync(`${__dirname}/${path}`).toString().split('\n');

  fileContent.slice(1).forEach((process, index) => {
    if (process.trim().length > 0) {
      const convertedLine = process.substring(1, process.length - 1).split(' ').map(Number);
      processes.push(index);
      currentResources.push(convertedLine.slice(0, convertedLine.length / 2));
      maxResources.push(convertedLine.slice(convertedLine.length / 2));
    }
  });

  return {
    availableResources: fileContent[0].substring(1, fileContent[0].length - 1).split(' ').map(Number),
    processes,
    currentResources,
    maxResources,
  };
}

/**
 * Check if there are enough resources for the process
 * @param {integer[]} process - Process to check resources for
 * @param {integer} processIndex - Process index to look up in `resources`
 * @param {object} resources - Holds information about the process' resources
 * @returns {boolean} - Is there enough resources for the process
 */
function isEnoughForProcess(process, processIndex, resources) {
  return process.every((resource, resourceIndex) => {
    const neededResource = resources.maxResources[processIndex][resourceIndex] - resource;
    return resources.availableResources[resourceIndex] >= neededResource;
  });
}

/**
 * Allocate resources
 * @param {integer[]} process - Process to allocate resources for
 * @param {integer} availableResources - Available resources to use for allocation
 * @returns {integer[]} - Array of updated resources for process
 */
function allocateResources(process, availableResources) {
  return process.map((resource, resourceIndex) =>
    availableResources[resourceIndex] + resource);
}

/**
 * Handle checking process and updating resources
 * @param {integer} processIndex - Process index to look up in `resources`
 * @param {object} resources - Holds information about the process' resources
 * @returns {boolean} - If the process was allocated
 */
function handleProcess(processIndex, resources) {
  const process = resources.currentResources[processIndex];
  const { availableResources } = resources;

  if (isEnoughForProcess(process, processIndex, resources)) {
    resources.availableResources = allocateResources(process, availableResources);
    return true;
  }
  return false;
}

/**
 * Sort processes between allocated and unallocated
 * @param {integer[]} processes - Processes to check allocation for
 * @param {Function} isHandeled - Function to check if process was allocated
 * @returns {Array<Array<Integer>, Integer>} - Array of allocated and unallocated processes
 */
function partitionProcesses(processes, isHandeled) {
  return processes.reduce(([handled, unhandeled], process) =>
    (isHandeled(process) ?
      [[...handled, process], unhandeled] :
      [handled, [...unhandeled, process]]), [[], []]);
}

/**
 * Allocated the processes for the given resources and constraints
 * @param {object} resources - Holds information about the process' resources
 * @returns {integer[]} - Order that processes were allocated
 */
function allocateProcesses(resources) {
  let processQueue = resources.processes.slice();
  const processedProcesses = [];

  while (processQueue.length) {
    const [
      allocatedProcesses,
      unallocatedProcess,
    ] = partitionProcesses(
      processQueue,
      processIndex => handleProcess(processIndex, resources),
    );

    if (!allocatedProcesses.length) {
      return [];
    }
    processQueue = unallocatedProcess;
    processedProcesses.push(...allocatedProcesses);
  }

  return processedProcesses;
}

/**
 * Run the bankers algorithm on the given resources file
 * @param {string} path - Path to file with resources
 * @returns {undefined}
 */
const bankers = function bankers(path) {
  const processedProcesses = allocateProcesses(loadFile(path));

  if (processedProcesses.length) {
    console.log(processedProcesses.map(i => `P${i}`).join(','));
  } else {
    console.log('invalid state!');
  }
};

module.exports = bankers;
