public class Example1{
    // Method to check if a number is prime
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0, num = 2;

        System.out.println("First 20 prime numbers:");

        // Find and print first 20 prime numbers
        while (count < 20) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
