public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(11212));
        System.out.println("------------------------------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("------------------------------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));

    }
    public static boolean isPalindrome (int num){

        int reversedNum = 0, remainder;
        int originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
    public static boolean isPerfectNumber (int num){

        if (num == 1 || num< 0)
            return false;

        int sum = 1;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;

    }
    public static String numberToWords (int num){
StringBuilder numToText= new StringBuilder();
if (num<0) {
    return "Invalid value entered!";
}

char[] digits = String.valueOf(num).toCharArray();
for (char digit:digits){
    switch (digit) {
        case '0' -> numToText.append("Zero ");
        case '1' -> numToText.append("One ");
        case '2' -> numToText.append("Two ");
        case '3' -> numToText.append("Three ");
        case '4' -> numToText.append("Four ");
        case '5' -> numToText.append("Five ");
        case '6' -> numToText.append("Six ");
        case '7' -> numToText.append("Seven ");
        case '8' -> numToText.append("Eight ");
        case '9' -> numToText.append("Nine ");
    }
}

return numToText.toString().trim();
    }
}