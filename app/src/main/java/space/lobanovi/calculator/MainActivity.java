package space.lobanovi.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private int firstPeremennaya;
    private int secondPeremennaya;
    private int result;
    private String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
    }

    public void onLogicClick(View view) {

        switch (view.getId()) {
            case R.id.btn0:
                number("0");
                break;

            case R.id.btn1:
                number("1");
                break;

            case R.id.btn2:
                number("2");
                break;

            case R.id.btn3:
                number("3");
                break;

            case R.id.btn4:
                number("4");
                break;
            case R.id.btn5:
                number("5");
                break;
            case R.id.btn6:
                number("6");
                break;
            case R.id.btn7:
                number("7");
                break;
            case R.id.btn8:
                number("8");
                break;
            case R.id.btn9:
                number("9");
                break;

            case R.id.btnClear:
                textView.setText("0");
                firstPeremennaya = 0;
                secondPeremennaya = 0;
                break;

            case R.id.btnCter:
                String numberNow = textView.getText().toString();
                textView.setText(null);
                if (numberNow.length() == 1) {
                    textView.setText("0");
                } else {
                    numberNow = numberNow.substring(0, numberNow.length() - 1);
                    textView.setText(numberNow);
                    break;
                }
        }
    }

    private void number(String number) {
        if (textView.getText().toString().equals("0")) {
            textView.setText(number);
        } else {
            textView.append(number);
        }
    }

    public void creat(View view) {
        switch (view.getId()) {
            case R.id.btnPlus:
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0");
                operation = "+";
                break;

            case R.id.btnMinys:
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0");
                operation = "-";
                break;
            case R.id.btnD:
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0");
                operation = "/";
                break;
            case R.id.btnX:
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0");
                operation = "*";
                break;


            case R.id.btnRavno:
                switch (operation) {

                    case "+":
                        secondPeremennaya = Integer.parseInt(textView.getText().toString());
                        result = firstPeremennaya + secondPeremennaya;
                        textView.setText(result + "");
                        break;
                    case "-":
                        secondPeremennaya = Integer.parseInt(textView.getText().toString());
                        result = firstPeremennaya - secondPeremennaya;
                        textView.setText(result + "");
                        break;
                    case "/":
                        secondPeremennaya = Integer.parseInt(textView.getText().toString());
                        result = firstPeremennaya / secondPeremennaya;
                        textView.setText(result + "");
                        break;
                    case "*":
                        secondPeremennaya = Integer.parseInt(textView.getText().toString());
                        result = firstPeremennaya * secondPeremennaya;
                        textView.setText(result + "");
                        break;
                }
        }
    }
}