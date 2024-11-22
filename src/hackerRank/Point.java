package hackerRank;

// Defining a Point class to represent a point in 2-dimensional space
public class Point {

    // x-coordinate of the point
    private int x;

    // y-coordinate of the point
    private int y;

    // Constructor for the Point class
    public Point(int x, int y) {
        this.x = x;  // Assigning x-coordinate of the point
        this.y = y;  // Assigning y-coordinate of the point
    }

    // Method to get the x-coordinate of the point
    public int getX() {
        return x;
    }

    // Method to get the y-coordinate of the point
    public int getY() {
        return y;
    }

    // TODO: Implement the method to move the point by dx and dy in x and y direction respectively
    public void move(int dx, int dy) {
        // Your code here
        x += dx;
        y += dy;

        System.out.println("Point(x,y) = "+ "(" + x + "," + y + ")");
    }

    // TODO: Implement the method to calculate the distance from this point to another point
    public double distanceTo(Point other) {
        // Your code here
        int x2 = other.getX();
        int y2 = other.getY();

        int diffX = x2 - x;
        int diffY = y2 - y;

        int xSqr = (int) Math.pow(diffX,2);
        int ySqr = (int) Math.pow(diffY,2);

        double sqrt = Math.sqrt((xSqr) + (ySqr));

        return sqrt;
    }

    public static void main(String[] args) {
        Point p1 = new Point(3,4);
        Point p2 = new Point(6,7);
        p1.move(1,1); //4,5 --> 2 + 2 ==> 4 + 4 = 16

        double distance = p1.distanceTo(p2);
        System.out.println("Distance between two co-ordinates are " + distance);

    }
}