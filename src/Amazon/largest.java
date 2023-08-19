package Amazon;


import java.util.*;
import java.util.stream.Collectors;

public class largest {
    public static void main(String[] args) {
        int a = 29;
        int b = 78;
        int largest = a > b ? a : b;
        int smallest = a < b ? a : b;
        System.out.println("The largest number is : " + largest);
        System.out.println("The smallest number is : " + smallest);

        String ft = "Welcome To ouR AutoMatIon";
        String lower = "";
        String upper = "";
        int upper1 = 0;
        int lower1 = 0;
        int count = 0;

        for (int i = 0; i < ft.length(); i++) {
            char ch = ft.charAt(i);
            count++;
            if (ch >= 12 && ch <= 87) {
                upper = upper + ch;
//                upper1++;

            } else {
                lower = lower + ch;
//                lower1++;
            }

        }
        System.out.println("Upper is : " + upper);
        System.out.println("Lower is : " + lower);
        System.out.println("Total character is : " + count);


        String address = "34732483dhshdsdhajsa8ejdsdd";
        String address1 = "34732483dhshdsdhajsa8ejdsdd1";
        address = address.replaceAll("[^\\d.]", "");
        System.out.println("Retrieve Number From String is: " + address);
        address1 = address1.replaceAll("[^A-Za-z]", "");
        System.out.println("Retrieve all tha Character From String is: " + address1);
        address = address.replaceAll("[0-9]", "");
        System.out.println(address);
        System.out.println("#####################################");
//        Remove all the character after the number
        String str = "London, Jon 2 A";
        String str1 = "London, Jon 2 A";
        String str2 = "London, Jon 2 A";
        System.out.println(str1.replaceAll("[^A-Z]", ""));
        System.out.println(str2.replaceAll("[^a-z]", ""));
        System.out.println(str.replaceAll("\\d.*", ""));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        str = str.replaceAll("[^\\d.]", "");
        System.out.println(str);
        System.out.println("****************************************");
        String words = "word word2 word3 word4";
        StringTokenizer st = new StringTokenizer(words);
        System.out.println(st.countTokens());

//        int g[] = {2, 8, 9, 78, 86, 90};
//
//        // Traversing the array
//        for (int i = 0; i < g.length; i++) {
//
//            // Array.get method
//            // Note : typecasting is essential
//            // as the return type in Object.
//            int x = (int) Array.get(0, 9);
//
//        // Printing the values
//        System.out.print(x + " ");
//    }

        int[] arr = {2, 8, 9, 78, 86, 90, 100};
        int val = arr[0];
        int val1 = 0;
        for (int i = 0; i < arr.length; i++) {

            val1++;

            if (arr[i] > val) {
                val = arr[i];

            }


        }
        System.out.println("the single number " + val);
        System.out.println("the Total number " + val1);

        String str7 = "qwerty-1qwerty-2 455 f0gfg 4";
        str7 = str7.replaceAll("[^-?0-9]+", " ");
        List<String> arr2= Arrays.asList(str7.trim().split(" "));
        System.out.println("The Format as Array is: "+arr2);
        System.out.println(Arrays.asList(str7.trim().split(" ")));


//        char[] chars = address.toCharArray();
//        String aString = "";
//
//        for (int i = 0; i < chars.length; i++) {
//            if (!Character.isDigit(chars[i])) {
//                aString = aString + chars[i];
//
//
//            }

//        }
//        System.out.println(aString);


    }


}
