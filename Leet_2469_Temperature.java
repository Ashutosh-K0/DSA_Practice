class Leet_2469_Temperature {
    public double[] convertTemperature(double celsius) {
        double Kelvin = celsius + 273.15;
        double Fahren = celsius * 1.80 + 32.00;
        double[] temp = new double[]{Kelvin, Fahren};
        return temp;
    }
}
// LeetCode Problem 2469: Convert the Temperature
// Difficulty: Easy
// Given a temperature in Celsius, convert it to Kelvin and Fahrenheit.
// The function takes a double value representing the temperature in Celsius
// and returns an array of two doubles: the first element is the temperature in Kelvin,
// and the second element is the temperature in Fahrenheit.