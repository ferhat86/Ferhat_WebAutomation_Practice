package problemSolsing;

public class LargestAndSmolest {

    public static void main(String[]args){

        int a=98;
        int b=165;
        int c=100;
        System.out.println("***** 1 st Method ***************");
        if(a>b && a>c){
            System.out.println("Largest number is :"+a);
        }else if(b>a && b>c){
            System.out.println("Largest number is :"+b);
        }else {
            System.out.println("largest number is "+c);
        }
        System.out.println("&&&&& 2nd Method &&&&&&&");
        int largest=c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println("Largest number is "+largest);
    }
}
