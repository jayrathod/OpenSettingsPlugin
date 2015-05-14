# OpenSettingPlugin
Cordova Open Settings Plugin

While developing cordova applications its very common scenario that user needs to redirect to system settings where he/she can modify settings and redirect back to our app.

The most frequent and wide spread scenario would be every newbie developing an app using cordova and incorporating geo-location features in his/her app needs location access provided by device. Hence this plugin helps to navigate user to system settings as well as location settings directly for their cordova app and perform enable/disable actions accordingly.

<h3>Installing the plugin</h3>

1.Download the repo using GIT or just a ZIP from Github.<br/>
2.Add the plugin to your project (from the root of your project):<br/>
cordova plugin add https://github.com/jayrathod/OpenSettingsPlugin.git

<h3>Using the plugin</h3>

Plugin allows usage of following two methods viz.

1.openSettings(value, successCallback,failureCallback)<br/>
2.openLocationSettings(value, successCallback,failureCallback)

The value fields takes the boolean value true for time being because this plugin will be the part of collection of sytem settings which I will modify in future and update the same.
