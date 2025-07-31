// Last updated: 7/31/2025, 2:05:24 PM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0;
        int t=flowerbed.length-1;
        if(n==0){
            return true;
        }
        if(t==0){
            if(flowerbed[0]==0){
                return true;
            }
            return false;
        }
        while(i<=t){
            if(i==0 && i!=t ){
                if(flowerbed[i]==0 && flowerbed[i+1]!=1){
                    flowerbed[i]=1;
                    n--;
                }
            }
            else if(flowerbed[i]==0 && i!=t){
                if(flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
                flowerbed[i]=1;
                n--;
                }
            }
            else if(i==t){
                if(flowerbed[i]==0 && flowerbed[i-1]==0){
                    n--;
                }
            }
            i++;
        }
        if(n<=0){
            return true;
        }
        return false;       
    }
}