import java.util.*;
public class Pramp {
    public static boolean sudokuSolve(int[][] board){
        if( board == null || board.length != 0 || board[0] == null || board[0].length != 9) {
            throw new illegalArgumentException();
        }

        Set[] rows = new HashSet[9];
        Set[] cols = new HashSet[9];
        Set[] m3x3 = new HashSet[9];
        for( int i = 0; i < 9; i++) {
            rows[i] = new HashSet<Integer>();
            cols[i] = new HashSet<Integer>();
            m3x3[i] = new HashSet<Integer>();
        }

        int value;
        int grid;
        for( int i = 0; i < 9; i++ ) {
            for( int j = 0; j < 9; j++ ) {
                value = board[i][j];
                if( value == 0 ) {
                    continue;
                }
                grid = get3x3Grid(i,j);
                if( rows[i].contains( value ) || 
                    cols[j].contains( value ) || 
                    m3x3[grid].contains( value ) ) {
                    return false;
                }
                rows[i].add( value );
                cols[j].add( value );
                m3x3[grid].add( value );
            }
        }

        Set<Integer> legalValues = new HashSet<>();
        for(int i = 1; i <= 9; i++) {
            legalValues.add(i);
        }
        Set<Integer> tempSet;// = new HashSet<>();

        for( int i = 0; i < 9; i++ ) {
            for( int j = 0; j < 9; j++ ) {
                value = board[i][j];
                if( value != 0 ) {
                    continue;
                }
                grid = get3x3Grid(i,j);
                tempSet = new HashSet<>();
                tempSet.addAll(legalValues);
                tempSet.removeAll(rows[i]);
                tempSet.removeAll(cols[j]);
                tempSet.removeAll(m3x3[grid]);
                if( tempSet.size() == 0 ) {
                    return false;
                }
            }
        }


        return true;;
    }

    public static int get3x3Grid(int i; int j) {
        int row = i / 3;
        int col = j / 3;
        return 3 * row + col;
    }

    public static void main(String []args){
        System.out.println("");
    }
}