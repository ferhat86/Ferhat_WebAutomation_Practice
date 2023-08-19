package problemSolsing;

public class UpperAndLower {


    public static void main(String[]args){
        String FT="We Learn Selenium Automation";
        String upper="";
        String lower="";
        int count =0;
        int Upper =0;
        int Lower =0;
        System.out.println("****** 1st Method **********");
        for(int i=0;i<FT.length();i++){
            char ch= FT.charAt(i);
            count++;
            if(ch>='A' && ch<='Z') {
                upper =upper+ch;
                Upper++;
            }else {
                lower = lower+ch;
                Lower++;
            }
        }
        System.out.println("The Upper is :"+upper);
        System.out.println("The number Of Upper is :"+Upper);
        System.out.println("The lower is :"+lower);
        System.out.println("The number Of lower is :"+Lower);
        System.out.println("The count number  is :"+count);

        System.out.println("********* 2nd Method *************");
        String Upper1= FT.replaceAll("[^A-Z]","");
        System.out.println("The Upper is :"+Upper1);
        String Lower1 =FT.replaceAll("[^a-z]","");
        System.out.println("The Lower is :"+Lower1);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        String FT1="We Are3 Lear3n Seleniu4m Automa56tion";
        String character =FT1.replaceAll("[^A-Za-z]","");
        System.out.println("The character is :"+character);
        String character1 =FT1.replaceAll("[0-9]","");
        System.out.println("The character1 is :"+character1);
        String number =FT1.replaceAll("[^\\d.]","");
        System.out.println("The number is :"+number);
        String number1 =FT1.replaceAll("[^0-9]","");
        System.out.println("The number is :"+number1);


    }
}
