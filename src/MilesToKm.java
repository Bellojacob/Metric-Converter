public class MilesToKm {
    public static double milesToKm(double x){
        double kilometer = x * 1.609344;
        kilometer = Math.round(kilometer * 100.0) / 100.0;
        return kilometer;
    }

    public static double kmToMiles(double x){
        double miles = x / 1.609344;
        miles = Math.round(miles * 100.0) / 100.0;
        return miles;
    }
}
