/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.git;

/**
 *
 * @author lapi
 */
public class TransportIssue extends Issues{
        public TransportIssue(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Transport Issue";
    }
    
}
