public class TypeCasting {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d;  // Explicit casting
        System.out.println("Double to int: " + i);

        int j = 10;
        double dj = j;   // Implicit casting
        System.out.println("Int to double: " + dj);
    }
}
