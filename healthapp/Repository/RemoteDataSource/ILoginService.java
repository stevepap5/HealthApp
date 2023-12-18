package com.example.healthapp.Repository.RemoteDataSource;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ILoginService {
    @Headers({
            "API_KEY: 7mJ5Ckgu7duD5lTdLGFRkfcHreY8f6CFQqGlcRVjwHjFWjEdIzBNd3HFlozQAcyHFfxngRoRVquxdaYwL6CLLBFJeu6btl5fbRysWPMfF3GU9wj7ZZUexijWkjPs5uc1",
    })
    @POST("/login/")
    Call<LoginResponse> login(@Body LoginBody loginBody);
}
