public class task3{
    public static void main(String[] args){
    int osn =Integer.parseInt(args[0]);
    if(osn>10){System.out.println("Слишкoм большое число");return;}
        int result=1;
        for(int i=1;i<=osn;i++){
            result*=i;
        }
        System.out.println(result);
    }
}