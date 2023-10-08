package com.example.lab3_matvii_sovhirenko_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private TextView calculatorDisplay;
    private TextView subDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculatorDisplay = findViewById(R.id.calculatorDisplay);
        subDisplay = findViewById(R.id.subDisplay);
    }

    public void numBtnClick(View v) {
        Button clickedButton = (Button) v;
        if (!(calculatorDisplay.getText().toString().length() == 1 && calculatorDisplay.getText().toString().contains("0")))
            calculatorDisplay.setText(calculatorDisplay.getText().toString() + clickedButton.getText().toString());
        else calculatorDisplay.setText(clickedButton.getText().toString());
    }

    public void clearLastEntryBtn(View v) {
        calculatorDisplay.setText("");
    }

    public void allClearBtn(View v) {
        calculatorDisplay.setText("");
        subDisplay.setText("");
    }

    public void deleteLastChar(View v) {
        if (!calculatorDisplay.getText().toString().isEmpty())
            calculatorDisplay.setText(calculatorDisplay.getText().toString().substring(0, calculatorDisplay.getText().toString().length() - 1));
    }

    public void signChane(View v) {
        if (!calculatorDisplay.getText().toString().isEmpty()) {
            double currentValue = Double.parseDouble(calculatorDisplay.getText().toString()) * (-1);
            calculatorDisplay.setText((currentValue == (int) currentValue) ? String.valueOf((int) currentValue) : String.valueOf(currentValue));
        }
    }

    public void dotSignBtn(View v) {
        if (calculatorDisplay.getText().toString().length() > 0) {
            if (!calculatorDisplay.getText().toString().contains(".")) {
                calculatorDisplay.setText(calculatorDisplay.getText().toString() + ".");
            }
        } else {
            calculatorDisplay.setText("0.");
        }
    }

    public void signBtnClick(View v) {
        Button clickedButton = (Button) v;
        Character signs[] = {'*', '/', '+', '-'};
        if (!calculatorDisplay.getText().toString().isEmpty()) {
            if (!Arrays.stream(signs).anyMatch(sign -> subDisplay.getText().toString().contains(String.valueOf(sign)))) {
                subDisplay.setText(calculatorDisplay.getText().toString() + clickedButton.getText().toString());
                calculatorDisplay.setText("");
            } else {
                subDisplay.setText(calcResult() + clickedButton.getText().toString());
                calculatorDisplay.setText("");
            }
        }

    }

    public String calcResult() {
        double result = 0.0;
        char sign = ' ';
        if(subDisplay.getText().toString().isEmpty() && calculatorDisplay.getText().toString().isEmpty())
            return null;
        if(!subDisplay.getText().toString().isEmpty())
            sign = subDisplay.getText().charAt(subDisplay.getText().toString().length()-1);
        else return calculatorDisplay.getText().toString();
        if(!calculatorDisplay.getText().toString().isEmpty())
        {
            double firstOperand = Double.parseDouble(subDisplay.getText().toString().substring(0, subDisplay.getText().toString().length()-1));
            double secondOperand = Double.parseDouble(calculatorDisplay.getText().toString());
            switch(sign){
                case '-':
                    result = firstOperand - secondOperand;
                    break;
                case '+':
                    result = firstOperand + secondOperand;
                    break;
                case '/':
                    result = firstOperand/secondOperand;
                    break;
                case '*':
                    result = firstOperand*secondOperand;
                    break;
            }
            return (result == (int) result) ? String.valueOf((int) result) : String.valueOf(result);
        }
        else
            return subDisplay.getText().toString().substring(0, subDisplay.getText().toString().length()-1);
    }

    public void resultBtn(View v){
        calculatorDisplay.setText(calcResult());
        subDisplay.setText("");
    }
    public void squareRootBtn(View v){
        if (!calculatorDisplay.getText().toString().isEmpty()) {
            double currentValue = Math.sqrt(Double.parseDouble(calculatorDisplay.getText().toString()));
            calculatorDisplay.setText((currentValue == (int) currentValue) ? String.valueOf((int) currentValue) : String.valueOf(currentValue));
        }
    }
}

