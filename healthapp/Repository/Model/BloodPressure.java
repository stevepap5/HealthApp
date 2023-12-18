package com.example.healthapp.Repository.Model;

import java.util.Date;

public class BloodPressure {

    private PatientId patientId;

    private Date date;

    private int SystolicBloodPressure;

    private int DiastolicBloodPressure;

    public PatientId getPatientId() {
        return patientId;
    }

    public void setPatientId(PatientId patientId) {
        this.patientId = patientId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSystolicBloodPressure() {
        return SystolicBloodPressure;
    }

    public void setSystolicBloodPressure(int systolicBloodPressure) {
        SystolicBloodPressure = systolicBloodPressure;
    }

    public int getDiastolicBloodPressure() {
        return DiastolicBloodPressure;
    }

    public void setDiastolicBloodPressure(int diastolicBloodPressure) {
        DiastolicBloodPressure = diastolicBloodPressure;
    }
}
