package com.diyihangdaima.black.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Tag", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Tag", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Tag", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Tag", "onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Tag", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
       Log.d("Tag", "onRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", "onCreate");
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Button startNormalActivity = (Button) findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button) findViewById(R.id.start_dialog_activity);

        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });

        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });


    }
}
