package com.mycompany.git;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lapi
 */
public class MyStack implements StackInterface{
    private ArrayList<String> theStack;
    
    public MyStack(){
     theStack = new ArrayList <String>();
    }
    @Override
    public boolean isEmpty() {
       return theStack.isEmpty();
    }

    @Override
    public boolean isFull() {
       return false;
    }

    @Override
    public void push(Object item) {
       theStack.add(0,(String)item);
    }

    @Override
    public Object pop() {
        if(!theStack.isEmpty()){
            return theStack.remove(0);
        }
        else{
            return null;
        }
    }

    @Override
    public Object peek() {
        if(!theStack.isEmpty()){
            return theStack.get(0);
        }
        else{
            return null;
        }
    }

    @Override
    public int size() {
        return theStack.size();
    }
}
