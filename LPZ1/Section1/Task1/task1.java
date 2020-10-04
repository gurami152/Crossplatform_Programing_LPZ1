public class task1{
    public static void main (String[] args){
        int sum =Integer.parseInt(args[0])+Integer.parseInt(args[1]);
        int res =Integer.parseInt(args[0])-Integer.parseInt(args[1]);
        int mul =Integer.parseInt(args[0])*Integer.parseInt(args[1]);
        int div =Integer.parseInt(args[0])/Integer.parseInt(args[1]);
	    System.out.println(sum);
        System.out.println(res);
        System.out.println(mul);
        System.out.println(div);
    }
}