// Last updated: 7/31/2025, 2:07:11 PM
class MinStack {
    List<Integer> stack;
    List<Integer> min;
    int size;

    public MinStack() {
        stack=new ArrayList<>();
        size=-1;
        min=new ArrayList<>();
    }
    
    public void push(int val) {
        if(size==-1){
            min.add(val);
        }
        else{
            min.add(min.get(size)<val?min.get(size):val);
        }
        stack.add(val);
        size++;
    }
    
    public void pop() {
        stack.remove(size);
        min.remove(size);
        size--;
    }
    
    public int top() {
        return stack.get(size);
    }
    
    public int getMin() {
        return min.get(size);
    }
}