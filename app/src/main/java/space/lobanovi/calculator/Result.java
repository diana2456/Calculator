package space.lobanovi.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        text =(TextView) findViewById(R.id.text);
     text.setText(DemoClass.message);
     onStop();
    }

    @Override
    protected void onStop() {
        Button button = findViewById(R.id.button);
        button.setOnClickListener(View ->{
        Intent intent = new Intent(this, Result.class);
        startActivity(intent);
        finish();
        super.onStop();
    });
        }
    }

