package com.example.addingtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumber,secondNumber;
    private Button add;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber=(EditText)findViewById(R.id.first_number_editText);
        secondNumber=(EditText)findViewById(R.id.second_number_editText);

        add=(Button)findViewById(R.id.add_button);
        result=(TextView)findViewById(R.id.result_textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNum= Integer.parseInt(firstNumber.getText().toString().trim());
                int secondNum=Integer.parseInt(secondNumber.getText().toString().trim());

                int Sum = firstNum + secondNum ;

                result.setText("Result :"+ String.valueOf(Sum));
                firstNumber.setText("");
                secondNumber.setText("");
            }
        });
    }
}
