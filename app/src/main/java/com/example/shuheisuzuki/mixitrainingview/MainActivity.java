package com.example.shuheisuzuki.mixitrainingview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity
        extends ActionBarActivity
    implements View.OnClickListener
{
    private Button linearLayoutPractice1Btn, linearLayoutPractice2Btn,
            RelativeLayoutPractice1Btn, RelativeLayoutPractice2Btn,
            FrameLayoutPractice1Btn, FrameLayoutPractice2Btn,
            ScrollLayoutPractice1Btn, CalclatorPracticeBtn,
            FragmentPracticeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayoutPractice1Btn = (Button) findViewById(R.id.linearLayoutPractice1Btn);
        linearLayoutPractice2Btn = (Button) findViewById(R.id.linearLayoutPractice2Btn);

        RelativeLayoutPractice1Btn = (Button) findViewById(R.id.RelativeLayoutPractice1Btn);
        RelativeLayoutPractice2Btn = (Button) findViewById(R.id.RelativeLayoutPractice2Btn);

        FrameLayoutPractice1Btn = (Button) findViewById(R.id.FrameLayoutPractice1Btn);
        FrameLayoutPractice2Btn = (Button) findViewById(R.id.FrameLayoutPractice2Btn);

        ScrollLayoutPractice1Btn = (Button) findViewById(R.id.ScrollLayoutPractice1Btn);

        CalclatorPracticeBtn = (Button) findViewById(R.id.CalclatorPracticeBtn);

        FragmentPracticeBtn = (Button) findViewById(R.id.FragmentPracticeBtn);

        linearLayoutPractice1Btn.setOnClickListener(this);
        linearLayoutPractice2Btn.setOnClickListener(this);

        RelativeLayoutPractice1Btn.setOnClickListener(this);
        RelativeLayoutPractice2Btn.setOnClickListener(this);

        FrameLayoutPractice1Btn.setOnClickListener(this);
        FrameLayoutPractice2Btn.setOnClickListener(this);

        ScrollLayoutPractice1Btn.setOnClickListener(this);

        CalclatorPracticeBtn.setOnClickListener(this);

        FragmentPracticeBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent intent = new Intent();

        int id = v.getId();
        switch(id) {
            case R.id.linearLayoutPractice1Btn:
                intent.setClass(MainActivity.this, LinearLayoutPractice1Activity.class);
                break;
            case R.id.linearLayoutPractice2Btn:
                intent.setClass(MainActivity.this, LinearLayoutPractice2Activity.class);
                break;
            case R.id.RelativeLayoutPractice1Btn:
                intent.setClass(MainActivity.this, RelativeLayoutPractice1Activity.class);
                break;
            case R.id.RelativeLayoutPractice2Btn:
                intent.setClass(MainActivity.this, RelativeLayoutPractice2Activity.class);
                break;
            case R.id.FrameLayoutPractice1Btn:
                intent.setClass(MainActivity.this, FrameLayoutPractice1Activity.class);
                break;
            case R.id.FrameLayoutPractice2Btn:
                intent.setClass(MainActivity.this, FrameLayoutPractice2Activity.class);
                break;
            case R.id.ScrollLayoutPractice1Btn:
                intent.setClass(MainActivity.this, ScrollLayoutPractice1Activity.class);
                break;
            case R.id.FragmentPracticeBtn:
                intent.setClass(MainActivity.this, FragmentPracticeActivity.class);
                break;
        }
        intent.setAction(Intent.ACTION_VIEW);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
