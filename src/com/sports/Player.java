package com.sports;

import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private String sport;
    private String currentStatus;

    Player(String name, String sport, String currentStatus) {
        this.name = name;
        this.sport = sport;
        this.currentStatus = currentStatus;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public String toString() {
        return name + "    " + sport + "   " + currentStatus;
    }
}

