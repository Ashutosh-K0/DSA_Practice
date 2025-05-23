class Striver_Lec_4_Divisors {
    public static void main(String[] args) {
        Striver_Lec_4_Divisors obj = new Striver_Lec_4_Divisors();
        int n = 12;
        int[] result = obj.divisors(n);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    public int[] divisors(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }

        int[] arr = new int[count];
        int index = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                arr[index++] = i;
            }
        }
        return arr;
    }
}
