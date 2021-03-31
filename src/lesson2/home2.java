package lesson2;

import java.util.Arrays;

public class home2 {
    public static void main(String[] args) {

        int [] numsArrays = {1, 1, 0, 0, 1, 0, 2, 1, 0, 0 };
        replacementValues(numsArrays);

        int [] emptyArray = new int[8];
        fillingArray(emptyArray);

        int [] arrayForMultiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        multiplicationArray(arrayForMultiplication);

        int [] ultimateArray = {-1, 8, 2, 0, 11, -10};
        searchUltimateInArray(ultimateArray);

        int [][] squareArray = new int [5][5];
        fillSquareArray(squareArray);

        /**
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
    }

    /**
     1 Задать целочисленный массив, состоящий из элементов 0 и 1.
     Например: [ 1, 1, 0, 0, 1, 0, 2, 1, 0, 0 ]. Написать метод, заменяющий в
     принятом массиве 0 на 1, 1 на 0;
     **/
    public static void replacementValues (int [] inputArray){
        for (int i = 0; i < inputArray.length;  i++){
            if(inputArray[i] == 0){
                inputArray[i] = 1;
            } else if(inputArray[i] == 1){
                inputArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(inputArray));
        }

    /**
     2 Задать пустой целочисленный массив размером 8. Написать метод,
     который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;**/

    public static void fillingArray(int [] inputArray){
        int value = 1;
        for(int i=0; i < 8; i++){
            inputArray[i] = value;
            value +=3;
        }
        System.out.println(Arrays.toString(inputArray));
    }

    /**
     3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
     принимающий на вход массив и умножающий числа меньше 6 на 2;**/

    public static void multiplicationArray(int [] inputArray){
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] < 6){
                inputArray[i] =inputArray[i] * 2;
            }

        }
        System.out.println(Arrays.toString(inputArray));
    }

    /**
     4 Задать одномерный массив. Написать методы поиска в нём
     минимального и максимального элемента;**/

    public static void searchUltimateInArray(int [] inputArray){
        int minValue = inputArray[0];
        int maxValue = inputArray[0];
        for(int i= 1; i < inputArray.length; i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            } else if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        System.out.println(Arrays.toString(inputArray));
        System.out.println("maxValue: " + maxValue);
        System.out.println("minValue: " + minValue);
    }

    /**
     5 * Создать квадратный целочисленный массив
     (количество строк и столбцов одинаковое), заполнить его диагональные
     элементы единицами, используя цикл(ы);
     **/
    public static int[][] fillSquareArray(int [][] inputArray){
        int j = 0;
        int k = inputArray.length;
        for (int i = 0; i < inputArray.length; i++){
            inputArray[i][j] = 1;
            inputArray[i][k] = 1;
            j ++;
            k --;
        }
        return inputArray;
    }
}

