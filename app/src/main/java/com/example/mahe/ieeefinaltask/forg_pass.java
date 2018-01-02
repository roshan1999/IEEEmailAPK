package com.example.mahe.ieeefinaltask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class forg_pass extends AppCompatActivity {

    public static String extramsg = "Hello";
   public void sendMessage(View view)
    {
        EditText et_username = (EditText)findViewById(R.id.editText3);
        String s = et_username.getText().toString();
        Intent intent= new Intent(this, MainActivity.class);
        intent.putExtra(extramsg,s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forg_pass);
    }
}
