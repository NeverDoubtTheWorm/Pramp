public class Pramp {
   public static void spiralPrint(int[][] M) {
      if( M == null || M.length == 0 || M[0] == null || M[0].length == 0) {
         return;
      }
      int lastRow = M.length -1;
      int lastCol = M[0].length -1;
      
      int frstRow = 0;
      int frstCol = 0;
      
      StringBuilder sb = new StringBuilder(); 
      
      while ( frstCol <= lastCol && frstRow <= lastRow ) {
         for( int j = frstCol; j <= lastCol; j++ ) {
            // Right
            sb.append( M[frstRow][j] );
            sb.append( " " );
         }
         frstRow++;

         for( int i = frstRow; i <= lastRow; i++ ) {
            // Down
            sb.append( M[i][lastCol] );
            sb.append( " " );
         }
         lastCol--;

         for( int j = lastCol; j >= frstCol; j-- ) {
            // Left
            sb.append( M[lastRow][j] );
            sb.append( " " );
         }
         lastRow--;

         for( int i = lastRow; i >= frstRow; i-- ) {
            // Up
            sb.append( M[i][frstCol] );
            sb.append( " " );
         }
         frstCol++;
      }
      
      System.out.println( sb.toString() );
   }
   public static void main(String []args){
      int[][] arr = {{ 1, 2, 3, 4, 5},
                     { 6, 7, 8, 9,10},
                     {11,12,13,14,15},
                     {16,17,18,19,20} };
      spiralPrint(arr);
   }
}