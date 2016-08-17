package com.meng.plugin.pushservice;

import android.util.Log;
import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.*;

/**
 * Created by liumeng on 2016/8/17.
 */
public class ProgressDialogPlugin extends CordovaPlugin {
    CallbackContext callbackContext;
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException{
        this.callbackContext = callbackContext;

        if (action.equals("start")) {
            String message=args.getString(0);
            Toast.makeText(cordova.getActivity(), message, Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
