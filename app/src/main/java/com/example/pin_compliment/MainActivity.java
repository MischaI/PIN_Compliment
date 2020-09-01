package com.example.pin_compliment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
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
        inputText = findViewById(R.id.inputText);
        inputPin = findViewById(R.id.inputNumber);


        btn_pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getPassword();
                getPIN();
            }
        });
    }



    public void getKompliment(EditText pwd){

        String input = pwd.getText().toString().toLowerCase().trim();
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

    public void showIMG(EditText code){
        String pin = code.getText().toString().trim().toLowerCase();

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, "ToDo Foto anzeigen", duration);
        toast.show();
        // ToDo falls ein pin eingebgeben, Foto anzeigen
    }

    @SuppressLint("WrongViewCast")
    public void getPassword(){
        String text = inputText.getText().toString();
        if(!text.equalsIgnoreCase("")){
            getKompliment(inputText);
        }
    }

    @SuppressLint("WrongViewCast")
    public void getPIN(){
        String pin = inputPin.getText().toString().trim();
        if(!pin.equalsIgnoreCase("")){
            showIMG(inputPin);

        }
    }


    @Override
    public void onClick(View view) {

    }
}