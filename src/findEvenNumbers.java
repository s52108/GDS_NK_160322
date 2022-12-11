import java.util.*;

public class findEvenNumbers {

    public static void main(String[] args) {

        List<Integer> helperList = new ArrayList<>();
        System.out.println(findEvenNumbers(15, helperList).toString());
    }

    public static List<Integer> findEvenNumbers(int numbersCount, List<Integer> helperList) {
        if (numbersCount < 1) {
            return helperList;
        } else {
            if (numbersCount % 2 == 0) {
                helperList.add(numbersCount);
            }
            return findEvenNumbers(numbersCount - 1, helperList);
        }
    }


    public static List<Integer> reorderNumbers(ArrayList<Integer> number) {


            int temp = number.get(0);
            number.set(0, number.get(number.lastIndexOf(number)));
            number.set(number.size(), temp);
            //reorderNumbers(number.subList());






    }
}
