package com.example.pin_compliment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_pin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_pin = findViewById(R.id.btn_confirm);


        btn_pin.setOnClickListener(getPIN);
    }



    public void getKompliment(int pin){
        switch (pin){
            case 1:
            default:
                Context context = getApplicationContext();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                break;

        }

    }

    public void getPIN(){
        int pin = 0;


        getKompliment(pin);
    }

    @Override
    public void onClick(View view) {
        getPIN();
    }
}