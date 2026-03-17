package com.mycompany.git;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lapi
 */
public class Node {
    
    private Object element;
    private Node next;
    

    public Node(Object data, Node nextNode) {

        element = data;
        next = nextNode;
    }

    public Object getElement() {
        return element;
    }

    public Node getNext() {
        return next;

    }

    public void setElement(Object data) {
        element = data;
    }

    public void setNext(Node nextNode) {
        next = nextNode;
    }


    
    
}
