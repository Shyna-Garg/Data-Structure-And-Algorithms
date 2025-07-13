package Strings;

public class shortestPath {

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {

            char dir = path.charAt(i);
            // south
            if (dir == 'S') {
                y--;
            }
            // north
            else if (dir == 'N') {
                y++;
            }
            // east
            else if (dir == 'E') {
                x++;
            }
            // west
            else
                x--;
        }
        // formula - underroot of( (x2sq - x1sq) + (y2sq - y1sq) ) ..but x1 and y1 = 0
        // ..so we can only consider x2sq and y2sq
        int X2 = x * x;
        int Y2 = y * y;
        return (float) (Math.sqrt(X2 + Y2));
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }

}
