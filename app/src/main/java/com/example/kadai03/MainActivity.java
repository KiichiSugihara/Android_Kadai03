package com.example.kadai03;

import androidx.appcompat.app.AppCompatActivity;
import  android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusNumber(View view){
        EditText editTextA =(EditText) findViewById(R.id.edit_message_a);
        EditText editTextB =(EditText) findViewById(R.id.edit_message_b);
        TextView textView = (TextView) findViewById(R.id.view_message);
        String message = String.valueOf(Integer.parseInt(editTextA.getText().toString()) + Integer.parseInt(editTextB.getText().toString()));
        textView.setText( message);
    }
    public void minusNumber(View view){
        EditText editTextA =(EditText) findViewById(R.id.edit_message_a);
        EditText editTextB =(EditText) findViewById(R.id.edit_message_b);
        TextView textView = (TextView) findViewById(R.id.view_message);
        String message = String.valueOf(Integer.parseInt(editTextA.getText().toString()) - Integer.parseInt(editTextB.getText().toString()));
        textView.setText( message);
    }
    public void multiplyNumber(View view){
        EditText editTextA =(EditText) findViewById(R.id.edit_message_a);
        EditText editTextB =(EditText) findViewById(R.id.edit_message_b);
        TextView textView = (TextView) findViewById(R.id.view_message);
        String message = String.valueOf(Integer.parseInt(editTextA.getText().toString()) * Integer.parseInt(editTextB.getText().toString()));
        textView.setText( message);
    }
    public void divideNumber(View view){
        EditText editTextA =(EditText) findViewById(R.id.edit_message_a);
        EditText editTextB =(EditText) findViewById(R.id.edit_message_b);
        TextView textView = (TextView) findViewById(R.id.view_message);
        String message = String.valueOf(Integer.parseInt(editTextA.getText().toString()) / Integer.parseInt(editTextB.getText().toString()));
        textView.setText( message);
    }
        public void clearNumber(View view){
            TextView textView = (TextView) findViewById(R.id.view_message);
            String message = "";
            textView.setText( message);
    }
}


//}
