package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int numbers = 0;
    private TextView textCounter;
    private String indication;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        }

    private void initView() {
        textCounter = findViewById(R.id.textView1);
        initButton1ClickListener();
        initButton2ClickListener();
        initButton3ClickListener();
        initButton4ClickListener();
        initButton5ClickListener();
        initButton6ClickListener();
        initButton7ClickListener();
        initButton8ClickListener();
        initButton9ClickListener();
        initButton0ClickListener();
        initButtonPlusClickListener();
        initButtonMinusClickListener();
        initButtonDivisionClickListener();
        initButtonMultiplyClickListener();
        initButtonResultClickListener();
        initButtonPointClickListener();
    }

    private void initButtonPlusClickListener() {
        Button buttonPlus = findViewById(R.id.button_plus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indication = "+";
                setTextCounterIndi(textCounter,indication);
            }
        });
    }

    private void initButtonMinusClickListener() {
        Button buttonMinus = findViewById(R.id.button_minus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indication = "-";
                setTextCounterIndi(textCounter,indication);
            }
        });
    }

    private void initButtonDivisionClickListener() {
        Button buttonDivision = findViewById(R.id.button_division);
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indication = "/";
                setTextCounterIndi(textCounter,indication);
            }
        });
    }

    private void initButtonMultiplyClickListener() {
        Button buttonMultiply = findViewById(R.id.button_multiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indication = "*";
                setTextCounterIndi(textCounter,indication);
            }
        });
    }

    private void initButtonResultClickListener() {
        Button buttonResult = findViewById(R.id.button_result);
        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indication = "=";
                setTextCounterIndi(textCounter,indication);
            }
        });
    }

    private void initButtonPointClickListener() {
        Button buttonPoint = findViewById(R.id.button_point);
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indication = ".";
                setTextCounterIndi(textCounter,indication);
            }
        });
    }


    private void setTextCounterIndi(TextView textCounter, String indication) {
        textCounter.setText (String.format(Locale.getDefault(), "%s",indication));
    }


    private void initButton1ClickListener() {
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers = +1;
                setTextCounter(textCounter, numbers);
            }
        });
    }

    private void initButton2ClickListener() {
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers = +2;
                setTextCounter(textCounter, numbers);
            }
        });
    }

    private void initButton3ClickListener() {
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers = +3;
                setTextCounter(textCounter, numbers);
            }
        });
    }

    private void initButton4ClickListener() {
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers = +4;
                setTextCounter(textCounter, numbers);
            }
        });
    }

    private void initButton5ClickListener() {
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers = +5;
                setTextCounter(textCounter, numbers);
            }
        });
    }

    private void initButton6ClickListener() {
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers = +6;
                setTextCounter(textCounter, numbers);
            }
        });
    }

    private void initButton7ClickListener() {
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers = +7;
                setTextCounter(textCounter, numbers);
            }
        });
    }

    private void initButton8ClickListener() {
        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers = +8;
                setTextCounter(textCounter, numbers);
            }
        });
    }

    private void initButton9ClickListener() {
        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers = +9;
                setTextCounter(textCounter, numbers);
            }
        });
    }

    private void initButton0ClickListener() {
        Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers = 0;
                setTextCounter(textCounter, numbers);
            }
        });
    }


    private void setTextCounter(TextView textCounter, int numbers) {
    textCounter.setText (String.format(Locale.getDefault(), "%d",numbers));
    }


}