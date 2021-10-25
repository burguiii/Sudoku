package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5,et6,et7,et8,et9;
    String et = "et";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1.findViewById(R.id.et1);
        et2.findViewById(R.id.et2);
        et3.findViewById(R.id.et3);
        et4.findViewById(R.id.et4);
        et5.findViewById(R.id.et5);
        et6.findViewById(R.id.et6);
        et7.findViewById(R.id.et7);
        et8.findViewById(R.id.et8);
        et9.findViewById(R.id.et9);

    }



    public void generarNumeros(View view){
        for(int i = 0; i < 3 ; i++){
                et = et + i;

            for (int j = 0; j<3;j++){

            }
        }
    }




}