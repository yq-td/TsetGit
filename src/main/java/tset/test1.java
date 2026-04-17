package tset;

public class test1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2); // true

        String s3 = new String("abc");
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true
        String s4 = "abc";
        String s5 = "abc";
        System.out.println(s1 == s4);
    }
}
