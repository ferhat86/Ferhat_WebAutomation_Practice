package Amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class preparation {


    public static void main(String[] args) {
//        largestNumberOfArray();
//        largestNumber();
//        findNumberInString();
//        preparationCoding();
//        removeDuplicate();
//        duplicateValue();
//        duplicateObject();
//        findDuplicate();
//        findDuplicateAsArray();
//        findLargestAndSmallestNumber();
//        findOutNumberInString();
//        findOutCharacterInString();
//        findUpperAndLowerInString();
//        secondMethodFindUpperAndLowerInString();
////        print();
//        getSecondLargest();
//        System.out.println("the second largest is : "+getSecondLargest());

//        problem();





    }
    public static void largestNumberOfArray() {
        int[] arr = {2, 4, 78, 90, 64};
        int val = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (arr[i] > val) {
                val = arr[i];
            }
        }
        System.out.println("the largest number is : " + val);
        System.out.println("count number is : " + count);

        //for find the minimum number in array
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);

    }
    public static void largestNumber() {
        int a = 23;
        int b = 89;
        int c = a > b ? a : b;
        System.out.println("the largest number is : " + c);
    }
    public static void findNumberInString() {
        String ft = "We learN AuTomatioN";
        String ft1 = "We3 lea34rN AuTom89at09ioN";
        ft1 = ft1.replaceAll("[^0-9]", "");

//        ft1=ft1.replaceAll("[^A-Za-z]","");
//        ft1=ft1.replaceAll("[A-Za-z]","");
//        ft1=ft1.replaceAll("[^A-Z]","");
//        ft1=ft1.replaceAll("[^a-z]","");
        System.out.println("The number in the string is :" + ft1);
        System.out.println("The character in the string is :" + ft1);
        System.out.println("The Upper Case  in the string is :" + ft1);
        System.out.println("The Lower case in the string is :" + ft1);


        String upper = "";
        int Upper = 0;
        String lower = "";
        int Lower = 0;
        System.out.println("&&&&&&&&&&&&&& 1st Method &&&&&&&&&&&&&&&&&&&&&&");
        for (int i = 0; i < ft.length(); i++) {
            char ch = ft.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper = upper + ch;
                Upper++;
            } else {
                lower = lower + ch;
                Lower++;
            }

        }
        System.out.println("The Upper is : " + upper);
        System.out.println("The number of Upper is : " + Upper);
        System.out.println("The Lower is : " + lower);
        System.out.println("The number of Lower is : " + Lower);

        System.out.println("&&&&&&&&&&&&&&&&&&&& 2nd Method &&&&&&&&&&&&&&&&&&&&&&");
        upper = upper.replaceAll("[^A-Z]", "");
        lower = lower.replaceAll("[^a-z]", "");
        System.out.println("The 2nd Method of largest is :" + upper);
        System.out.println("The 2nd Method of lowest is :" + lower);


    }
    public static void preparationCoding() {
        int[] arr1 = {1, 3, 89, 3, 70, 56, 30, 70, 43, 1};
        //largest number
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println("Largest number is : " + max);

        //lowest number
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (min > arr1[i]) {
                min = arr1[i];
            }
        }
        System.out.println("Lowest number is :" + min);
    }
    public static void removeDuplicate() {
        //Remove a duplicate
        int[] arr2 = {1, 3, 89, 3, 70, 56, 70, 43, 1};
        Object[] arr3 = {2, 6, "fid", 6, "fid", 89, 80, "kat", 89, "kat", 3};
//        Set<Integer> newList = new HashSet<>();
//        Set<Integer> duplicateElements = Arrays.stream(arr2)
//                                               .filter(i -> !newList.add(i))
//                                               .boxed()
//                                               .collect(Collectors.toSet());
        Set<Integer> newList = new HashSet<>();
        Set<Integer> duplicate = Arrays.stream(arr2).filter(i -> !newList.add(i)).boxed().collect(Collectors.toSet());


        System.out.println("Th Duplicate number is : " + duplicate);

        for (Integer element : arr2) {
            if ((element instanceof Integer)) {
                newList.add((Integer) element);
            }
        }
        Set<Object> newList1 = new HashSet<>();
        for (Object element : arr3) {
            if (element instanceof String) {
                newList1.add((Object) element);
            } else if (element instanceof Integer) {
                newList.add((Integer) element);
            }
        }
        int[] array = new int[]{78, 5, 78, 5, 4, 7, 89, 67, 67};
        Set<Integer> set = new HashSet<>();

        for (Integer element : array) {
            if (!set.add(element)) {
                System.out.println("Duplicate element found: " + element);
            }
        }

        System.out.println("The New List Is : " + newList);
        System.out.println("The New List1 is : " + newList1);


    }
    public static void duplicateValue() {
        int[] array = {1, 2, 56, 34, 2, 56, 34};
        Set<Integer> newList = new HashSet<>();
        for (Integer element : array) {
            if (element instanceof Integer) {
                newList.add((Integer) element);
            }
        }
        System.out.println("The new List is : " + newList);

    }
    public static void duplicateObject() {
        Object[] array = {2, "fit", 6, "fit", 2, "cat"};
        Set<Object> newList = new HashSet<>();
        for (Object element : array) {
            if (element instanceof String) {
                newList.add((String) element);
            } else if (element instanceof Integer) {
                newList.add((Integer) element);
            }
        }
        System.out.println("New list is : " + newList);
    }
    public static void findDuplicate(){
        int[] array={2,7,89,7,2};
        Set<Integer> newList=new HashSet<>();
        for (Integer element:array){
            if(!newList.add(element)){
                System.out.println("Duplicate number is : "+element);
            }
        }
    }
    public static void findDuplicateAsArray(){
        int[] array={3,6,78,3,78};
    Set<Integer> newList=new HashSet<>();
    Set<Integer> newList1=Arrays.stream(array).filter(i->!newList.add(i)).boxed().collect(Collectors.toSet());
        System.out.println("The Duplicate number as array is : "+newList1);

    }
    public static void findLargestAndSmallestNumber(){
        int[] array={2,4,6,4,7,6};
        int largest=array[0];
        int smallest=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest=array[i];
            }else if(smallest>array[i]){
                smallest=array[i];
            }
        }
        System.out.println("The largest number is : "+largest);
        System.out.println("The smallest number is : "+smallest);
    }
    public static void findOutNumberInString(){
        String ch="w1e ar2e lear45ning aut32omation";
        ch=ch.replaceAll("[^0-9]","");
        System.out.println("The number is : "+ch);
    }
    public static void findOutCharacterInString(){
        String ch="w1e ar2e lear45ning aut32omation";
        ch=ch.replaceAll("[^A-Z a-z]","");
        System.out.println("The character is : "+ch);
    }
    public static void findUpperAndLowerInString(){
        String ch="We Are Learn Automation";
        String ch1="We Are Learn Automation";
        ch=ch.replaceAll("[^A-Z]","");
        ch1=ch1.replaceAll("[^a-z]","");
        System.out.println("The Upper is : "+ch);
        System.out.println("The Lower is : "+ch1);
    }
    public static void secondMethodFindUpperAndLowerInString(){
        String ch="We Are Learn Automation";
        String upper="";
        String lower="";
        int count=0;
        int Upper=0;
        int Lower=0;
        for(int i=0;i<ch.length();i++){
            char ch1=ch.charAt(i);
            count++;
            if(ch1>='A' && ch1<='Z'){
                upper=upper+ch1;
                Upper++;
            }else{
                lower=lower+ch1;
                Lower++;
            }

        }
        System.out.println("The upper is : "+upper);
        System.out.println("The lower is : "+lower);
        System.out.println("The number of string  is : "+count);
        System.out.println("The number of Upper is : "+Upper);
        System.out.println("The number of Lower is : "+Lower);

    }
    public static void print(){
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
        int row=5;
        for(int i=1;i<row;i++){
            for (int j=2*(row-i);j>=1;j--){
                System.out.print("");

            }
            for(int j=1;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
        int a, b;
        int k=5;

        // 1st loop
        for (a = 1; a <= k; a++) {

            // nested 2nd loop
            for (b =  (k - a); b > 0; b--) {
                // printing spaces
                System.out.print(" ");
            }

            // nested 3rd loop
            for (b = 1; b <= a; b++) {
                // printing stars
                System.out.print(b);
            }

            // end-line
            System.out.println();
        }

    }
    public static void largestAndSmallestNumber(){
        int[] array={9,7,56,2,89};
        int val=array[0];
        int val1=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>val){
                val=array[i];
            }else if(val1>array[i]){
                val1=array[i];
            }

        }
        System.out.println("the largest number is : "+val);
        System.out.println("the lowest number is : "+val1);
    }
    public static void removeDuplicateNumber(){
        int[] array={2,3,4,7,2,3,4};
        Set<Integer> newList= new HashSet<>();
        for(Integer element:array){
            if(element instanceof Integer){
                newList.add((Integer)element);
            }
        }
        System.out.println("The new List is : "+newList);
    }
    public static void findDuplicateNumbers(){
        int[] array={2,3,4,6,2,3,4,9};
        Set<Integer> newList=new HashSet<>();
        Set<Integer> newList1=Arrays.stream(array).filter(i->!newList.add(i)).boxed().collect(Collectors.toSet());
        System.out.println("The duplicate numbers are : "+newList1);
    }
