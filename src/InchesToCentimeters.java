public class InchesToCentimeters {
    public static double inToCm(double x){
        double centimeter = x * 2.54;
        centimeter = Math.round(centimeter * 100.0) / 100.0;
        return centimeter;
    }

    public static double cmToIN(double x){
        double inches = x / 2.54;
        inches = Math.round(inches * 100.0) / 100.0;
        return inches;
    }
}
