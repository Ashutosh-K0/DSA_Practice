class Leet_657_Robot {
    // 657. Robot Return to Origin
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }

        if (x == 0 && y == 0) {
            return true;
        } else {
            return false;
        }
    }
}
