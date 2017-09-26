package com.example.abdul_wahab.mylistproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    private static final String TAG = "MTAG";
    private EditText editUserName;
    private EditText editPassword;
    private Button btnLogin;
    private String strUserName;
    private String strPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        editUserName = (EditText) findViewById(R.id.edit_username);
        editPassword = (EditText) findViewById(R.id.edit_password);

        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strUserName = editUserName.getText().toString();
                strPassword = editPassword.getText().toString();
                if (strUserName.equals("") && strPassword.equals("")) {
                    Log.d(TAG, "if Case ");
                    Toast.makeText(LoginPage.this, "Fill both fields", Toast.LENGTH_LONG).show();
                } else if (!(strUserName.equals(strPassword))) {
                    Toast.makeText(LoginPage.this, "MisMatch", Toast.LENGTH_LONG).show();
                    Log.d(TAG, "else case ");
                } else {
                    Intent intent = new Intent(LoginPage.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
