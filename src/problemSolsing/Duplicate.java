package problemSolsing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(String[] args) {
        duplicateNumber();
        duplicateObject();
        findDuplicateNumber();
        secondMethodOfDuplicate();
    }

    public  static void duplicateNumber(){
        int[] array={1,34,67,34,1,5,6,5};
        Set<Integer> newList= new HashSet<>();
        for (Integer element:array){
            if(element instanceof Integer){
                newList.add((Integer)element);
            }
        }
        System.out.println("New List Is : "+newList);
    }
    public static void duplicateObject(){
        Object[] array1={1,"fit",2,"fit",2,5,"man",23,"man",5};
        Set<Object> newList1=new HashSet<>();
        for(Object element:array1){
            if(element instanceof String){
                newList1.add((Object)element);
            }else if(element instanceof Integer){
                newList1.add((Integer)element);
            }
        }
        System.out.println("The New List1 Is : "+newList1);

    }
    public static void findDuplicateNumber(){
        int[] array={1,34,67,34,1,5,6,5};
        Set<Integer> newList= new HashSet<>();
        Set<Integer> newList1= Arrays.stream(array).filter(i->!newList.add(i)).boxed().collect(Collectors.toSet());
        System.out.println("The Duplicate Number Is : "+newList1);

    }
    public static  void secondMethodOfDuplicate(){

        int[] array= new int[]{4,7,66,30,7,30,6,4};
        Set<Integer> newList= new HashSet<>();
        for (Integer element : array){
            if(!newList.add(element)){
                System.out.println("the duplicate number is : "+element);
            }

        }

    }

}
