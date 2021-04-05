package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

//    private Button showCashAmount;
//    private Button showTag;

    private int cashAmountCounter = 0;
    private TextView cashAmountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cashAmountText = findViewById(R.id.cashAmountTextView);

//        showCashAmount = findViewById(R.id.buttonMakeItRain);
//        showTag = findViewById(R.id.buttonShowTag);

//        showCashAmount.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("MakeItRainButtonLog", "Make it rain");
//            }
//        });
    }

    public void showTag(View v) {
        Toast.makeText(getApplicationContext(), R.string.toast_show_tag, Toast.LENGTH_LONG).show();

        Log.d("ShowTagButtonLog", "ShowTag");
    }

    public void makeItRain(View v) {
        cashAmountCounter += 1000;

        if (cashAmountCounter >= 10000 && cashAmountCounter < 25000) {
            cashAmountText.setTextColor(getResources().getColor(R.color.myDarkGold, null));
            cashAmountText.setTextSize(34);
        }else if (cashAmountCounter >= 25000 && cashAmountCounter < 50000) {
            cashAmountText.setTextColor(getResources().getColor(R.color.myGold, null));
            cashAmountText.setTextSize(44);
        }else if (cashAmountCounter >= 50000) {
            cashAmountText.setTextColor(getResources().getColor(R.color.myYellow, null));
            cashAmountText.setTextSize(54);
        }


        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        cashAmountText.setText(String.valueOf(numberFormat.format(cashAmountCounter)));
        Log.d("MakeItRainButtonLog", "Make it rain " + cashAmountCounter);
    }
}