package com.example.healthapp.Repository.RemoteDataSource;

import com.example.healthapp.Repository.Model.BloodPressure;
import com.example.healthapp.Repository.Model.HeartRate;
import com.example.healthapp.Repository.Model.Temperature;

public class GetPatientDataResponse {

    private HeartRate heartRate;

    private BloodPressure bloodPressure;

    private Temperature temperature;

    public HeartRate getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(HeartRate heartRate) {
        this.heartRate = heartRate;
    }

    public BloodPressure getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(BloodPressure bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }
}
