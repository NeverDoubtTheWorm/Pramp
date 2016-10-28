public class Pramp {
    public int getDiffNum(int[] arr){
        int n = arr.length;
        if( arr == null || n < 1 ) {
            return 0; // 0 is not in an empty array
        }

        boolean[] foundNum = new boolean[n+1];
        
        for( int i : arr ) {
            if( i < foundNum.length ) {
                foundNum[i] = true;
            }
        }

        for( int i = 0; i < foundNum.length; i++ ) {
            if( !foundNum[i] ) {
                return i;
            }
        }

        return -1; // array holds more than n+1 unique elements
    }
}