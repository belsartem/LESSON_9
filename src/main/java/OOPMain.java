import java.util.*;

public class OOPMain {

    public static void main(String[] args) {
        Human dima = new Human(34, "Dima", true);
        Human valentin = new Human(30, "Valentin", true);


        int newAge = 10;
        dima = dima.incrementAge(newAge);
//        System.out.println("newAge var: " + newAge);


        List<String> hobbies = List.of("Play guitar", "football");
//        dima.printHobbies(hobbies);
//        System.out.println("hobbies var: " + hobbies);

        int[] intArrayFirst = new int[] {10, 20, 200, 2345,342534,2345342};
        int[] intArraySecond = new int[] {50, 70, 300};

        int[][] array2 = new int[][] {intArrayFirst, intArraySecond};

        for (int i = intArrayFirst.length - 1; i >= 0; i--) {
            System.out.println("Element with index: " + i + ": " + intArrayFirst[i]);
        }



        for (int element : intArrayFirst) {
            if (element == 20) {
                System.out.println("Founded element : " + element);
                break;
            }
        }


        boolean founded = false;
        while (!founded) {
            founded = true;

        }

        List<Integer> intList = new ArrayList<>();
        intList.addAll(List.of(10, 20, 200));


        for (int i = intList.size() - 1; i >= 0; i--) {
            System.out.println("Element with index: " + i + ": " + intList.get(i));
        }



        for (int element : intList) {
            if (element == 20) {
                System.out.println("Founded element : " + element);
                break;
            }
        }


        Map<String, Human> humans = new HashMap<>();
        humans.put("324542", dima);
        humans.put("876434", valentin);

        Human human = humans.get("876434");

        for (Map.Entry<String, Human> entry : humans.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        for (String key : humans.keySet()) {

        }

        for (Human val : humans.values()) {

        }


        Set<String> strSet = Set.of("Dima", "Petr");

        Object obj = new Object();

//
//        System.out.println(dima);
    }


}