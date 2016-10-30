import java.util.HashMap;
public class Pramp {
    public static String getSmallestSubString(String str, char[] arr){
        if( arr == null || str == null || 
            str.length() == 0 || arr.length > str.length()) {
            return null;
        }

        String result = null;

        HashMap<Character, Integer> map = new HashMap<>();

        for( char c : arr ) {
            map.put( c, 0);
        }

        int head = 0;
        int charsToFind=arr.length;
        char c;
        int stringLength;

        for( int i = 0; i < str.length(); i++ ) {
            c = str.charAt(i);
            if( map.containsKey( c ) ) {
                if( map.get(c) == 0 ) {
                    charsToFind--;
                }
                map.put(c, map.get(c) + 1);
            }

            while( charsToFind == 0 ) {
                stringLength = i - head + 1;
                if( result == null || result.length() > stringLength ) {
                    result = str.substring(head, i + 1);
                    if( result.length() == arr.length ) {
                    // early termination since we found smallest possible
                        return result; 
                    }
                }
                // shrink our string by advancing the head
                c = str.charAt(head);
                if( map.containsKey( c ) ) {
                    map.put(c, map.get(c) - 1);
                    if( map.get(c) == 0 ) {
                        charsToFind++;
                    }
                }
                head++;
            }
        }

        return result;
    }

    public static void main(String []args){
        String str = "xyyzyzyx";
        char[] arr = {'x','y','z'};

        System.out.println(getSmallestSubString(str, arr) );
    }
}