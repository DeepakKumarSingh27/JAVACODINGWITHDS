package KSirDataStructure.Assignment10;
public class WordSearch {
    public static void main(String[] args) {
        String[][] strArray = {
                {"A","B","C","E"},
                {"S","F","C","S"},
                {"A","D","E","E"}
        };
        String word = "ABCCED";
        char[][] charArray = new char[strArray.length][strArray[0].length];
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                  charArray[i][j] = strArray[i][j].charAt(0);
            }
        }
        System.out.println(exist(charArray,word));
    }
    public static boolean exist(char[][] board, String word) {
        int r = board.length,c=board[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (word.charAt(0)==board[i][j]&&search(board,i,j,word,0));
            }
        }
        return true;
    }
    public static boolean search(char[][] board,int i,int j,String word,int idx){
        if (idx==word.length()) return true;
        if (i>0&&board[i-1][j]==word.charAt(idx+1)&&search(board,i-1,j,word,idx+1)) return true;
        if (j>0 && board[i][j-1]==word.charAt(idx+1)&&search(board,i,j-1,word,idx+1));
        if (i<board.length-1&&board[i+1][j]==word.charAt(idx+1)&&search(board,i+1,j,word,idx+1))return true;
        if (j<board[0].length-1&&board[i][j+1]==word.charAt(idx+1)&&search(board,i,j+1,word,idx+1)) return true;
        board[i][j]+=65;
        return false;


    }
}
/*
String[] strArray = {"Hello", "World"};
char[][] charArray = new char[strArray.length][];
for (int i = 0; i < strArray.length; i++) {
    charArray[i] = strArray[i].toCharArray();
}

 */