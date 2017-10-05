package com.saccity362.intentapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button b1;
    private Intent i;
    private EditText et;
    public static final String EXTRA_MESSAGE="com.saccity362.intentapplication";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.buttonSend);
        et = (EditText)findViewById(R.id.editText);

   }

    public void sendMessage(View v)
    {
        i = new Intent(this,ReceiveIntentActivity.class);
        i.putExtra(EXTRA_MESSAGE,et.getText().toString());

        startActivity(i);
    }

}
