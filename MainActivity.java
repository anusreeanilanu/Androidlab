package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "start...", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle", "onStart invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resume...", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Pause...", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Stop...", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restart..", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroy..", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onDestroy invoked");
    }
}