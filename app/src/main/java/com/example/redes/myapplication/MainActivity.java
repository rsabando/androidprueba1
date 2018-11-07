package com.example.redes.myapplication;
import android.util.Log;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Estoy en create");
       //Log.d("hola");
    }
    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        System.out.println("Estoy en Resume");

    }
    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        System.out.println("Estoy en Start");
    }
    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        System.out.println("Estoy en Stop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        System.out.println("Estoy en Destroy");
    }
}
