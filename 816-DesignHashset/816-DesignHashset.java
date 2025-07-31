// Last updated: 7/31/2025, 2:04:58 PM
class MyHashSet {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        
        }
    }
Node head;
   Node tail;

    public MyHashSet() {
        head=null;
        tail=null;
        
    }
    
    public void add(int key) {
        if(contains(key)){
            return;
        }
        Node newnode=new Node(key);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        
    }
    
    public void remove(int key) {
        Node prev=null;
        if(head==null){
            return;
        }
        if(head.data==key){
            head=head.next;
            if(head==null){
                tail=null;
                return;
            }
            

        }
        Node temp=head;
        while(temp!=null && temp.data!=key){
            prev=temp;

            temp=temp.next;
        }
        if(temp==null){
            return;
        }
        prev.next=temp.next;
        if(temp==tail){
            tail=prev;
        }

        
    }
    
    public boolean contains(int key) {
        Node temp=head;
        
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */