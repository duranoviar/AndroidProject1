package com.duranoviar.activitydemo;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import static android.view.View.OnCreateContextMenuListener;


public class SecondActivity extends Activity {

    TextView tvResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvResponse = (TextView) findViewById(R.id.tv_result);
        tvResponse.setText(getIntent().getStringExtra("key"));

    }
}
