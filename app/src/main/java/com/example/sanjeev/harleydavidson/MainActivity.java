package com.example.sanjeev.harleydavidson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Lyrics:Main";

    private String process;
    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button enter = findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                EditText processInput = (EditText) findViewById(R.id.process);
                Log.d(TAG, "Start button clicked");
                if (processInput == null) {
                    Log.d(TAG, "Failed to get Edit text object");
                }
                Editable processInp = processInput.getText();
                if (processInp == null) {
                    Log.d(TAG, "Failed to get Edit text object");
                }
                process = processInp.toString();
                final TextView myTextBox = findViewById(R.id.data);
                String calc = "";
                if (process.equals("1-2")) {
                    calc = "T1 = 300K, T2 = 760K \n p1 = 101 kPa, p2 = 2.810 MPa \n q12 = 0 kJ/kg \n w12 = -459 kJ/kg";
                } else if (process.equals("2-3")) {
                    calc = "T2 = 760K, T3 = 1654K \n p2 = 2.810 MPa, p3 = 6.12 MPa \n q23 = 800 kJ/kg \n w23 = 0 kJ/kg";
                } else if (process.equals("3-4")) {
                    calc = "T3 = 1654K, T4 = 772K \n p3 = 6.12 MPa, p4 =  2.855 MPa \n q34 = 0 kJ/kg \n w34 = 781 kJ/kg";
                } else if (process.equals("4-1")) {
                    calc = "T4 = 772K, T1 = 300K \n p4 = 2.855 MPa, p1 = 101 kPa \n q41 = -390 kJ/kg \n w41 = 0 kJ/kg";
                } else {
                    Log.d(TAG, "Invalid Process");
                }
                myTextBox.setText(calc);
            }
        });
    }
}
