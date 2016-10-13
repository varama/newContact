package com.example.mac06.contactapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.util.Log;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {


    private String fm="m";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.pass).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();


                Log.i("Result", String.valueOf(((EditText)findViewById(R.id.username)).getText()));
                intent.putExtra("name",((EditText)findViewById(R.id.username)).getText().toString());

                intent.putExtra("surname",((EditText)findViewById(R.id.surname)).getText().toString());

                intent.putExtra("age",Integer.valueOf(((EditText)findViewById(R.id.age)).getText().toString()));

                intent.putExtra("fm",fm);

                setResult(RESULT_OK,intent);

                finish();
            }
        });

    }

    public void fffff(View view) {
        fm="f";
    }

    public void mmmmm(View view) {
        fm="m";
    }

}
