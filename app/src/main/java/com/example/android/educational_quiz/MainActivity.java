package com.example.android.educational_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox one1, two1, three1, four1;
    CheckBox five1, six1, seven1, eight1;
    EditText answer1;
    RadioButton correct1, faulty1, correct2, faulty2;
    private Button.OnClickListener get_view_button_listener = new Button.OnClickListener() {
        public void onClick(View v) {

            if ((two1.isChecked() && three1.isChecked()) && (!one1.isChecked() && !four1.isChecked()) ) {
                Toast.makeText(getApplicationContext(), "Answer of question 1 is correct", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "Answer of question 1 is faulty", Toast.LENGTH_SHORT).show();
            }
            if (Integer.parseInt(answer1.getText().toString()) == 4){
                Toast.makeText(getApplicationContext(), "Answer of question 2 is correct", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "Answer of question 2 is faulty", Toast.LENGTH_SHORT).show();
            }
            if (correct1.isChecked()){
                Toast.makeText(getApplicationContext(), "Answer of question 3 is correct", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "Answer of question 3 is faulty", Toast.LENGTH_SHORT).show();
            }
            if ((five1.isChecked() && six1.isChecked()) && (!seven1.isChecked() && !eight1.isChecked()) ) {
                Toast.makeText(getApplicationContext(), "Answer of question 4 is correct", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "Answer of question 4 is faulty", Toast.LENGTH_SHORT).show();
            }
            if (correct2.isChecked()){
                Toast.makeText(getApplicationContext(), "Answer of question 5 is correct", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "Answer of question 5 is faulty", Toast.LENGTH_SHORT).show();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one1 = (CheckBox) findViewById(R.id.one);
        two1 = (CheckBox) findViewById(R.id.two);
        three1 = (CheckBox) findViewById(R.id.three);
        four1 = (CheckBox) findViewById(R.id.four);
        answer1 = (EditText) findViewById(R.id.answer);
        correct1 = (RadioButton) findViewById(R.id.correct);
        faulty1 = (RadioButton) findViewById(R.id.faulty);
        five1 = (CheckBox) findViewById(R.id.five);
        six1 = (CheckBox) findViewById(R.id.six);
        seven1 = (CheckBox) findViewById(R.id.seven);
        eight1 = (CheckBox) findViewById(R.id.eight);
        correct2 = (RadioButton) findViewById(R.id.correct2);
        faulty2 = (RadioButton) findViewById(R.id.faulty2);

        Button get_view_button = (Button) findViewById(R.id.button1);
        get_view_button.setOnClickListener(get_view_button_listener);

    }


}
