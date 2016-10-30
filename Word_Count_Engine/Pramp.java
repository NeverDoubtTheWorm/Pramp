import java.util.*;
public class Pramp {
    public static List<Data> getBusiestTime(String doc){
        if( doc == null || doc.length() == 0) {
            return null;
        }

        Map<String, Integer> map = new HashMap<>();
        String[] allWords = doc.toLowerCase().split("[^a-zA-Z]+");

        for( String s : allWords ) {
            if( map.containsKey(s) ) {
                map.put( s, map.get(s) + 1 );
            } else {
                map.put( s, 1 );
            }
        }

        List<Data> result = new ArrayList<Data>();
        for( String key : map.keySet() ) {
            result.add( new Data( key, map.get(key) ) );
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String []args){
        String doc = "practice makes perfect. get perfect by practice. just practice!";
        List<Data> result = getBusiestTime(doc);
        for( Data d : result) {
            System.out.println(d.word + " : " + d.count);
        }
    }
}
class Data implements Comparable<Data>{
    String word;
    int count;
    
    public Data( String w, int c) {
        word = w;
        count = c;
    }

    public int compareTo( Data that ) {
        // sorts in descending order
        return that.count - this.count;
    }
}