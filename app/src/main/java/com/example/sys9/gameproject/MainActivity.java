package com.example.sys9.gameproject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_one,btn_two,btn_three,btn_four,btn_next;
    TextView tv_question;
    TextView points;
    int score=0;
    private Questionaire question=new Questionaire();
    private String answer;
    private int questionlength=question.questions.length;
    Random random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        random=new Random();
        btn_one=(Button)findViewById(R.id.btn1);
        btn_one.setOnClickListener(this);
        btn_two=(Button)findViewById(R.id.btn2);
        btn_two.setOnClickListener(this);
        btn_three=(Button)findViewById(R.id.btn3);
        btn_three.setOnClickListener(this);
        btn_four=(Button)findViewById(R.id.btn4);
        btn_four.setOnClickListener(this);
        btn_next=(Button)findViewById(R.id.next);
        btn_next.setOnClickListener(this);
        tv_question=(TextView)findViewById(R.id.question);
        points=(TextView) findViewById(R.id.points);
        NextQusetion(random.nextInt(questionlength));

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                if (btn_one.getText()==answer){
                    Toast.makeText(MainActivity.this,"you are correct answer",Toast.LENGTH_SHORT).show();
                    btn_one.setBackgroundColor(Color.GREEN);
                    btn_two.setBackgroundColor(Color.WHITE);
                    btn_three.setBackgroundColor(Color.WHITE);
                    btn_four.setBackgroundColor(Color.WHITE);
                    score++;
                    //NextQusetion(random.nextInt(questionlength));
                }else {
                    btn_one.setBackgroundColor(Color.RED);
                    btn_two.setBackgroundColor(Color.WHITE);
                    btn_three.setBackgroundColor(Color.WHITE);
                    btn_four.setBackgroundColor(Color.WHITE);

                }
                break;
            case R.id.btn2:
                if (btn_two.getText()==answer){
                    Toast.makeText(MainActivity.this,"you are correct answer",Toast.LENGTH_SHORT).show();
                    btn_two.setBackgroundColor(Color.GREEN);
                    btn_one.setBackgroundColor(Color.WHITE);
                    btn_three.setBackgroundColor(Color.WHITE);
                    btn_four.setBackgroundColor(Color.WHITE);
                    score++;
                    //NextQusetion(random.nextInt(questionlength));
                }else {
                    btn_two.setBackgroundColor(Color.RED);
                    btn_one.setBackgroundColor(Color.WHITE);
                    btn_three.setBackgroundColor(Color.WHITE);
                    btn_four.setBackgroundColor(Color.WHITE);
                }
                break;
            case R.id.btn3:
                if (btn_three.getText()==answer){
                    Toast.makeText(MainActivity.this,"you are correct",Toast.LENGTH_SHORT).show();
                    btn_three.setBackgroundColor(Color.GREEN);
                    btn_one.setBackgroundColor(Color.WHITE);
                    btn_two.setBackgroundColor(Color.WHITE);
                    btn_four.setBackgroundColor(Color.WHITE);
                    score++;
                    //NextQusetion(random.nextInt(questionlength));
                }else {
                    btn_three.setBackgroundColor(Color.RED);
                    btn_one.setBackgroundColor(Color.WHITE);
                    btn_two.setBackgroundColor(Color.WHITE);
                    btn_four.setBackgroundColor(Color.WHITE);

                }
                break;
            case R.id.btn4:
                if (btn_four.getText()==answer){
                    Toast.makeText(MainActivity.this,"you are correct answer",Toast.LENGTH_SHORT).show();
                    btn_four.setBackgroundColor(Color.GREEN);
                    btn_one.setBackgroundColor(Color.WHITE);
                    btn_three.setBackgroundColor(Color.WHITE);
                    btn_two.setBackgroundColor(Color.WHITE);
                    score++;
                    //NextQusetion(random.nextInt(questionlength));
                }else {
                    btn_four.setBackgroundColor(Color.RED);
                    btn_one.setBackgroundColor(Color.WHITE);
                    btn_three.setBackgroundColor(Color.WHITE);
                    btn_two.setBackgroundColor(Color.WHITE);
                }
                break;
            case R.id.next:

                NextQusetion(random.nextInt(questionlength));
                btn_one.setBackgroundColor(Color.WHITE);
                btn_three.setBackgroundColor(Color.WHITE);
                btn_two.setBackgroundColor(Color.WHITE);
                btn_four.setBackgroundColor(Color.WHITE);
                break;

        }
    }

    public void NextQusetion(int num) {
        tv_question.setText(question.getQusetion(num));
        btn_one.setText(question.getChoice1(num));
        btn_two.setText(question.getChoice2(num));
        btn_three.setText(question.getChoice3(num));
        btn_four.setText(question.getChoice4(num));
        answer=question.getCorrectAnswer(num);
        if (score==0){
            points.setText("0/5");
        }else if(score==1){
            points.setText("1/5");
        }else if(score==2){
            points.setText("2/5");
        }else if(score==3){
            points.setText("3/5");
        }else if(score==4){
            points.setText("4/5");
        }else if(score==5) {
            points.setText("5/5");
        }
    }
}



