// Last updated: 7/31/2025, 2:04:55 PM
class MyLinkedList {
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

    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
        
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            if(temp==null){
                return -1;
            }
            temp=temp.next;
        }
        return temp.data;

        
    }
    
    public void addAtHead(int val) {
        Node newnode=new Node(val);
        if(head==null){
            tail=head=newnode;
            size++;
            return;

        }
        newnode.next=head;
        head=newnode;
        size++;
        
    }
    
    public void addAtTail(int val) {
        Node newnode=new Node(val);
        if(head==null){
            head=tail=newnode;
            size++;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index<0 || index>size){
            return;
        }
        
        if(index==size){
            addAtTail(val);
            return;

        }
        Node newnode=new Node(val);
        Node temp=head;
        for(int i=0;i<index-1;i++){
            if(temp==null){
                return;
            }
            temp=temp.next;
            
        }
        
        newnode.next=temp.next;
        temp.next=newnode;
        size++;

        
    }
    
    public void deleteAtIndex(int index) {
        if(head==null){
            return;
        }
        if(index==0){
            head=head.next;
            if(head==null || size==1){
                tail=null;
            }
            size--;
            return;
        }
        if(index<0 || index>=size){
            return;
        }
        

        Node temp=head;
        for(int i=0;i<index-1;i++){
            if(temp==null){
                return;
            }
            temp=temp.next;

        }
        if(temp==null){
            return;
        }
        if(temp.next==null){
            tail=temp;
            return;
        }
        temp.next=temp.next.next;
        if(index==size-1){
            tail=temp;
            
        }
        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */