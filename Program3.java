public class Program3 {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println(a < b);   // true
        System.out.println(a > b);   // false
        System.out.println(a != b);  // true

        System.out.println((a < b) && (b > 15)); // true
        System.out.println((a > b) || (b > 15)); // true
    }
}