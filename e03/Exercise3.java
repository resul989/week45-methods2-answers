class Exercise3 {
    public static void main(String[] args) {
        convertToCelcius(50);
    }
    public static void convertToCelcius(int f) {
        int c = (f - 32) * 5 / 9;
        System.out.println(f + "°F in Celsius is " + c + "°C");
    }
}