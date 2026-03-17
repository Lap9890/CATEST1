package com.mycompany.git;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author lapi
 */
public interface StackInterface {
    public boolean isEmpty();
    public boolean isFull();
    public void push(Object item);
    public Object pop();
    public Object peek();
    public int size();
}
