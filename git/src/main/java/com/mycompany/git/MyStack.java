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
public class MyStack implements StackInterface {

    private ArrayList<String> theStack;

    public MyStack() {
        theStack = new ArrayList<>();
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
        theStack.add((String) item);
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            return null;
        }

        return theStack.remove(theStack.size() - 1);
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }

        return theStack.get(theStack.size() - 1);
    }

    @Override
    public int size() {
        return theStack.size();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = theStack.size() - 1; i >= 0; i--) {
            sb.append(theStack.get(i)).append("\n");
        }

        if (sb.length() == 0) {
            return "No actions in history.";
        }

        return sb.toString();
    }
}