package com.example.healthapp.Repository.Repositories;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.healthapp.Repository.RemoteDataSource.ILoginService;
import com.example.healthapp.Repository.RemoteDataSource.LoginBody;
import com.example.healthapp.Repository.RemoteDataSource.LoginResponse;
import com.example.healthapp.Repository.RemoteDataSource.RetrofitClientInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginRepository {

    private ILoginService loginService;

    public LoginRepository() {
        loginService = RetrofitClientInstance.getInstance().create(ILoginService.class);
    }

    public LiveData<LoginResponse> loginRemote(LoginBody loginBody) {
        final MutableLiveData<LoginResponse> data = new MutableLiveData<>();
        Call<LoginResponse> initiateLogin = loginService.login(loginBody);

        initiateLogin.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                if (response.code() == 200) {
                   data.setValue((LoginResponse) response.body());
                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                t.getMessage();
            }
        });
        return data;
    }
}
