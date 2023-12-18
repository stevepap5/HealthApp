package com.example.healthapp.ViewModels;

import android.app.Application;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.healthapp.Repository.RemoteDataSource.LoginBody;
import com.example.healthapp.Repository.RemoteDataSource.LoginResponse;
import com.example.healthapp.Repository.Repositories.LoginRepository;

public class LoginUserViewModel extends ViewModel {

    private LoginRepository loginRepository;

    public LoginUserViewModel() {
        loginRepository = new LoginRepository();
    }

    public LiveData<LoginResponse> login(LoginBody loginBody) {
        return loginRepository.loginRemote(loginBody);
    }
}
