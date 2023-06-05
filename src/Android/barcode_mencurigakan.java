package com.example.barcode_mencurigakan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.rscja.barcode.BarcodeDecoder;
import com.rscja.barcode.BarcodeFactory;

public class BarcodeMencurigakan extends AppCompatActivity {
    private BarcodeDecoder barcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barcode = BarcodeFactory.getInstance().getBarcodeDecoder();
        barcode.open(this);
        barcode.startScan();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (barcode != null) {
            barcode.stopScan();
            barcode.close();
        }
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, BarcodeMencurigakan.class);
        context.startActivity(intent);
    }
}
