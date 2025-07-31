// Last updated: 7/31/2025, 2:04:52 PM
class MyCircularQueue {
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
    int  size;

    public MyCircularQueue(int k) {
        size=k;
        head=null;
        tail=null;

        
    }
    
    public boolean enQueue(int value) {
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
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if(head.next==null){
            head=tail=null;
            return true;
        }
        head=head.next;
        if(isEmpty()){
            head=tail=null;
        }
        return true;

        
    }
    
    public int Front() {
        if(head==null ){
            return -1;
        }
        return head.data;


        
    }
    
    public int Rear() {
        if(tail==null){
            return -1;
        }
        return tail.data;
        
    }
    
    public boolean isEmpty() {
        return head==null;
        
    }
    
    public boolean isFull() {
        Node temp=head;
        int size1=0;
        while(temp!=null){
            size1++;
            temp=temp.next;
        }
        return size1==size;
    
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */