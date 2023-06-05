var exec = require('cordova/exec');

var Stokiper = function () {};

Stokiper.prototype.read = function (successCallback, errorCallback) {
exec(successCallback, errorCallback, 'Stokiper', 'read', []);
};

module.exports = new Stokiper();