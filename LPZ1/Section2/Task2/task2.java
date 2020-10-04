public class task2 {
    static void sqrt(long a){
        double b=a;
        int i=0;
        while ((b*b>a)&&(i<200)){ 
            b=(b+a/b)/2; 
            i++;
            } 
        System.out.println(b);
        }
        
public static void main(String[] args) {
    long a=Long.parseLong(args[0]);
    sqrt(a);
    }
}