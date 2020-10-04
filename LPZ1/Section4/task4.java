import java.util.Random;

public class task4{
    public static void evenOrNot(int[] arr,int size){
        int sumEven =0;
        int sumNotEven =0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0)sumEven+=arr[i];
            else sumNotEven+=arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("Even: "+sumEven);
        System.out.println("NotEven: "+sumNotEven);
    }

    public static void main(String[] args){
        int size =30;
        int[] array = new int[size];
        Random rd = new Random();
        for(int i=0;i<size;i++){
            array[i]=rd.nextInt(10);
        }
        evenOrNot(array,size);
    }
}