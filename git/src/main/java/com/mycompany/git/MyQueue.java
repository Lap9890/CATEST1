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
public class MyQueue implements QuequeInterface{
    
    private ArrayList<Issues> theQueue;
public MyQueue() {
        theQueue = new ArrayList<Issues>();    
  } 

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int size() {
        return theQueue.size();
    }

    @Override
    public Object frontElement() {
       if (theQueue.size() > 0 ) {
		 return theQueue.get(0);
    }
    else {
		return null;
    }

    }

    @Override
    public void enqueue(Object element) {
        theQueue.add((Issues)element);
    }

    @Override
    public Object dequeue() {
        if (!theQueue.isEmpty()) {
            return theQueue.remove(0); 
        } else {
            return null;
        }
    }
    
    public boolean removeById(int id) {
    for (int i = 0; i < theQueue.size(); i++) {
        if (theQueue.get(i).getID() == id) {
            theQueue.remove(i);
            return true;
        }
    }
    return false;
}
    
    public String toString(){
        StringBuffer sb = new StringBuffer();
        
        
        for (Issues issue : theQueue) {
            sb.append(issue.toString()).append("\n");
        }

        if (sb.length() == 0) {
            return "No queued issues.";
        }
        
        return sb.toString();
    }
    
}
