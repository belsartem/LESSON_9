public class Main {

    public static void main(String[] args) {
        String strToBePrinted = "Hello world!";

        // ????????????? ???? ??????
        byte aByte = (byte) 100;   //-128 ... 127
        short aShort = 100; // -32768... 32767
        int aInt = 100;
        long aLong = 100L;
        // ???? ?????? ? ????????? ??????
        float aFloat = 1.1f;
        double aDouble = 1.2d;
        // ??????????
        char aChar = '\u0000';
        // ??????????
        boolean aBoolean = false;


        // ?????????
        // 1. ?????????? =
        // ??????????????  + - * / %
        System.out.println(aByte + aShort);
        // ?????????? ????????? < > <= >= == !=
        int age = 64;
        int staj = 30;
        String name = "Dima";

        if (age >= 65 && staj >= 10 && name.equals("????")) {
            System.out.println("??????!");
        } else {
            System.out.println("?? ??????? ?????");
        }
        // ????????? && ||

        char sex = 'm';

        if (sex == 'm') {
            name = "Dima";
        } else if (sex == 'w') {
            name = "Julia";
        }


        name = (sex == 'm')
                ? "Dima"
                : "Julia";


        System.out.println(strToBePrinted);


        Human dima = new Human(34, "Dima", true);
    }
}