package com.work.linkedlistcode;

class Nodes {
    int data;
    Nodes next;

    Nodes(int data) {
        this.data = data;
    }
}

public class CreationLL {
    public static void main(String[] args) {
        // 10  40 70
        Nodes head = new Nodes(10);
        Nodes second = new Nodes(40);
        Nodes third = new Nodes(70);

        head.next = second;  // 10 -> 40  70
        second.next = third; // 10-> 40 -> 70

        System.out.println(head.next.data);  //40 print hoga...

        Nodes temp = head;  // temp pointing to a ...
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}