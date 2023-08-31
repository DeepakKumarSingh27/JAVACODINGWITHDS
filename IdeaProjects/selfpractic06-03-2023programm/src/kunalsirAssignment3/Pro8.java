package kunalsirAssignment3;
public class Pro8 {
    static double Depreciation(double v, double r, double t)
    {
        double D = v * Math.pow((1 - r / 100), t);

        return D;
    }
    // Driver code
    public static void main(String[] args)
    {
        double V1 = 200, R = 10, T = 2;

        System.out.print(Depreciation(V1, R, T));
    }
}
