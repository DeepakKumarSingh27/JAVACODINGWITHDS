package kunalsirAssignment3;
public class Pro5 {
        public static void main(String[] args) {
            double x1 = 1.0;
            double y1 = 2.0;
            double x2 = 4.0;
            double y2 = 6.0;
            double distance = calculateDistance(x1, y1, x2, y2);
            System.out.println("The distance between the two points is: " + distance);
        }
        public static double calculateDistance(double x1, double y1, double x2, double y2) {
            double xDistance = x2 - x1;
            double yDistance = y2 - y1;
            double distance = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
            return distance;
        }
    }

