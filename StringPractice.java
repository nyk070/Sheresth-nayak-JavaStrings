public class StringPractice {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Length: " + str1.length());
        System.out.println("Concat: " + str1.concat(" " + str2));
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Substring: " + str1.substring(0, 3));
        System.out.println("Equals: " + str1.equals(str2));
    }
}