class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Set<Character> row=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                else if(!row.add(board[i][j])) return false;
            }
        }
        for(int i=0;i<9;i++){
            Set<Character> col=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.')continue;
                else if(!col.add(board[j][i]))return false;
            }
        }
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<>();
            for(int j=i/3*3;j<i/3*3+3;j++){
                
                for(int k=i%3*3;k<i%3*3+3;k++){
                    if(board[j][k]=='.')continue;
                    else if(!set.add(board[j][k]))return false;
                }
            }
        }
        return true;
    }
}
