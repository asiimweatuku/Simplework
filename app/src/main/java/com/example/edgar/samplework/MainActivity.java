package com.example.edgar.samplework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final EditText edt1 = (EditText)findViewById(R.id.editText);
        final EditText edt2 = (EditText)findViewById(R.id.editText2);
        final EditText ed3 = (EditText)findViewById(R.id.editText3);
        final TextView txt1 = (TextView)findViewById(R.id.textView4);
        Button btn=(Button)findViewById(R.id.clickMe);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String one=edt1.getText().toString();
                String two = edt2.getText().toString();
                String four = ed3.getText().toString();
                String three = one+" "+two+" "+four;
                txt1.setText(three);



            }
        });



    }}
