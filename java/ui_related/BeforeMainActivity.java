package com.example.codemac_04i.silopack.ui_related;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.codemac_04i.silopack.R;

public class BeforeMainActivity extends AppCompatActivity {

    EditText edit_username,edit_password;
    Button buttonLogin,buttonSkip;
    TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_main);

        findViewsById();

        signup.setText(Html.fromHtml("<u>No account yet?<i> Create one<i><u>"));

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SignupForm.class));
            }
        });


    }
    public void functionLogin(View view)
    {
        login(view);
    }

    private void login(View view) {
        Snackbar.make(view,"Replace with login function",Snackbar.LENGTH_SHORT).show();
    }

    public void functionSkip(View view)
    {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
    public void findViewsById()
    {
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonSkip = (Button) findViewById(R.id.button_login_skip);
        edit_password = (EditText) findViewById(R.id.login_password);
        edit_username = (EditText) findViewById(R.id.login_username);
        signup = (TextView) findViewById(R.id.login_link_signup);
    }

}
