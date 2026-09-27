// sum of digits is equal to product of digits 
// example 123 
// sum 1+2+3=6
// product 1*2*3=6
// sum==product so its a spy number 
// 1-9 are also spy number

public class spyNumber {
    public static boolean isSpy(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            product *= lastDigit;
            n /= 10;

        }
        return sum == product;
    }

    public static void range(int start, int end) {
        for (int i = end; i >= start; i--) {
            if (isSpy(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        range(1, 133);
    }
}
