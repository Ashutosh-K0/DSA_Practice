class Leet_2037_Minimum_Moves_Seating {
    public int minMovesToSeat(int[] seats, int[] students) {
        int sum = 0;
        int N = students.length;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<N;i++){
            sum = sum + Math.abs(seats[i]-students[i]);
        }
        return sum;
    }
}