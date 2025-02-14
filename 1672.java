class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        //persn=row, acnt=col
        for(int persn=0; persn<accounts.length; persn++){
            //when you start a new col, take new sum that row
            int sum=0;
            for(int acnt=0; acnt<accounts[persn].length; acnt++){
                sum+= accounts[persn][acnt];
            }
            //now we have some of one person welth
            if(sum>ans){
                ans=sum;
            }

        }
        return ans;
       
    }
}