package day14_StringAgain;

public class q{
        public static void main(String[] args) {

                double pi = 3.14;
                boolean b = 199%5==0;
                int num = 0;
                if(pi>3.14 && !b){
                        num +=50;
                }else{
                        num-=50;
                }
                if(b){
                        num +=50;
                }

                System.out.println(num);
        }
        }
