/**
* Get the Baum-Sweet value for the given number
* @param {integer} number -Number to calculate
* @returns {integer} - Baum-Sweet value
* */
const getBaumSweet = (number) => {
  if (number === 0) {
    return 1;
  }
  const binary = number.toString(2);

  let numZeroes = 0;
  for (let i = 0; i < binary.length; i += 1) {
    const current = parseInt(binary[i], 10);

    if (current === 0) {
      numZeroes += 1;
    } else {
      if (numZeroes % 2 === 1) {
        return 0;
      }
      numZeroes = 0;
    }
  }

  return numZeroes % 2 === 1 ? 0 : 1;
};

/**
* Print the Baum-Sweet seqeuence from 0 to the given number
* @param {integer} number - Number to print sequence too
* @returns {void}
* */
module.exports = function baumSweet(number) {
  const sequence = [...Array(number + 1).keys()].map(num => getBaumSweet(num)).join(', ');
  console.log(sequence);
};
