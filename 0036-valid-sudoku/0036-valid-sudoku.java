class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> seen = new HashSet<>();

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                char current = board[i][j];

                if(current == '.') continue;

                if(!seen.add(current)) {
                    return false;
                }
            }

            seen.clear();
        }

        for(int i = 0; i < board[0].length; i++) {
            for(int j = 0; j < board.length; j++) {
                char current = board[j][i];

                if(current == '.') continue;

                if(!seen.add(current)) {
                    return false;
                }
            }

            seen.clear();
        }

        for(int boxRow = 0; boxRow < 3; boxRow++) {
            for(int boxCol = 0; boxCol < 3; boxCol++) {
                Set<Character> seen1 = new HashSet<>();

                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        char current = board[boxRow * 3 + i][boxCol * 3 + j];
                        if(current == '.') continue;

                        if(!seen1.add(current)) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}