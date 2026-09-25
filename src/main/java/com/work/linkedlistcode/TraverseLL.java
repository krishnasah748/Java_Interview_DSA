package com.work.linkedlistcode;
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
    }
}
public class TraverseLL {
    Node1 head=null;
    Node1 tail=null;

    //insert node at the end
    void insert(int data){
        Node1 temp=new Node1(data);
        if(head==null){
            head=temp;
            tail=temp;
        }else {
            tail.next=temp;
            tail=temp;
        }
    }

    // insert node at the beginning
    void insertAtBegin(int data){
        Node1 temp=new Node1(data);
        if (head==null){
            head=temp;
            tail=temp;
        }else{
            temp.next=head;
            head=temp;
        }

    }

    //insert at the specific position//
    void insertAtSpecificPos(int idx,int data){
        Node1 t=new Node1(data);
        Node1 temp=head;
        if (idx < 0 || idx > size()) {
            System.out.println("Invalid position");
            return;
        }
        if (idx==size()){
            insert(data);
            return;
        }
        if (idx==0){
            insertAtBegin(data);
            return;
        }
        for (int i = 1; i <idx ; i++) {
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
    }

    //get at anywhere
    int getAt(int idx){
        Node1 temp=head;
        for (int i = 1; i <=idx ; i++) {
            temp=temp.next;
        }
        return temp.data;
    }

    //traverse list/ display list
    void display(){
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    int size(){
        Node1 temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        TraverseLL list=new TraverseLL();
        list.insert(10);
        list.insert(12);
        list.insert(14);
        list.insert(16);

        list.display();
        System.out.println();
        System.out.println(list.size());

        list.insertAtBegin(55);
        list.display();

        System.out.println();
        list.insertAtSpecificPos(2,100);
        list.display();

        System.out.println();
        System.out.println(list.tail.data);
        System.out.println(list.head.data);

        System.out.println(list.getAt(3));

    }
}