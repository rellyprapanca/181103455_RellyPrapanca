package com.bw.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String username ="relly";
    String password = "relly";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtUser = findViewById(R.id.txtUser);
        EditText txtPassword = findViewById(R.id.txtPassword);
        Button Login = findViewById(R.id.Login);

        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(txtUser.getText().toString().equalsIgnoreCase(username)&& txtPassword.getText().toString().equalsIgnoreCase(password)){
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
                }else {
                    Toast.makeText(MainActivity.this, "Username/Password", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}