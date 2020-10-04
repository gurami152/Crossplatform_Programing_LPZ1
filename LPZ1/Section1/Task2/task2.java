public class task2{
    public static void main(String[] args){
        int osn =Integer.parseInt(args[0]);
        int result=1;
        for(int i=1;i<=osn;i++){
            result*=i;
        }
        System.out.println(result);
    }
}