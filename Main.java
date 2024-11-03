
public class Main {
    public static void main(String[] args) {
        int length = 5;
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] mixedNumbers = {0, 1, -5, 3, -7, 5, 6, 7};
        System.out.println(calculateSum(numbers, length));
        System.out.println(countPositiveNumbers(mixedNumbers, length));
        int startIndex = 0;
        System.out.println(findNumberIndex(mixedNumbers, length, startIndex));
        double[] decimalArray = {0.5, 1.2, -5.2, 3.2, -7.2, 5.5, 6.3, 7.3};
        System.out.println(isArraySorted(decimalArray, startIndex));
        int startDivisor = 2;
        System.out.println(checkIfPrime(numbers, startIndex));
    }

    public static int calculateSum(int[] array, int length) {
        if (length == 0) {
            return array[0];
        }
        return calculateSum(array, length - 1) + array[length];
    }

    public static int countPositiveNumbers(int[] array, int length) {
        if (length == 0) {
            return array[0] >= 0 ? 1 : 0;
        }
        if (array[length] >= 0) {
            return countPositiveNumbers(array, length - 1) + 1;
        }
        return countPositiveNumbers(array, length - 1);
    }

    public static int findNumberIndex(int[] array, int target, int currentIndex) {
        if (currentIndex == array.length) {
            return -1;
        }
        if (array[currentIndex] == target) {
            return currentIndex;
        }
        return findNumberIndex(array, target, currentIndex + 1);
    }

    public static boolean isPrimeRecursive(int number, int divisor) {
        if (divisor > (number / 2) + 1) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrimeRecursive(number, divisor + 1);
    }

    public static boolean isArraySorted(double[] array, int currentIndex) {
        if (currentIndex == array.length - 1) {
            return true;
        }
        if (array[currentIndex] > array[currentIndex + 1]) {
            return false;
        }
        return isArraySorted(array, currentIndex + 1);
    }

    public static boolean checkIfPrime(int[] array, int currentIndex) {
        if (currentIndex == array.length) {
            return true;
        }
        if (!isPrimeRecursive(array[currentIndex], 2)) {
            return false;
        }
        return checkIfPrime(array, currentIndex + 1);
    }
}