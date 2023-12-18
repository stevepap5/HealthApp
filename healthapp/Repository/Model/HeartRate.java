package com.example.healthapp.Repository.Model;

import java.util.Date;

public class HeartRate {

    private Date date;

    private PatientId patientId;

    private int HeartRate;

    public PatientId getPatientId() {
        return patientId;
    }

    public void setPatientId(PatientId patientId) {
        this.patientId = patientId;
    }

    public int getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(int heartRate) {
        HeartRate = heartRate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
