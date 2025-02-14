class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num :nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    boolean even(int num){
        int noofDigits=digit(num);
        return noofDigits%2==0;
    }
    int digit(int num){
        if(num<0){
            num*=-1;
        }
        if(num==0){
            return 1;
        }
        int c=0;
        while(num>0){
            c++;
            num/=10;
        }
        return c;

    }
     /*here we can use ,it is more efficient , reduces time complexity cause no need to iterarte throw whole loop
        static int digit(int num){
            if(num<0){
                num*=-1;
            }
            return (int)(Math.log10(num))+1;
        } */
}