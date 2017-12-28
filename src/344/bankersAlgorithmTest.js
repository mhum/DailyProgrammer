const { expect } = require('chai');
const sinon = require('sinon');

const bankersAlgorithm = require('./bankersAlgorithm');

describe('Bankers Algorithm', () => {
  describe('#bankers', () => {
    let sandbox;
    let consoleLog;

    beforeEach(() => {
      sandbox = sinon.createSandbox();
      consoleLog = sandbox.stub(console, 'log');
    });

    afterEach(() => {
      sandbox.restore();
    });

    it('should print out valid state', () => {
      bankersAlgorithm('../../resources/344/example.txt');

      expect(consoleLog.getCall(0).args[0]).to.equal('P1,P3,P4,P0,P2');
    });

    it('should print out invalid state', () => {
      bankersAlgorithm('../../resources/344/invalidState.txt');

      expect(consoleLog.getCall(0).args[0]).to.equal('invalid state!');
    });
  });
});
