package com.example.healthapp.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.healthapp.R;
import com.example.healthapp.Repository.RemoteDataSource.LoginBody;
import com.example.healthapp.Repository.RemoteDataSource.LoginResponse;
import com.example.healthapp.ViewModels.LoginUserViewModel;

public class LoginUserActivity extends AppCompatActivity {

    private EditText userName, password;
    private Button login, signUpNewUser;
    private CheckBox rememberMe;
    private LoginUserViewModel loginUserViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_user_activity);

        userName = findViewById(R.id.usernameEdit);
        password = findViewById(R.id.passwordUserEdit);
        login = findViewById(R.id.loginButton);
        signUpNewUser = findViewById(R.id.signUpButtonXml);
        rememberMe = findViewById(R.id.rememberUserPassword);

        loginUserViewModel = new ViewModelProvider(this).get(LoginUserViewModel.class);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (loginUserViewModel.login(new LoginBody(userName.getText().toString(), password.getText().toString())) != null) {
                    Log.v("SOS", loginUserViewModel.login(new LoginBody(userName.getText().toString(), password.getText().toString())).toString());

                    Intent intent = new Intent(LoginUserActivity.this, AddDetailsActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}