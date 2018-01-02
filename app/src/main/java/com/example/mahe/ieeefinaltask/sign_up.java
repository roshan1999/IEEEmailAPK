package com.example.mahe.ieeefinaltask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class sign_up extends AppCompatActivity {

    public void submit(View view)
    {
        EditText pass= (EditText)findViewById(R.id.editText10);
        EditText confirmpass=(EditText)findViewById(R.id.editText11);
        String s1= pass.getText().toString();
        String s2= confirmpass.getText().toString();
        Intent intent = new Intent(this,MainActivity.class);
        if (s1.equals("")){
            Toast.makeText(this, "BLANK PASSWORD", Toast.LENGTH_SHORT).show();
        }
        else if(s2.equals(s1)){
            startActivity(intent);
        }

        else
            Toast.makeText(this, "PASSWORD DOn'T MATCH", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
}
