public class Main {
    public static void main (String[] args) {
        CoPrimeCalculator calculator = new CoPrimeCalculator();
        int gcd = calculator.gcd(34, 146);
        boolean coPrime = calculator.areCoPrime(gcd);
        System.out.println("GCD: " + gcd);
        System.out.println("Are Co-Prime: " + coPrime);
        return;
    }
}