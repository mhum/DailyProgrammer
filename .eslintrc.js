module.exports = {
    "extends": "airbnb-base",
    "rules": {
      "no-param-reassign": ["error", {"props": false}],
      "import/no-extraneous-dependencies": ["error", {
        "devDependencies": [
          "**/**Test.js"
          ]
      }],
      "require-jsdoc": ["error"],
      "valid-jsdoc": ["error"],
    },
    "env": {
      "node": true,
      "mocha": true
    }
};
