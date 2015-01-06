package com.example.shuheisuzuki.mixitrainingview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class CalculatorActivity
        extends ActionBarActivity
        implements View.OnClickListener
{
    private final String TAG = this.getClass().getSimpleName();

    private ArrayList<Integer> stackedValues = new ArrayList<Integer>();
    private Integer stackedValue;
    private TextView resultText, optinalText;
    private String currentOpration = null;
    private Boolean isAfterOpration = false;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btn00, btnPlus, btnMinus, btnMulti, btnDiv, btnEquals, btnDot, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        resultText = (TextView) findViewById(R.id.result);
        optinalText = (TextView) findViewById(R.id.optionalText);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn00 = (Button) findViewById(R.id.btn00);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnEquals = (Button) findViewById(R.id.btnEquals);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnClear = (Button) findViewById(R.id.btnClear);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn00.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        int id = v.getId();
        String text, btnText;
        switch (id) {
            case R.id.btn0:
            case R.id.btn1:
            case R.id.btn2:
            case R.id.btn3:
            case R.id.btn4:
            case R.id.btn5:
            case R.id.btn6:
            case R.id.btn7:
            case R.id.btn8:
            case R.id.btn9:
            case R.id.btn00:
            case R.id.btnDot:
                text = (String) resultText.getText();
                btnText = (String) ((Button) v).getText();
                Log.d(TAG, "pre text = " + text);
                if (isAfterOpration) {
                    Log.d(TAG, "next_current_point");
                    text = "";
                    isAfterOpration = false;
                }
                if (text.equals("0") && !btnText.equals(".")) {
                    text = "";
                }
                text += btnText;
                if (text.equals("00")) {
                    text = "0";
                }
                Log.d(TAG, "text = " + text);
                resultText.setText(text);
                break;
            case R.id.btnPlus:
            case R.id.btnMinus:
            case R.id.btnMulti:
            case R.id.btnDiv:
                currentOpration = resultText.getText().toString();
                optinalText.setText(currentOpration);
                preProcOperation();
                postProcOperation();
                break;
            case R.id.btnEquals:
                if (stackedValue != null) {
                    Integer i = Integer.parseInt((String) resultText.getText());
                    Integer r = stackedValue * i;
                    stackedValue = null;
                    resultText.setText(r.toString());
                }
                break;
            case R.id.btnClear:
                Log.d(TAG, "text = 0");
                resultText.setText("0");
                optinalText.setText("");
                break;
        }
    }

    public void postProcOperation()
    {
        if (currentOpration.equals(null)) {
            Log.d(TAG, "current = " + resultText);
            stackedValue = Integer.parseInt((String) resultText.getText());
            isAfterOpration = true;
            stackedValues.add(stackedValues.size(), stackedValue);
            Log.d(TAG, "size = " + stackedValues.size());
            Log.d(TAG, "stackResults(" + stackedValues.size() + ") = " + stackedValues.get(stackedValues.size() - 1));
        }
    }

    public void preProcOperation()
    {
//        flag_plus = false;
//        flag_minus = false;
//        flag_multi = false;
//        flag_div = false;
//        flag_dot = false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
