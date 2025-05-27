class Leet_2894_POTD_sum_diff {
    public int differenceOfSums(int n, int m) {
        int num_1 = 0;
        int num_2 = 0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                num_1+=i;
            }
            if(i%m==0){
                num_2+=i;
            }
        }
        return num_1-num_2;
    }
}
