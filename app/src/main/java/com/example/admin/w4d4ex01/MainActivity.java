package com.example.admin.w4d4ex01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG= MainActivity.class.getSimpleName()+"_TAG";
    public Button btn_call,btn_stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        btn_call=(Button)findViewById(R.id.btn_call_service);
        btn_call.setOnClickListener(this);
        btn_stop=(Button)findViewById(R.id.btn_stop_service);
        btn_stop.setOnClickListener(this);
    }
    public void startService(View view){
        startService(new Intent(this, HellouService.class));

    }
    public void stopService(View view){
        stopService(new Intent(this, HellouService.class));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_call_service:
                startService(v);
                break;
            case R.id.btn_stop_service:
                stopService(v);
                break;
        }
    }
}
