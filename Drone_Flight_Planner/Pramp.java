public class Pramp {
    public static int getStartingFuelBetter(Point[] route){
        if( route == null || route.length == 0) {
            return 0;
        }
        int highestPoint = route[0].z;
        for( int i = 1; i < route.length; i++ ) {
            highestPoint = Math.max(highestPoint, route[i].z);
        }

        return highestPoint - route[0].z;
    }
    public static int getStartingFuel(Point[] route){
        if( route == null || route.length <= 1) {
            return 0;
        }
        int startingFuel = 0;
        int currentFuel = 0;
        for( int i = 1; i < route.length; i++ ) {
            currentFuel += route[i-1].z - route[i].z;
            if( currentFuel < 0 ) {
                startingFuel -= currentFuel;
                currentFuel = 0;
            }
        }

        return startingFuel;
    }

    public static void main(String []args){
        Point[] route = new Point[5];
        route[0] = new Point(  0,  2, 10);
        route[1] = new Point(  3,  5,  0);
        route[2] = new Point(  9, 20,  6);
        route[3] = new Point( 10, 12, 15);
        route[4] = new Point( 10, 10,  8);

        System.out.println(getStartingFuel(route) );
        System.out.println(getStartingFuelBetter(route) );
    }
}
class Point {
    int x;
    int y;
    int z;
    public Point(int i, int j, int k) {
        x = i;
        y = j;
        z = k;
    }
}