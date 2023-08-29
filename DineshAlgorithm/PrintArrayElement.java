public class PrintArrayElement {

    public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println( );

    }

    public static void main(String[] args) {
        PrintArrayElement printArrayElement = new PrintArrayElement();
        printArrayElement.printArray(new int[] {5, 1, 2, 9, 10});

    }
}
