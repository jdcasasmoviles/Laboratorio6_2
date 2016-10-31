package com.jdcasas.lab_6_2act5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void forwardZoom(View button) {
        startActivity(new Intent(this, Main2Activity.class));
        overridePendingTransition(R.animator.zoom_forward_in, R.animator.zoom_forward_out);
    }

    public void left(View button) {
        startActivity(new Intent(this, Main2Activity.class));
        overridePendingTransition(R.animator.left_in, R.animator.left_out);
    }

    public void fade(View button) {
        startActivity(new Intent(this, Main2Activity.class));
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
    }

    public void byDefault(View button) {
        startActivity(new Intent(this, Main2Activity.class));
    }

}
