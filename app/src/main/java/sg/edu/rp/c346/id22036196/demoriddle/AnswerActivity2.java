package sg.edu.rp.c346.id22036196.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer=findViewById(R.id.textView3);
        tvAnswer.setText("In second Activity");
        Intent intentReceived=getIntent();
        String questionsSelected=intentReceived.getStringExtra("Question");
        tvAnswer.setText(questionsSelected+" answer is: Gone");
    }
}