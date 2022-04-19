package general;

public class RomanToNums {
    public static void main(String[] args) {
        System.out.println(num("XII"));
        System.out.println(num("XIX"));
    }

    public static int num(String roman) {
        int length = roman.length();

        if (length == 0) return -1;

        char prevChar = roman.charAt(length - 1);
        int num = value(prevChar);

        for (int i = length - 2; i >= 0; i--) {
            char currentChar = roman.charAt(i);
            if (value(currentChar) >= value(prevChar)) {
                num += value(currentChar);
            } else {
                num -= value(currentChar);
            }
            prevChar = currentChar;
        }

        return num;
    }

    public static int value(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return - 1;
        }
    }
}
