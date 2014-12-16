package com.example.shuheisuzuki.mixitrainingview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private Button linearLayoutPractice1Btn, linearLayoutPractice2Btn,
            RelativeLayoutPractice1Btn, RelativeLayoutPractice2Btn,
            FrameLayoutPractice1Btn, FrameLayoutPractice2Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayoutPractice1Btn = (Button) findViewById(R.id.linearLayoutPractice1Btn);
        linearLayoutPractice2Btn = (Button) findViewById(R.id.linearLayoutPractice2Btn);

        RelativeLayoutPractice1Btn = (Button) findViewById(R.id.RelativeLayoutPractice1Btn);
        RelativeLayoutPractice2Btn = (Button) findViewById(R.id.RelativeLayoutPractice2Btn);

        FrameLayoutPractice1Btn = (Button) findViewById(R.id.FrameLayoutPractice1Btn);
        FrameLayoutPractice2Btn = (Button) findViewById(R.id.FrameLayoutPractice2Btn);

        linearLayoutPractice1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LinearLayoutPractice1Activity.class);
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });

        linearLayoutPractice2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LinearLayoutPractice2Activity.class);
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });

        RelativeLayoutPractice1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RelativeLayoutPractice1Activity.class);
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });

        RelativeLayoutPractice2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RelativeLayoutPractice2Activity.class);
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });

        FrameLayoutPractice1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FrameLayoutPractice1Activity.class);
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });
        FrameLayoutPractice2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FrameLayoutPractice2Activity.class);
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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
