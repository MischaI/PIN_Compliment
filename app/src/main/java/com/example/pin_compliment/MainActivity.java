package com.example.pin_compliment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_pin;
    EditText inputPin;
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_pin = findViewById(R.id.btn_confirm);
        inputText = findViewById(R.id.inputNumber);
        inputPin = findViewById(R.id.inputText);


        btn_pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getPIN();
            }
        });
    }



    public void getKompliment(EditText pin){

        String input = pin.getText().toString().trim().toLowerCase();
        CharSequence text;

        switch (input){
            case "aaa":
                text =  "Ich liebe dich!";
                break;
            case "liebe":
                text = "я люблю тебя!";
                break;
            default:
                text =  "input prüfen";
        }


        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    @SuppressLint("WrongViewCast")
    public void getPIN(){
        String pwd = "";



        getKompliment(inputPin);
    }

    @Override
    public void onClick(View view) {

    }
}