class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n= customers.length;
        long waittime=0;
        int tottime=0; 
        
        for(int i=0; i<n; i++){
            int arrtime= customers[i][0];
            int pretime= customers[i][1];
            tottime=Math.max(tottime,arrtime)+pretime;
            waittime+=(tottime-arrtime);
        }
        return (double)waittime/n;    
        }
}