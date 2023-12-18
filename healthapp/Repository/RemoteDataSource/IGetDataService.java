package com.example.healthapp.Repository.RemoteDataSource;

import retrofit2.Call;
import retrofit2.http.Query;

public interface IGetDataService {

    Call<GetPatientDataResponse> getPatientData(@Query("API_KEY") String apiKey);
}
