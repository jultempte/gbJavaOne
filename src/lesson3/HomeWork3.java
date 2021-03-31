package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    public static char [][] map;
    public static int sizeMapX;
    public static int sizeMapY;

    public static char human = 'X';
    public static char ai = '0';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);

    public static Random random = new Random();

    public static void createMap(int sizeX, int sizeY){
        sizeMapX = sizeX;
        sizeMapY = sizeY;
        map = new char [sizeMapY][sizeMapX];
        for (int y = 0; y < sizeMapY; y++){
            for (int x = 0; x < sizeMapX; x++) {
                map[y][x] = empty;
            }
        }

    }

    public static void printMap(){
        System.out.println("-----------------");
        for (int y = 0; y < sizeMapY; y++){
            for (int x = 0; x < sizeMapX; x++) {
                System.out.print(map[y][x] + " | ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }

    public static void turnAi(){
        int x;
        int y;

        do {
            x = random.nextInt(sizeMapX);
            y = random.nextInt(sizeMapY);
        }while (!emptyCell(y,x));

        map[y][x] = ai;
    }

    public static void turnHuman(){
        int x;
        int y;

        do {
            System.out.print("Please write your X - coordinates: ");
            x = scanner.nextInt() - 1;

            System.out.print("Please write your Y - coordinates: ");
            y = scanner.nextInt() - 1;
        }while ((!validCell(y,x)) || (!emptyCell(y,x)));

        map[y][x] = human;

    }

    public static boolean validCell (int y, int x){
        return x >= 0 && x < sizeMapX && y >= 0 && y < sizeMapY;
    }

    public static boolean emptyCell(int y, int x){
        return map[y][x] == empty;
    }

    public static boolean checkWin(char player){
//        if (map[0][0] == player && map[0][1] == player && map[0][2] == player) return true; //горизонталь
//        if (map[1][0] == player && map[1][1] == player && map[1][2] == player) return true;
//        if (map[2][0] == player && map[2][1] == player && map[2][2] == player) return true;

        int sumPlayer = (int)player*sizeMapY;

        for (int y = 0; y < sizeMapY; y++) { // горизонталь
            int sumWinHor = 0;
            for (int x = 0; x < sizeMapX; x++) {
                sumWinHor += map[y][x];
            }
            if (sumWinHor == sumPlayer){return true;}
        }

//        if (map[0][0] == player && map[1][0] == player && map[2][0] == player) return true; // вертикаль
//        if (map[0][1] == player && map[1][1] == player && map[2][1] == player) return true;
//        if (map[0][2] == player && map[1][2] == player && map[2][2] == player) return true;


        for (int x = 0; x < sizeMapX; x++) { // горизонталь
            int sumWinVert = 0;
            for (int y = 0; y < sizeMapY; y++) {
                sumWinVert += map[y][x];
            }
            if (sumWinVert == sumPlayer){return true;}
        }


        for (int x = 0; x < sizeMapX; x++) { // диагональ 1
            int sumWinDiag = 0;
            sumWinDiag += map[x][x];
            if (sumWinDiag == sumPlayer){return true;}
        }


        for (int y = 0; y < sizeMapY; y++) {// диагональ 2
            int sumWinDiag = 0;
            for (int x = sizeMapX; x > 0; x--) {
                sumWinDiag +=  map[y][x];
                if (sumWinDiag == sumPlayer) {
                    return true;
                }
            }
        }


//        if (map[0][0] == player && map[1][1] == player && map[2][2] == player) return true; // диагональ
//        if (map[0][2] == player && map[1][1] == player && map[2][0] == player) return true;
        return false;
    }

    public static boolean isDraw(){
        for (int y = 0; y < sizeMapX; y++) {
            for (int x = 0; x <sizeMapY ; x++) {
               if(map[y][x] == empty){
                   return false;
               }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        createMap(3, 3);
        printMap();

        while (true) {
            turnHuman();
            printMap();
            if (checkWin(human)) {
                System.out.println("Human win!");
                break;
            }
            if (isDraw()) {
                System.out.println("DRAW!!!");
                break;
            }

            turnAi();
            printMap();
            if (checkWin(ai)) {
                System.out.println("AI win!");
                break;
            }
            if (isDraw()) {
                System.out.println("DRAW!!!");
                break;
            }
        }
    }
}