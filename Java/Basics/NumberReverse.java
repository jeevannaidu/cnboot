package Basics;

public class NumberReverse {

    static int reverse(int x) {

        StringBuilder stringBuilder = new StringBuilder();
        try {
            return x > 0
                    ? Integer.parseInt(stringBuilder.append(x).reverse().toString())
                    : Integer.parseInt(stringBuilder.append(x * -1).reverse().toString()) * -1;

        } catch (NumberFormatException numberFormatException) {
            return 0;
        }

    }

    public static void main(String[] args) {
        int input = 1534236469;
        System.out.println(reverse(input));
    }
}
