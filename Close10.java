public class close10 {
    public static int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);
        if (aDiff < bDiff) return a;
        else if (bDiff < aDiff) return b;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(close10(8, 13));  // Output: 8
        System.out.println(close10(13, 8));  // Output: 8
        System.out.println(close10(13, 7));  // Output: 0
    }
}
