public class task1{
    public static void main(String[] args){
        int n =Integer.parseInt(args[0]);
        int result=1;
        for(int i=0;i<n;i++){
            result*=2;
        }
        System.out.println(result);
    }
}