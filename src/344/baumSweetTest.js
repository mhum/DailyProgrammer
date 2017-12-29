const { expect } = require('chai');
const sinon = require('sinon');

const baumSweet = require('./baumSweet');

describe('Baum–Sweet Sequence', () => {
  describe('#baumSweet', () => {
    let sandbox;
    let consoleLog;

    beforeEach(() => {
      sandbox = sinon.createSandbox();
      consoleLog = sandbox.stub(console, 'log');
    });

    afterEach(() => {
      sandbox.restore();
    });

    it('should print out valid sequence', () => {
      baumSweet(20);

      expect(consoleLog.getCall(0).args[0]).to.equal('1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0');
    });
  });
});
