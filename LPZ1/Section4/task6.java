import java.util.Random;

public class task6{
    public static void main(String[] args){
        String s1 ="abc";
        String s2 ="def";
        String s3 ="ghi";
        String s4 ="abc";
        String s5 ="abc";
        if(s4.equals(s5)){
            s1+=s2;
        }
        else{
            s1+=s3;
        }
        System.out.println(s1);
    }
}