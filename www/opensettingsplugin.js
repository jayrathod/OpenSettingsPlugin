var opensettingsplugin = function() {
	this.resultCallback = null; // Function
}

// function call used to invoke system settings.
opensettingsplugin.prototype.settings = function(value, successCallback,
		failureCallback) {
	return cordova.exec(successCallback, failureCallback,
			'OpenSettingsPlugin', "openSettings", [ value ]);
}

// function call used to invoke location settings.
opensettingsplugin.prototype.locationSettings = function(value,
		successCallback, failureCallback) {
	return cordova.exec(successCallback, failureCallback,
			'OpenSettingsPlugin', "openLocationSettings", [ value ]);
}

// Plug into Cordova
cordova.addConstructor(function() {

    if (!window.Cordova) {
        window.Cordova = cordova;
    };

    if(!window.plugins) window.plugins = {};
    window.plugins.OpenSettingsPlugin = new OpenSettingsPlugin();
});
