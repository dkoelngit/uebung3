package h3;

public class h3_main {
    public static void main(String[] args) {
        int[][] einheiten = new int[2][15];
        
        einheiten[0] = new int[]{50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < 15; i++) {
            einheiten[1][i] = 0;
        }
        
        int input = 6279;
        
        for (int i = 0; i < 15; i++) {
            if (input >= einheiten[0][i]) {
                einheiten[1][i] = input / einheiten[0][i];
                input %= einheiten[0][i];
            }
        }
        
        System.out.println("Einheiten:");
        for (int i = 0; i < 15; i++) {
            System.out.print(einheiten[0][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            System.out.print(einheiten[1][i] + " ");
        }
        System.out.println();
    }
}
