class ferma{
    public static void ferm(int step){
        for(int a=2;a<=100;a++){
            for(int b=2;b<=100;b++){
                for(int c=2;c<=100;c++){
                    if(Math.pow(a,step)+Math.pow(b,step)==Math.pow(c,step)){
                        System.out.println("Ferma was wrong"+a+"^"+step+"+"+b+"^"+step+"="+c+"^"+step);
                    }
                }
            }
        }
    }

    public static void main(String[] args){
       ferm(3);
       ferm(4);
       ferm(5);
       ferm(6);
       ferm(7);
       ferm(8);
       ferm(9);
       ferm(2);
    }
}