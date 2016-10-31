package com.jdcasas.lab_6_2act5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void zoomBack(View button) {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(R.animator.zoom_back_in, R.animator.zoom_back_out);
    }

    public void fade(View button) {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
    }

    public void right(View button) {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(R.animator.right_in, R.animator.right_out);
    }

    public void back(View button) {
        super.onBackPressed();
    }

}
