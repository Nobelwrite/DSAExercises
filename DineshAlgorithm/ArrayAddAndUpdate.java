public class ArrayAddAndUpdate {
    public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i <=n-1; i ++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public void arrayDemo() {
        int [] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] =8;
        myArray[3] = 2;
        myArray[4] = 10;
        System.out.println(myArray.length );
        System.out.println(myArray[myArray.length-1]);

        printArray(myArray);
    }

    public static void main(String[] args) {
        ArrayAddAndUpdate arrayAddAndUpdate = new ArrayAddAndUpdate();
        arrayAddAndUpdate.arrayDemo();
    }
}
