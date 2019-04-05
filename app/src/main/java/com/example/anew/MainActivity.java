package com.example.anew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView name, parol, email, phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)  findViewById(R.id.button);
        name = (TextView) findViewById(R.id.editText);
        parol=(TextView) findViewById(R.id.editText2);
        email=(TextView) findViewById(R.id.editText3) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().equals(""))
                    Toast.makeText(getApplicationContext(),"ism yo'q",Toast.LENGTH_LONG).show();
                else
                if (parol.getText().toString().equals(""))
                    Toast.makeText(getApplicationContext(),"parol yoq",Toast.LENGTH_LONG).show();
                if(email.getText().toString().equals(""))
                    Toast.makeText(getApplicationContext(),"email yoq",Toast.LENGTH_SHORT).show();
                else {

                    Intent intent = new Intent(getApplicationContext(), second.class);
                    startActivity(intent);
                }

            }
        });
    }

}
