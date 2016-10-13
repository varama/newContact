package com.example.mac06.contactapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }











    public void getData(View view) {
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivityForResult(intent,2);
    }








    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==2||resultCode==RESULT_OK){


            String name = data.getStringExtra("name");
            String surname = data.getStringExtra("surname");
            int age = data.getIntExtra("age",0);

            String fm = data.getStringExtra("fm");

            Log.i("Result1",name);

            ((Button)findViewById(R.id.button)).setVisibility(View.GONE);

            TextView info = (TextView)findViewById(R.id.info);
            info.setText(name+"\n"+surname+"\n"+age+"\n"+fm.toUpperCase());
            //Toast.makeText(this,(String)data.getStringExtra("name"),Toast.LENGTH_LONG).show();

        }
    }
}
