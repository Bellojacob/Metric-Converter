public class FahrenheitToCelsius {
    // this program will allow user to convert from Fahrenheit to Celsius

    public static double convertCtoF(double x){
        double fahrenheit = (x * (9.0/5.0) + 32);
        fahrenheit = Math.round(fahrenheit * 100.0) / 100.0;
        return fahrenheit;
    }

    public static double convertFtoC(double x){
        double celsius = ((x - 32) * 5)/9;
        celsius = Math.round(celsius * 100.0) / 100.0;
        return celsius;
    }
}
