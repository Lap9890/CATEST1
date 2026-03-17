package com.mycompany.git;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lapi
 */
public class SLL {
     private Node head;

    public SLL() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data, head);
        head = newNode;
    }

    public void addLast(Object data) {
        Node newNode = new Node(data, null);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
    }

    public int size() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.getNext();
        }

        return count;
    }

    public Node getHead() {
        return head;
    }

    public Issues findById(int id) {
        Node current = head;

        while (current != null) {
            Issues issue = (Issues) current.getElement();

            if (issue.getID() == id) {
                return issue;
            }

            current = current.getNext();
        }

        return null;
    }

    public boolean updateIssueStatus(int id, String newStatus) {
        Issues issue = findById(id);

        if (issue != null) {
            issue.setStatus(newStatus);
            return true;
        }

        return false;
    }

    public boolean deleteById(int id) {
        if (head == null) {
            return false;
        }

        Issues firstIssue = (Issues) head.getElement();

        if (firstIssue.getID() == id) {
            head = head.getNext();
            return true;
        }

        Node current = head;

        while (current.getNext() != null) {
            Issues nextIssue = (Issues) current.getNext().getElement();

            if (nextIssue.getID() == id) {
                current.setNext(current.getNext().getNext());
                return true;
            }

            current = current.getNext();
        }

        return false;
    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

    public String toDisplayString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;

        while (current != null) {
            sb.append(current.getElement().toString()).append("\n");
            current = current.getNext();
        }

        if (sb.length() == 0) {
            return "No issues available.";
        }

        return sb.toString();
    }

}
