package com.mycompany.git;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lapi
 */
public class Issues {

    private String name;
    private String status;
    private int id;
    private static int counter = 0;

    public Issues(String name) {
        counter++;
        this.id = counter;
        this.name = name;
        this.status = "not done";
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return "General Issue";
    }

    @Override
    public String toString() {
        return "Issue ID: " + id + " | Type: " + getType() +
               " | Name: " + name + " | Status: " + status;
    }
}