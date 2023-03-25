package com.example.rjany.model;

import javax.persistence.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FlightsStatus {

    private String from;

    private String time;

    private String status;

    public FlightsStatus(String from, String time, String status) {
        this.from = from;
        this.time = time;
        this.status = status;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
