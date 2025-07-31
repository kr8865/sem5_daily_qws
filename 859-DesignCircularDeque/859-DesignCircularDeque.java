// Last updated: 7/31/2025, 2:04:54 PM
class MyCircularDeque {
    class Node{
        int data;
        Node next;
        Node(int val){
            this.data=val;
            this.next=null;
        }
    }
    Node head;
    Node tail;
    int size;

    public MyCircularDeque(int k) {
        head=null;
        tail=null;
        size=k;
        
    }
    
    public boolean insertFront(int value) {
        Node newnode=new Node(value);
        if(isEmpty()){
            head=tail=newnode;
            return true;
        }
        if(isFull()){
            return false;
        }
        newnode.next=head;
        head=newnode;
        return true;
        
    }
    
    public boolean insertLast(int value) {
        Node newnode=new Node(value);
        if(isEmpty()){
            head=tail=newnode;
            return true;
        }
        if(isFull()){
            return false;
        }
        tail.next=newnode;
        tail=newnode;
        return true;
        
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        if(head.next==null){
            head=tail=null;
            return true;
        }
        head=head.next;
        return true;
        
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        if(head.next==null){
            head=tail=null;
            return true;
        }
        Node temp=head;//1
        while(temp.next.next!=null){
            temp=temp.next;//2
        }
        temp.next=null;
        tail=temp;
        return true;

        
    }
    
    public int getFront() {
        if(head==null){
            return -1;
        }
        return head.data;
        
    }
    
    public int getRear() {
        if(tail==null){
            return -1;
        }
        return tail.data;
        
    }
    
    public boolean isEmpty() {
        return head==null;
        
    }
    
    public boolean isFull() {
        int s=0;
        Node temp=head;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        return s==size;
        
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */