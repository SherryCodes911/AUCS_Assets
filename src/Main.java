public class Main {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }
        int[] array = new int[digits.length + 1];

        System.arraycopy(digits, 0, array, 0, digits.length);
        array[array.length - 2] = 1;
        array[array.length - 1] = 0;

        return array;
    }

    public static void main(String[] args) {
//        int[] digits = {9,9};
//
//        digits = new Main().plusOne(digits);
//        for (int digit : digits) {
//            System.out.print(digit);
//        }
    }
}