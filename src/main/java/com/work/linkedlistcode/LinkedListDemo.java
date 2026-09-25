package com.work.linkedlistcode;

class Node {   //TODO Create the Node class
    int data;   // TODO data stores the value of the node.   ( 10 20 30 40 50 )
    Node next; // TODO next stores the reference (address) of the next node.

    Node(int data) {  // TODO This is a constructor.
        this.data = data;  //Todo  This line stores that value inside the object.
        this.next = null;   // todo Initially, the node is not connected to any other node.
    }
}

public class LinkedListDemo {  // Todo This is the main class. Execution starts from here.
    public static void main(String[] args) {    // todo Program execution starts here.
        Node head = new Node(10);   // todo  Create the first node and assign its reference to head
        Node second = new Node(20); // todo Create the second node with data 20
        Node third = new Node(30);

        head.next = second;    // todo Connect the first node to the second node  eg. 10--->20
        second.next = third;

        Node temp = head;  // todo We want to traverse the list without changing head.
        while (temp != null) {  // todo Keep running the loop until temp becomes null.
            System.out.print(temp.data + " ");  // todo Print the current node's data.
            temp = temp.next; // todo Move temp to the next node.
        }
    }
}