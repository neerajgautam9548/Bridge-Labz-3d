package prac.Level3;

public class q91 {
    static boolean checkSlope(int x1,int y1,int x2,int y2,int x3,int y3) {
        int slope1 = (y2 - y1) * (x3 - x2);
        int slope2 = (y3 - y2) * (x2 - x1);
        return slope1 == slope2;
    }

    static boolean checkArea(int x1,int y1,int x2,int y2,int x3,int y3) {
        int area = x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2);
        return area == 0;
    }

    public static void main(String[] args) {
        System.out.println("Collinear (Slope)? " + checkSlope(2,4,4,6,6,8));
        System.out.println("Collinear (Area)? " + checkArea(2,4,4,6,6,8));
    }

}
