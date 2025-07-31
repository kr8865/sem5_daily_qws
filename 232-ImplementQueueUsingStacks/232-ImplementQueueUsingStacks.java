// Last updated: 7/31/2025, 2:06:37 PM
class MyQueue {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(st1.isEmpty()){
            st1.push(x);
            return;
        }
        while(!st1.isEmpty()){
            int x1=st1.pop();
            st2.push(x1);
        }
        st1.push(x);
        while(!st2.isEmpty()){
            int x2=st2.pop();
            st1.push(x2);
        }
        
    }
    
    public int pop() {
        int p=st1.pop();
        return p;

        
    }
    
    public int peek() {
        int k=st1.peek();
        return k;
        
    }
    
    public boolean empty() {
        
        return st1.isEmpty()&& st2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */