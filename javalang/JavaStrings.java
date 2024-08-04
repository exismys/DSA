package javalang;

public class JavaStrings {
    public static void main(String[] args) {

//        // Substrings
        String string = "Hello";
//        System.out.println(string.substring(1)); // ello
//        System.out.println(string.substring(5)); // ""

        // String to char Array and vice versa
        char[] charArray = string.toCharArray();
        for (char ch: charArray) {
            System.out.print(ch + " "); // H e l l o
        }

        String str = new String(charArray);
        System.out.println(str); // Hello

        // Replace a character in the string
        str.replace('e', 'a');
        System.out.println(str);
    }
}
