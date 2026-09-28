class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean valid = true;
        Map<Integer, Set<Character>> horizontal = new HashMap<>();
        Map<Integer, Set<Character>> vertical = new HashMap<>();
        Map<String, Set<Character>> box = new HashMap<>();
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] == '.'){
                    continue;
                }

                String squareKey = (i/3) + "," + (j/3);
                if(horizontal.computeIfAbsent(i, k-> new HashSet<>()).contains(board[i][j])||
                    vertical.computeIfAbsent(j, k-> new HashSet<>()).contains(board[i][j])||
                    box.computeIfAbsent(squareKey, k-> new HashSet<>()).contains(board[i][j])){
                    return false;
                }
            
                horizontal.get(i).add(board[i][j]);
                vertical.get(j).add(board[i][j]);
                box.get(squareKey).add(board[i][j]);
            }


        }

        return valid;
    }
}
