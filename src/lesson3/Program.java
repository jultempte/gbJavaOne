package lesson3;

        import java.util.Random;
        import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 24.03.2021
 */

public class Program {

    public static char[][] map;
    public static int sizeMapX;
    public static int sizeMapY;

    public static char human = 'X';
    public static char ai = 'O';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random(); //[0;1)

    public static void createMap(int sizeX, int sizeY) {
        sizeMapX = sizeX;
        sizeMapY = sizeY;
        map = new char[sizeMapY][sizeMapX];

        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                map[y][x] = empty;
            }
        }
    }

    public static void printMap() {
        System.out.println("------------------");
        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                System.out.print(map[y][x] + " | ");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }

    public static void turnHuman() {
        int x;
        int y;

        do {
            System.out.print("Please write your X - coordinates: ");
            x = scanner.nextInt() - 1;
            System.out.print("Please write your Y - coordinates: ");
            y = scanner.nextInt() - 1;
        } while (!validCell(y, x) || (!emptyCell(y, x)));
        map[y][x] = human;
//        if (validCell(y, x) && emptyCell(y,x)) {
//            map[y][x] = human;
//        } else {
//            turnHuman();
//        }
    }

    public static boolean validCell(int y, int x) {
        return x >= 0 && x < sizeMapX && y >= 0 && y < sizeMapY;
    }

    public static boolean emptyCell(int y, int x) {
        return map[y][x] == empty;
    }

    public static void turnAi() {
        int x;
        int y;

        do {
            x = random.nextInt(sizeMapX); //[0;3)
            y = random.nextInt(sizeMapY); //[0;3)
        } while (!emptyCell(y, x));
        map[y][x] = ai;
//        if (emptyCell(y,x)) {
//            map[y][x] = ai;
//        } else {
//            turnAi();
//        }
    }

    public static boolean checkWin(char player) {
        if (map[0][0] == player && map[0][1] == player && map[0][2] == player) return true;
        if (map[1][0] == player && map[1][1] == player && map[1][2] == player) return true;
        if (map[2][0] == player && map[2][1] == player && map[2][2] == player) return true;

        if (map[0][0] == player && map[1][0] == player && map[2][0] == player) return true;
        if (map[0][1] == player && map[1][1] == player && map[2][1] == player) return true;
        if (map[0][2] == player && map[1][2] == player && map[2][2] == player) return true;

        if (map[0][0] == player && map[1][1] == player && map[2][2] == player) return true;
        if (map[0][2] == player && map[1][1] == player && map[2][0] == player) return true;
        return false;
    }

    public static boolean isDraw() {
        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                if (map[y][x] == empty) {
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

/**
 * Полностью разобраться с кодом, попробовать переписать с нуля;
 * ^ Усовершенствовать метод проверки победы (через циклы);
 * ^ Расширить поле до 5х5 и в качестве условий победы установить серию равной 4.
 * ^^ Проработать базовый искусственный интеллект, чтобы он мог блокировать ходы игрока.
 */

