import java.util.Random;

public class task2{
    public static void main(String[] args){
        int[] A = new int[900];
        Random rd = new Random();
        for(int i=0;i<900;i++){
            A[i]= rd.nextInt(10);
            System.out.print(A[i]);
        }
        System.out.println();
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] > A[i+1]) {
                    temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                    sorted = false;
                }
            }
        }
        for(int i=0;i<900;i++){
           System.out.print(A[i]); 
        }
    }
}