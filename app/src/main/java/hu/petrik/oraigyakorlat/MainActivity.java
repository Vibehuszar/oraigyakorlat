package hu.petrik.oraigyakorlat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private EditText editText;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                String s2 = s.toUpperCase(Locale.ROOT);
                textView.setText(s2);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                String s2 = s.toLowerCase(Locale.ROOT);
                textView.setText(s2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int blue = random.nextInt(255);
                int green = random.nextInt(255);
                int red = random.nextInt(255);

                textView.setBackgroundColor(Color.rgb(red, blue, green));

            }
        });





    }

    private void init(){
        relativeLayout = findViewById(R.id.relativeLayout);
        editText = findViewById(R.id.editText);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        textView = findViewById(R.id.textView);


    }
}