//    public static void secondMethodFindDuplicateNumbers(){
//        int[] array={2,3,4,5,2,3,4,6};
//        System.out.println("the number is: "+ft);
//
//    }
//    static WebDriver driver;
//    public static void takeScreenshot(String fileName){
//
//       File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//       FileUtils.copyFile(file,new File("path"+fileName+".jpg"));
//    }
//    public static void scrollDown(){
//       JavascriptExecutor js =(JavascriptExecutor)driver;
//       js.executeScript("window.scrollBy(0,1000)","");
//       js.executeScript("Arguments[0].scrollIntoView();",element);
//       js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//
//    }


//    Object [] number={ 2,4,5,6,3,8,5,3,"K",8,"K",0,7,"Ala",21,34,"Ala"};
//    removeDuplicate(number);
//
//
//}
//
//    public static void removeDuplicate(Object[] number){
//        Set<Object> newList=new HashSet<>();
//        for (Object element:number) {
//            if (element instanceof String){
//                newList.add((String)element);
//            } else if(element instanceof Integer){
//                newList.add((Integer)element);
//            }
//        }
//        System.out.println(newList);
//
//    }
////    public static void main(String args[]){
//        int a[]={1,2,5,6,3,2};
//        int b[]={44,66,99,77,33,22,55};
//        System.out.println("Second Largest: "+getSecondLargest(a,6));
//        System.out.println("Second Largest: "+getSecondLargest(b,7));
//    }}



}

