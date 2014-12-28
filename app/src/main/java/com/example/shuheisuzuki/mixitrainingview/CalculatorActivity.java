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

    private ArrayList<Integer> stackResults;
    private Integer current;
    private TextView result,optinalText;
    private Boolean flag_plus, flag_minus, flag_multi, flag_div, flag_dot;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btn00, btnPlus, btnMinus, btnMulti, btnDiv, btnEquals, btnDot, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        result = (TextView) findViewById(R.id.result);
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
                text = (String) result.getText();
                btnText = (String) ((Button) v).getText();
                Log.d(TAG, "pre text = " + text);
                if (text.equals("0") && !btnText.equals(".")) {
                    text = "";
                }
                text += btnText;
                if (text.equals("00")) {
                    text = "0";
                }
                Log.d(TAG, "text = " + text);
                result.setText(text);
                break;
            case R.id.btnPlus:
//                preSubmitFlag();
//                flag_plus = true;
                optinalText.setText("+");
                break;
            case R.id.btnMinus:
//                preSubmitFlag();
//                flag_minus = true;
                optinalText.setText("-");
                break;
            case R.id.btnMulti:
                optinalText.setText("×");
                break;
            case R.id.btnDiv:
//                preSubmitFlag();
//                flag_minus = true;
                optinalText.setText("÷");
            case R.id.btnEquals:

                break;
            case R.id.btnClear:
                Log.d(TAG, "text = 0");
                result.setText("0");
                optinalText.setText("");
                break;
        }
    }

    public void preSubmitFlag()
    {
        if (flag_plus || flag_minus || flag_multi || flag_div || flag_dot) {
        //    stackResults.add(stackResults.size(), current);
        }
        flag_plus = false;
        flag_minus = false;
        flag_multi = false;
        flag_div = false;
        flag_dot = false;
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
