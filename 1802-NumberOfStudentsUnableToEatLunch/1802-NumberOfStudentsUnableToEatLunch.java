// Last updated: 7/31/2025, 2:04:00 PM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=students.length;
        Stack<Integer> st=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=n-1;i>=0;i--){
            st.push(sandwiches[i]);//stack//1010
        }
        for(int i=0;i<n;i++){
            q.add(students[i]);// 1 1 0 0
        }
        int count=0;
        while (!q.isEmpty() && count < q.size()){
            if(q.peek()==st.peek()){ //1!=0
                q.remove();
                st.pop();
                count=0;
            }
            else{
                int d=q.remove();
                q.add(d);
                count++;
            }

        }
        return st.size();
        
    }
}