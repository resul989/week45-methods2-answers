class Exercise6 {
    public static void main(String[] args) {
        power(2, 5);
    }
    public static void power(int base, int exp) {
        int result = 1;
        for(int i = 0; i < exp; i++) result *= base;
        System.out.println(base + "^" + exp + " = " + result);
    }
}