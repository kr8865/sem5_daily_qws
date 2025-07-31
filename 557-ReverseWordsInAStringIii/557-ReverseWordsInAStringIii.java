// Last updated: 7/31/2025, 2:05:28 PM
class Solution {
    public String reverseWords(String s) {
        int start=0;
        int end=0;
        char[] arr=s.toCharArray();
        while(start<arr.length){
            while(end<arr.length && arr[end]!=' '){
                end++;
            }
            reverse(start,end-1,arr);
            start=end+1;
            end=start;
        }
        return new String(arr);
    }
    public static void reverse(int st,int en,char[] arr){
        while(st<en){
            char temp=arr[st];
            arr[st]=arr[en];
            arr[en]=temp;
            st++;
            en--;
        }
        
    }
}