// Last updated: 10/17/2025, 8:01:55 PM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                i++;
            }
            j++;
        }
        return i;
        
    }
}