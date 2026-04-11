public class _134_leetcode {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int remgas=0;
        int ans=0;
        for(int i=0;i<gas.length;i++){
            total+=(gas[i]-cost[i]);
            remgas+=(gas[i]-cost[i]);
            if(remgas<0){
                remgas=0;
                ans=i+1;
            }
        }
        if(total>=0){
            return ans;
        }else{
            return -1;
        }
    }
}
