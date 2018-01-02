package com.example.mahe.ieeefinaltask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public void main_page(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        EditText et1=(EditText) findViewById(R.id.editText2);
        String s= et1.getText().toString();
        if(s.equals("Hello"))
        {startActivity(intent);}
        else{
            Toast.makeText(this, "Invalid Password", Toast.LENGTH_SHORT).show();
        }
    }
    public void sign_up(View view)
    {
        Intent intent = new Intent(this,sign_up.class);
        startActivity(intent);
    }
    public void forgpass(View view)
    {

        Intent intent = new Intent(this,forg_pass.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String message = intent.getStringExtra(forg_pass.extramsg);
        EditText etusername = (EditText)findViewById(R.id.editText);
        etusername.setText(message);
    }
}
