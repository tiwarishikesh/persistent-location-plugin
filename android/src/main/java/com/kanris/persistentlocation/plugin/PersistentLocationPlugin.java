package com.kanris.persistentlocation.plugin;

import android.content.Intent;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "PersistentLocation")
public class PersistentLocationPlugin extends Plugin {

    private PersistentLocation implementation = new PersistentLocation();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        Intent intent = new Intent(getContext(), RunningService.class);
        intent.setAction("START");
        getActivity().startService(intent);

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }
}
