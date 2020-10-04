import java.util.Random;

public class task1{
    public static void main(String[] args){
        int[] A = new int[20];
        Random rd = new Random();
        for(int i=0;i<20;i++){
            A[i]= rd.nextInt(10);
            System.out.print(A[i]);
        }
        System.out.println();
        int max, min, posMax, posMin;
        max=A[0];
        posMax=0;
        min=A[0];
        posMin=0;
        for(int i=1;i<20;i++){
            if(A[i]>=max){posMax=i;max=A[i];}
            if(A[i]<=min){posMin=i;min=A[i];}
        }
        A[posMax]=min;
        A[posMin]=max;
        for(int i=0;i<20;i++){
           System.out.print(A[i]); 
        }
    }
}