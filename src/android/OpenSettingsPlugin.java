package com.example.opensettings;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.LOG;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.provider.Settings;

public class OpenSettingsPlugin extends CordovaPlugin {

	@Override
	public boolean execute(String action, final JSONArray args,
			final CallbackContext callbackContext) throws JSONException {
		
		//Opens android system settings panel
		if ("openSettings".equals(action)) {
			try {
				String value = args.getString(0);

				if (value.equalsIgnoreCase("TRUE")) {
					this.cordova.getActivity().startActivity(
							new Intent(Settings.ACTION_SETTINGS));
				} else {
					LOG.e("OpenSettingPage", "Unable to open settings");
				}
				callbackContext.sendPluginResult(new PluginResult(
						PluginResult.Status.OK));

			} catch (JSONException ex) {
				callbackContext.sendPluginResult(new PluginResult(
						PluginResult.Status.JSON_EXCEPTION));
			}
		}
		
		//Opens android location settings panel
		if ("openLocationSettings".equals(action)) {
			try {
				String value = args.getString(0);

				if (value.equalsIgnoreCase("TRUE")) {
					this.cordova
							.getActivity()
							.startActivity(
									new Intent(
											Settings.ACTION_LOCATION_SOURCE_SETTINGS));
				} else {
					LOG.e("OpenSettingPage", "Unable to open Locationsettings");
				}
				callbackContext.sendPluginResult(new PluginResult(
						PluginResult.Status.OK));

			} catch (JSONException ex) {
				callbackContext.sendPluginResult(new PluginResult(
						PluginResult.Status.JSON_EXCEPTION));
			}
		}
		return true;
	}
}
