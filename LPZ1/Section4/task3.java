import java.util.Random;

public class task3{
    public static void mean(int[] arr,int size){
        int sum =0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        System.out.println(size);
        System.out.println(sum/size);
    }
    public static void main(String[] args){
        int size =20;
        int[] array = new int[size];
        Random rd = new Random();
        for(int i=0;i<size;i++){
            array[i]=rd.nextInt(10);
        }
        mean(array,size);
    }
}