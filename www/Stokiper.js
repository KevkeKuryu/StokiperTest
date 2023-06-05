var BarcodeMencurigakan = {
    startScan: function(successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "BarcodeMencurigakan", "start", []);
    }
};

module.exports = BarcodeMencurigakan;
