package LinkedList.Singly;

public class SLinkedList {
    private Node head;
    private Node tail;
    int count=0;


    public void add(int value){
        count ++;
        Node node=new Node(value);
        if (head==null){
            this.head=node;
        }
        if (tail!=null){
            tail.next=node;
        }
        this.tail=node;

    }


    public void getHead(){
        System.out.println(this.head.value);
    }

    public void getTail(){
        System.out.println(this.tail.value);
    }
    public void seeList(){
        int x=0;
        Node current=head;

        while (x<count){
            System.out.println(current.value);
            if (current.next!=null) {
                current = current.next;
            }
            x++;
        }
    }



    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }

        void theNext(){
            System.out.println(next.value);
        }

    }
}
