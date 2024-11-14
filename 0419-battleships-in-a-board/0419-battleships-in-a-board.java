class Solution {
    public int countBattleships(char[][] board) {
         int count=0;
        for (int row=0; row<board.length; row++){
            for (int column=0; column<board[0].length; column++){
                if (board[row][column]== 'X'){
                    System.out.println("Found a ship at loc: " + row + " , " + column);
                    count++;
                    sinkShip(board,row,column);
                }
            }
        }
        return count; 
    }
    
    public static void sinkShip(char[][] board, int row, int column){
        //System.out.println("Sinking the found ship");
        board[row][column]='.';
        for (int r=row+1; r < board.length; r++){ // down direction
          if (board[r][column]=='X'){
              //System.out.println("Sinking the ship at " + r + " and "+ column);
              board[r][column]='.';
          }
          else{
              //System.out.println("Breaking outo f the loop");
              break;
          }
        }
        
        for (int c=column+1; c < board[0].length; c++){ // left direction
          if (board[row][c]=='X'){
              //System.out.println("Sinking the ship at " + row + " and "+ c);
              board[row][c]='.';
          }
          else{
              //System.out.println("Breaking outo f the loop");
              break;
          }
        }
    
}
}