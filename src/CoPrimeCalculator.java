public class CoPrimeCalculator {
    //private variables
    private int[] commonFactors = new int[100];
    private int factorsIndex = 0;
    //Constructor
    public CoPrimeCalculator() {
        return;
    }

    //Methods to calculate the gcd of two numbers
    public int gcd(int a, int b) {
        int lesser;
        int greater;
        //determine the smaller number, sinc it only has to go up to half of that number.
        //The only other option is the actual number itself, which can be checked outside the loop.
        if (a > b) {
            lesser = a;
            greater = b;
        }
        else {
            lesser = b;
            greater = a;
        }

        if (greater % lesser == 0) {
            return lesser;
        }
        
        //If lesser is not the gcd, it will go onto this line. If it is, it won't get to this line.
        for (int i = 1; i <= lesser/2; i++) {
            if (lesser % i == 0 && greater % i == 0) {
                commonFactors[factorsIndex] = i;
                factorsIndex++;
            }
        }
        return commonFactors[factorsIndex - 1];
    }

    public boolean areCoPrime(int gcd) {
        if (gcd == 1) {
            return true;
        }
        return false;
    }
}
