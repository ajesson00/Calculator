package com.example.anya.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/*
CALCULATOR W/ BUTTON INPUTS (NOT SCIENTIFIC)
for T02 Challenge Problem
 */

public class calc extends AppCompatActivity { //main
    static String shownum; //the numbers displayed on the screen
    static String history; //shows past operations at top of screen
    static float answer; //holds the answer

    static boolean add; //booleans hold last selected operation
    static boolean subtract;
    static boolean multiply;
    static boolean divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //initialize
        shownum = "";
        history = "";
        answer = 0;
        add = false;
        subtract = false;
        multiply = false;
        divide = false;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
    }

    //1 is entered
    public void enterOne(View view) {
        shownum += "1"; //add to strings
        history += "1";

        //write to screen
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //write to history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //2 is entered
    public void enterTwo(View view) {
        shownum += "2"; //add to strings
        history += "2";

        //write to screen
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //write to history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //3 is entered
    public void enterThree(View view) {
        shownum += "3"; //add to strings
        history += "3";

        //write to screen
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //write to history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //4 is entered
    public void enterFour(View view) {
        shownum += "4"; //add to strings
        history += "4";

        //write to screen
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //write to history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //5 is entered
    public void enterFive(View view) {
        shownum += "5"; //add to strings
        history += "5";

        //write to screen
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //write to history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //6 is entered
    public void enterSix(View view) {
        shownum += "6"; //add to strings
        history += "6";

        //write to screen
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //write to history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //7 is entered
    public void enterSeven(View view) {
        shownum += "7"; //add to strings
        history += "7";

        //write to screen
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //write to history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //8 is entered
    public void enterEight(View view) {
        shownum += "8"; //add to strings
        history += "8";

        //write to screen
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //write to history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //9 is entered
    public void enterNine(View view) {
        shownum += "9"; //add to strings
        history += "9";

        //write to screen
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //write to history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //0 is entered
    public void enterZero(View view) {
        shownum += "0"; //add to strings
        history += "0";

        //write to screen
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //write to history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //. is entered
    public void decimalpt(View view) {
        shownum += "."; //add to strings
        history += ".";

        //write to screen
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //write to history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //= is entered
    public void equals(View view) {
        //get answer
        answer = getanswer(answer);

        //truncate answer to 8 figures
        String numstring = "";
        String truncated = "";
        numstring += answer;
        for (int i = 0; i < 9 & i < numstring.length(); i++) {
            truncated += numstring.charAt(i);
        }

        answer = Float.parseFloat(truncated);

        //add to history
        history += "=";
        history += answer;

        //string = answer
        shownum = "";
        shownum += answer;

        //write to screen
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //write to history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //+ is entered
    public void addition(View view) {
        history += "+"; //add to history

        //get answer from last operation
        answer = getanswer(answer);

        add = true; //change boolean value for next operator

        //clear screen
        shownum = "";
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //write to history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //- is entered
    public void subtraction(View view) {
        history += "-"; //add to history

        //get answer
        answer = getanswer(answer);

        //set boolean value
        subtract = true;

        //clear screen
        shownum = "";
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //show history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //x is entered
    public void multiplication(View view) {
        history += "x"; //add to history

        //get answer
        answer = getanswer(answer);

        //set boolean value
        multiply = true;

        //clear screen
        shownum = "";
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //show history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    // / is entered
    public void division(View view) {
        history += "/"; //add to history

        //get answer
        answer = getanswer(answer);

        //set boolean value
        divide = true;

        //clear screen
        shownum = "";
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //show history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }

    //calculate based on most recent operation
    public float getanswer(float answer) {
        float number = 0; //return value

        //parse number on screen
        try {
            number = Float.parseFloat(shownum);
        } catch (Exception couldnotparse) {
            //number is too long
            shownum = "ERROR"; //show error
            number = 0; //reset number
            answer = 0; //reset answer
        }

        /*do appropriate operation based on second to last operator entered
        last operator entered doesn't have a corresponding second number yet
        all operations are done ASAP, ignoring order of operations, to reduce # of necessary variables
         */
        if (add) {
            number += answer;
            add = false; //reset booleans
        } else if (subtract) {
            number = answer - number;
            subtract = false;
        } else if (multiply) {
            number = answer * number;
            multiply = false;
        } else if (divide) {
            number = answer / number;
            divide = false;
        }

        return number; //return
    }

    //CLR entered
    public void clearstring(View view) {
        shownum = ""; //clear strings
        history = "";
        answer = 0; //reset answer value

        //clear screen
        setContentView(R.layout.activity_calc);
        TextView tv1 = (TextView)findViewById(R.id.display);
        tv1.setText(shownum);

        //clear history
        TextView tv2 = (TextView)findViewById(R.id.history);
        tv2.setText(history);
    }
}
