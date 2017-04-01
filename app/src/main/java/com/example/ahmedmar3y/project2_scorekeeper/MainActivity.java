package com.example.ahmedmar3y.project2_scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {





    TextView p1,p2,f1,f2;
    Button s1,s2,res;
    public int point1=0,point2=0;
    public int foul1=0,foul2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1=(TextView) findViewById(R.id.point1);
        p2=(TextView) findViewById(R.id.point2);
        f1=(TextView) findViewById(R.id.foul1);
        f2=(TextView) findViewById(R.id.foul2);
s1=(Button)findViewById(R.id.score1);
        s2=(Button)findViewById(R.id.score2);
        res=(Button)findViewById(R.id.rest);


    }

    public void display_Point1(int number){
        p1.setText(number+"");
    }
    public void display_Point2(int number){
        p2.setText(number+"");
    }

    public void score1_action(View v){
        point1+=3;
        display_Point1(point1);

    }
    public void score2_action(View v){

        point2+=3;
        display_Point2(point2);

    }
public void reset_action(View view){

    if(point1>point2){
        Toast.makeText(this, getString(R.string.Team1),Toast.LENGTH_LONG).show();


    }else if(point1<point2){        Toast.makeText(this,getString(R.string.Team2),Toast.LENGTH_LONG).show();
    }else
    {
        Toast.makeText(this,getString(R.string.draw),Toast.LENGTH_LONG).show();

    }



    point1=0;
    point2=0;
    foul1=0;
    foul2=0;
    display_Point1(point1);
    display_Point2(point2);
    display_foul1(foul1);
    display_foul2(foul2);
    Toast.makeText(this,"Done ....",Toast.LENGTH_LONG).show();


}
    public void f1_action(View v){
        foul1+=1;
        display_foul1(foul1);


    }
    public void f2_action(View v){
foul2+=1;
        display_foul2(foul2);


    }

    public void display_foul1(int number){
        f1.setText(""+number);


    }

    public void display_foul2(int number){

        f2.setText(""+number);


    }
}
