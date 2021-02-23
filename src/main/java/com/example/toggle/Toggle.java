package com.example.toggle;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity// This tells Hibernate to make a table out of this class
public class Toggle {
    @Id
    private Integer id;

    private boolean status;

    public Toggle() {
        id = 1;
        status = false;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString()
    {
        return status ? "On" : "Off";
    }
}