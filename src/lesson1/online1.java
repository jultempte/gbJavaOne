package lesson1;

public class online1 {

    public static void main(String[] args) {
       /* System.out.println("Hello!");

        //целочисленные
        byte myByte = 25; // - 128 до 127 (1b)
        short myShort = 250; // -32768.. 32767 (2b)
        int myInt = 50000; // -2,1*10^9.. 2,1*10^9
        long myLong = 3000000000L; // -2*10^63.. 2*10^63

        //числа с плавающей точкой
        float myFloat = 15.8f; // (4b)
        double myDouble = 15.8; //(8b)

        //символы
        char myChar = 'g'; // (2b)

        boolean myBoolean = true;

        //строка
        String myString = "это строка 1 ";
        String mySrting1 = "это строка 2";

        // мат операторы: + - * / ^ %

        System.out.println(myString + mySrting1);

        */
/*
        int myAge = 18;
        if (myAge<18) {
            System.out.println("Sorry!");
        } else if(myAge>18){
            System.out.println("OK!");
        } else if(myAge==18){
            System.out.println("Goood!");
        }

 */
        // математические операции + - * / ^ &
        int a = 150;
        int b = 37;
        int result;
        //result = a + b;
        result = myCalculate(a,b);
        a = a + 5 ; // a++ ; a += 5

    }

    public static int myCalculate (int valueA, int valueB) {
        return valueA + valueB;
    }

}
