public class Day13 {
    public static void main(String[] args) {
        // Reverse a string
        String str = "Hello, World!";
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println("Reversed String: " + reversedStr);
    }
}