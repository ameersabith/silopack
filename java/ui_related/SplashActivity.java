package com.example.codemac_04i.silopack.ui_related;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.example.codemac_04i.silopack.R;

public class SplashActivity extends Activity {

    private static final String MY_PREFERENCES = "my_preferences";
    private static final String FIRST = "first";
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        Handler handler = new Handler();


        sharedPreferences = getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        boolean firstTime = sharedPreferences.getBoolean(FIRST, true);
        if (firstTime) {
            editor.putBoolean(FIRST, false);
            //For commit the changes, Use either editor.commit(); or  editor.apply();.
            editor.apply();
            Intent intent = new Intent(SplashActivity.this, BeforeMainActivity.class);
            startActivity(intent);
        } else {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, 500);
        }
    }
}
