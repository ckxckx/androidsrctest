package com.puck.babymobile.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("I am here");
        Log.d("MyApp","I am here");
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.login_view1);
        Log.d("ckx","jieshu???");
//        CkxShowhand.display();

        ///
    };

    public void ckxclickme(View view)
    {

        System.out.println("xxxxxxxxxx");
        CkxShowhand.display();
        CkxShowhand.blue();
        CkxShowhand.binded();
    }
}
