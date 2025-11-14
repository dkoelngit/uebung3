package h1;

public class h1_main {
    public static void main(String[] args) {

        int[] myArray = {5, 9, 8, 8, 10, 100, 7, 10};
        
        for (int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        
        System.out.print("Umgekehrtes Array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}