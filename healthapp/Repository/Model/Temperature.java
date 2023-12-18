package com.example.healthapp.Repository.Model;

import java.util.Date;

public class Temperature {

    private PatientId patientId;

    private Date date;

    private double temperature;

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

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
