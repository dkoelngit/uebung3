package h2;

public class h2_main {
    public static void main(String[] args) {
        int n = 2342359;
        int digits = 0;
        
        int[] a = new int[9];
        
        String s = Integer.toString(n);
        digits = s.length();
        
        for (int i = 0; i < s.length(); i++) {
            a[8 - i] = s.charAt(s.length() - 1 - i) - '0';
        }
        
        System.out.println("n ist: " + n);
        System.out.println("Anzahl an Ziffern: " + digits);
        System.out.print("Array a: ");
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}