public class Pramp {
    public static int[] getAoAP(int[] arr){
        if( arr == null || arr.length == 0) {
            return null;
        }
        int n = arr.length;
        int[] result = new int[n];
        result[0] = 1;
        for(int i = 1; i < n; i++) {
            result[i] = arr[i-1] * result[i-1];
        }
        int product = 1;
        for(int i = n-2; i >= 0; i--) {
            product *= arr[i+1];
            result[i] *= product;
        }

        return result;
    }

    public static void main(String []args){
        int[] arr = {1, 2, 3, 4, 5};
        arr = getAoAP(arr);
        for( int i : arr ) {
            System.out.println( i );
        }
    }
}