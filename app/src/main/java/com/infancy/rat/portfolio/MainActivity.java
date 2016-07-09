package com.infancy.rat.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button) Button button;
    @BindView(R.id.button2) Button button2;
    @BindView(R.id.button3) Button button3;
    @BindView(R.id.button4) Button button4;
    @BindView(R.id.button5) Button button5;
    @BindView(R.id.button6) Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    void click_1(){
        Toast.makeText(this,button.getText(),Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button2)
    void click_2(){
        Toast.makeText(this,button2.getText(),Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button3)
    void click_3(){
        Toast.makeText(this,button3.getText(),Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button4)
    void click_4(){
        Toast.makeText(this,button4.getText(),Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button5)
    void click_5(){
        Toast.makeText(this,button5.getText(),Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button6)
    void click_6(){
        Toast.makeText(this,button6.getText(),Toast.LENGTH_SHORT).show();
    }



}
