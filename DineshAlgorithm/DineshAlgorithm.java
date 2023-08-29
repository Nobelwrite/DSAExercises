// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DineshAlgorithm {
    private int n;
    public int findSum(int n) {
        //We defined the method and started passed the variable as an argument
        return n * (n + 1)/2;
        //We tell the system to return the value of n

    }
    //We can also do the below:
//    public int findSum(int n) {
//        int sum = 0;
//        for(int i = 1; i<=n; i++) {
//            sum += i;
//
//        }
//        return sum;
//
//    }



    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        //We have a double type variable called 'now'. Inside this, we stored the time calcution

        DineshAlgorithm dineshAlgorithm = new DineshAlgorithm();
        //We instantiated the class as an object
        System.out.println(dineshAlgorithm.findSum(99999));
        //We passed in the value of n, unlimited? and till the system to print the findSum method that
        //formerly instantiated
        System.out.println("Time taken: " + (System.currentTimeMillis()- now) + "millisecs");
        //then we printed everything out

    }


}