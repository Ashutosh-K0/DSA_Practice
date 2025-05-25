class Leet_2011_Operations_Value {
// LeetCode 2011: Final Value of Variable After Performing Operations
    public int finalValueAfterOperations(String[] operations) {
        int N = operations.length;
        int X = 0;
        for (int i = 0; i < N; i++) {
            if (operations[i].equals("--X") || operations[i].equals("X--")) {
                X = X - 1;
            } else if (operations[i].equals("++X") || operations[i].equals("X++")) {
                X = X + 1;
            }
        }
        return X;
    }
}
