public class prime{

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
    }
    public static void main(String[] args) {
        prime primeChecker = new prime();
        System.out.println(primeChecker.isPrime(17)); // true
        System.out.println(primeChecker.isPrime(15)); // false
    }

    
}

