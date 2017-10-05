package com.saccity362.intentapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class ReceiveIntentActivity extends AppCompatActivity {

    private Intent i;
    private String msg;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_message_layout);

        tv = (TextView)findViewById(R.id.textView2);

        i = getIntent();

        msg = i.getStringExtra(MainActivity.EXTRA_MESSAGE);

        tv.setText(msg);
    }


}
