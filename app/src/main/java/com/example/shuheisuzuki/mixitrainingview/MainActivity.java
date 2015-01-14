package com.example.shuheisuzuki.mixitrainingview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.crashlytics.android.Crashlytics;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import io.fabric.sdk.android.Fabric;


public class MainActivity
        extends ActionBarActivity
{
    @InjectView(R.id.linearLayoutPractice1Btn)
    Button mLinearLayoutPractice1Btn;
    @InjectView(R.id.linearLayoutPractice2Btn)
    Button mLinearLayoutPractice2Btn;
    @InjectView(R.id.RelativeLayoutPractice1Btn)
    Button mRelativeLayoutPractice1Btn;
    @InjectView(R.id.RelativeLayoutPractice2Btn)
    Button mRelativeLayoutPractice2Btn;
    @InjectView(R.id.FrameLayoutPractice1Btn)
    Button mFrameLayoutPractice1Btn;
    @InjectView(R.id.FrameLayoutPractice2Btn)
    Button mFrameLayoutPractice2Btn;
    @InjectView(R.id.ScrollLayoutPractice1Btn)
    Button mScrollLayoutPractice1Btn;
    @InjectView(R.id.CalclatorPracticeBtn)
    Button mCalclatorPracticeBtn;
    @InjectView(R.id.FragmentPracticeBtn)
    Button mFragmentPracticeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick({
            R.id.linearLayoutPractice1Btn,   R.id.linearLayoutPractice2Btn,
            R.id.RelativeLayoutPractice1Btn, R.id.RelativeLayoutPractice2Btn,
            R.id.FrameLayoutPractice1Btn,    R.id.FrameLayoutPractice2Btn,
            R.id.ScrollLayoutPractice1Btn,   R.id.CalclatorPracticeBtn,
            R.id.FragmentPracticeBtn
    })
    public void onClickButton(View v)
    {
        Intent intent = new Intent();

        int id = v.getId();
        switch (id) {
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
