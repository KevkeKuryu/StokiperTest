package com.example.Stokiper;




import org.apache.cordova.CallbackContext;

import org.apache.cordova.CordovaPlugin;

import org.apache.cordova.PluginResult;

import org.json.JSONArray;

import org.json.JSONException;

import org.json.JSONObject;




import com.rscja.barcode.BarcodeDecoder;

import com.rscja.barcode.BarcodeFactory;

import com.rscja.barcode.BarcodeUtility;

import com.rscja.deviceapi.entity.BarcodeEntity;




public class Stockiper extends CordovaPlugin {

    BarcodeDecoder barcode = BarcodeFactory.getInstance().getBarcodeDecoder();




    @Override

    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if(action.equals("read"))

        {

            barcode.open();

            barcode.startScan();

           

            String hasil = "Scan berhasil";

            callbackContext.success(hasil);

            return true;

        }




        else

        {

            return false;

        }

    }

}