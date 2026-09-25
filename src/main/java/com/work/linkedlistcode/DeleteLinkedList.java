package com.work.linkedlistcode;

class Node5{
    int data;
    Node5 next;
    Node5(int data){
        this.data=data;
    }
}
public class DeleteLinkedList {
    Node5 head=null;
    Node5 tail=null;

    void insert(int data){
        Node5 temp=new Node5(data);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
    }

    // Delete a node
    void delete(int idx){

        if (idx==0){
            head=head.next;
            return;
        }
        Node5 temp=head;
        for (int i = 1; i <idx ; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    // find the Nth Node from the end of the LL in one traversal;
    Node5 nthNode(Node5 head,int n){
        Node5 slow=head;
        Node5 fast=head;
        for (int i = 1; i <=n ; i++) {
            fast=fast.next;
        }

        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;

    }

    // delete nth node from the end
    void deleteNthNode(int n){
        Node5 slow=head;
        Node5 fast=head;
        for (int i = 1; i <=n ; i++) {
            fast=fast.next;
        }

        // If fast becomes null,
        // delete the head node
        if (fast == null) {
            head = head.next;
            return;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
    }

    void display(){
        Node5 temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DeleteLinkedList list=new DeleteLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.display();

//        list.delete(0);
//        list.display();

        Node5 q=list.nthNode(list.head,3);
        System.out.println(q.data);

        list.deleteNthNode(5);
        list.display();

    }
}
