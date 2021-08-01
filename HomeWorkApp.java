public class HomeWorkApp {
    public static void checkSumSign() {
        int a = 10;
        int b = 3;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        else  {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 3;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (0 <= value && value <= 100) {
            System.out.println("желтый");
        }
        else if (value > 100) {
            System.out.println("зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 2;
        int b = 4;
        if (b <= a) {
            System.out.println("a => b");
        }
        else if (a <= b) {
            System.out.println(" a < b ");

        }
    }
    public static void main(String[] args) {
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println("Orange\n" + "Banana\n" + "Appele");

    }
}
