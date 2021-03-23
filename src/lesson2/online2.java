package lesson2;

public class online2 {


    public static String testCodeBlockClass = "Hello";

    public static void main(String[] args) {
//        char testChar = ' ';
//        int testInt = 76;
//
//        System.out.println(testChar);
//        System.out.println(testInt);
//
//        System.out.println((int) testChar);
//        System.out.println((char) testInt);

//        int a = 20;
//        int b = 10;
//        int result;
//
//        if (a > b) {
//            result = a;
//        } else {
//            result = b;
//        }
//
//        System.out.println("Result = " + result);
//
//        result = (a > b) ? a : b; //тернарный оператор
//
//        result = (a > b) ? doSomething1() : doSomething2();
//
//        if (a > b) {
//            result = doSomething1();
//        } else {
//            result = doSomething2();
//        }

//        String name = "Qwerty";
//
//        if (name == "Elena") {
//            System.out.println("Send letter to Elena");
//        } else if (name == "Boris") {
//            System.out.println("Send letter to Boris");
//        } else if (name == "Alisa") {
//            System.out.println("Send letter to Alisa");
//        } else {
//            System.out.println("Go out office");
//        }
//        System.out.println("=================================================");
//
//        switch (name) {
//            case "Elena":
//                System.out.println("Send letter to Elena");
//                break;
//            case "Boris":
//                System.out.println("Send letter to Boris");
//                break;
//            case "Alisa":
//                System.out.println("Send letter to Alisa");
//                break;
//            default:
//                System.out.println("Go out office");
//                break;
//        }

//        System.out.println(testCodeBlockClass);
//        System.out.println(testCodeBlockMethod);
//
//        {
//            int a = 10;
//            int b = 20;
//            int c = a + b;
//            System.out.println(c);
//            System.out.println(testCodeBlockClass);
//            System.out.println(testCodeBlockMethod);
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello " + i);
//        }

//        System.out.println(powerMyMath(2, 10));
//        pifagorTable(10, 10);

//      int abc = 0;
//
//      while (abc < 10) {
//          abc++;
//          if (abc == 4 || abc == 7) continue;
//          System.out.print(abc + " | ");
//      }
//
//        System.out.println("\n============================");
//
//      int cde = 0;
//
//      do {
//          cde++;
//          if (cde == 5) break;
//          System.out.print(cde + " | ");
//      } while (cde < 10);
//       char[] myArrayInt = new char[10];
//       myArrayInt[0] = 5;
//       myArrayInt[1] = 9;
//       myArrayInt[2] = 15;
//       myArrayInt[3] = 28;
//       myArrayInt[9] = 10;

//        System.out.println(myArrayInt[0]);
//
//        for (int i = 0; i < myArrayInt.length; i++) {
//            myArrayInt[i] = (char)(55 + i);
//        }
//
//        for (int i = 0; i < myArrayInt.length; i++) {
//            System.out.print(myArrayInt[i] + " | ");
//        }
//
//        String[] myArrayString = {"Alex", "Dev_01", "Qwerty"};
//        for (int i = 0; i < myArrayString.length; i++) {
//            System.out.print(myArrayString[i] + " | ");
//        }

//        int[] myArray2 = new int[4];
//        myArray2[1] = 15;
//        myArray2[3] = 20;
//        System.out.println(myArray2[1]);
//
////        int count = 0;
////
////        for (int i = 0; i < myArray2.length; i++) {
////            for (int j = 0; j < myArray2[i].length; j++) {
////                myArray2[i][j] = count;
////                count++;
////            }
////        }
////
////        for (int i = 0; i < myArray2.length; i++) {
////            for (int j = 0; j < myArray2[i].length; j++) {
////                System.out.print(myArray2[i][j] + " | ");
////            }
////            System.out.println();
////        }
//
////        int count2 = 0;
////
////        int[][][] myArray3 = new int[3][4][5];
////        for (int i = 0; i < myArray3.length; i++) {
////            for (int j = 0; j < myArray3[i].length; j++) {
////                for (int k = 0; k < myArray3[i][j].length; k++) {
////                    myArray3[i][j][k] = count2;
////                    count2++;
////                }
////            }
////        }
////
////        for (int i = 0; i < myArray3.length; i++) {
////            for (int j = 0; j < myArray3[i].length; j++) {
////                for (int k = 0; k < myArray3[i][j].length; k++) {
////                    System.out.print(myArray3[i][j][k] + " | ");
////                }
////                System.out.println();
////            }
////            System.out.println();
////        }
//
//        System.out.println(Arrays.toString(myArray2));

        int count = 0;

        int[][] testArray = new int[3][];
        testArray[0] = new int[10];
        testArray[1] = new int[5];
        testArray[2] = new int[15];

        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray[i].length; j++) {
                testArray[i][j] = count;
                count++;
            }
        }

        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray[i].length; j++) {
                System.out.print(testArray[i][j] + " | ");
            }
            System.out.println();
        }


    }

    public static void readArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " | ");
        }
    }


//    public static int doSomething1() {
//        //****
//        System.out.println(testCodeBlockClass);
//        return 45;
//    }
//
//    public static int doSomething2() {
//        int testCodeBlockMethod = 999;
//        System.out.println(testCodeBlockMethod);
//        return 458;
//    }

//    public static int powerMyMath(int base, int signature) {
//        int result = 1;
//        for (int i = 0; i < signature; i++) {
//            result = result * base;
//        }
//        return result;
//    }
//
//    public static void pifagorTable(int width, int height) {
//        for (int y = 0; y <= height; y++) {
//            for (int x = 0; x <= width; x++) {
//                System.out.print(x * y + "\t");
//            }
//            System.out.println();
//        }
//    }

}

/**
 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
 Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в
 принятом массиве 0 на 1, 1 на 0;

 2 Задать пустой целочисленный массив размером 8. Написать метод,
 который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
 принимающий на вход массив и умножающий числа меньше 6 на 2;

 4 Задать одномерный массив. Написать методы поиска в нём
 минимального и максимального элемента;

 5 * Создать квадратный целочисленный массив
 (количество строк и столбцов одинаковое), заполнить его диагональные
 элементы единицами, используя цикл(ы);

 6*** Написать метод, которому на вход подаётся одномерный массив и
 число n (может быть положительным, или отрицательным), при этом метод
 должен циклически сместить все элементы массива на n позиций.
 [1,2,3,4,5], -2 => [3,4,5,1,2]
 [1,2,3,4,5], 2 => [4,5,1,2,3]

 7 **** Не пользоваться вспомогательным массивом при решении задачи 6.

 **/
