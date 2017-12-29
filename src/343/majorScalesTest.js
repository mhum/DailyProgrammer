const { expect } = require('chai');
const sinon = require('sinon');

const majorScale = require('./majorScales');

describe('Major Scale', () => {
  describe('#majorScale', () => {
    let sandbox;
    let consoleLog;

    beforeEach(() => {
      sandbox = sinon.createSandbox();
      consoleLog = sandbox.stub(console, 'log');
    });

    afterEach(() => {
      sandbox.restore();
    });

    it('should print out the correct note', () => {
      majorScale('C', 'Do');
      expect(consoleLog.getCall(0).args[0]).to.equal('C');

      majorScale('C', 'Re');
      expect(consoleLog.getCall(1).args[0]).to.equal('D');

      majorScale('C', 'Mi');
      expect(consoleLog.getCall(2).args[0]).to.equal('E');

      majorScale('D', 'Mi');
      expect(consoleLog.getCall(3).args[0]).to.equal('F#');

      majorScale('A#', 'Fa');
      expect(consoleLog.getCall(4).args[0]).to.equal('D#');
    });
  });
});
