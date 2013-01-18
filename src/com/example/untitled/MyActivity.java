package com.example.untitled;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import repository.Logic;

public class MyActivity extends Activity {
   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void navigateToNext(View view){
        Intent intent = new Intent(this,NextActivity.class);
        Logic logic = new Logic();
        logic.getSomeData();
        startActivity(intent);
    }


}
