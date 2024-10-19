import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        printThreeWords();
        System.out.println("----------------------------------------------------------");
        checkSumSign();
        System.out.println("----------------------------------------------------------");
        printColor();
        System.out.println("----------------------------------------------------------");
        compareNumbers();
        System.out.println("----------------------------------------------------------");
        System.out.println(method5(11, 19));
        System.out.println("----------------------------------------------------------");
        method6(-19);
        System.out.println("----------------------------------------------------------");
        System.out.println(method7(11));
        System.out.println("----------------------------------------------------------");
        method8("Wir haben genug Zeit, wenn wir nur sie richtig verwenden", 3);
        System.out.println("----------------------------------------------------------");
        System.out.println(method9(1900));
        System.out.println("----------------------------------------------------------");
        method10();
        System.out.println("----------------------------------------------------------");
        method11();
        System.out.println("----------------------------------------------------------");
        method12();
        System.out.println("----------------------------------------------------------");
        method13();
        System.out.println("----------------------------------------------------------");
        System.out.println(Arrays.toString(method14(11, 19)));
    }

    public static void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign()
    {
        int a = 11; int b = 19;
        if (a + b >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void printColor()
    {
        int value = 19;
        if (value <= 0) System.out.println("Красный");
        else if (value > 0 && value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленый");
    }

    public static void compareNumbers()
    {
        int a = 11; int b = 19;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }

    public static boolean method5(int a, int b)
    {
        return a + b >= 10 && a + b <= 20;
    }

    public static void method6(int a)
    {
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    public static boolean method7(int a)
    {
        return a < 0;
    }

    public static void method8(String a, int b)
    {
        for (int i = 0; i < b; i++) System.out.println(a);
    }

    public static boolean method9(int a)
    {
        return a % 4 == 0 && (a % 100 != 0 || a % 400 == 0);
    }

    public static void method10()
    {
        int[] a = {1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i < a.length; i++) if (a[i] == 0) a[i] = 1; else a[i] = 0;
        System.out.println(Arrays.toString(a));
    }

    public static void method11()
    {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) a[i] = i + 1;
        System.out.println(Arrays.toString(a));
    }

    public static void method12()
    {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) if (a[i] < 6) a[i] = a[i] * 2;
        System.out.println(Arrays.toString(a));
    }

    public static void method13()
    {
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                if (j == i || j == a[i].length - i - 1) a[i][j] = 1; else a[i][j] = 0;
        Arrays.stream(a).map(Arrays::toString).forEach(System.out::println);
    }

    public static int[] method14(int len, int initialValue)
    {
        int[] a = new int[len];
        for (int i = 0; i < a.length; i++) a[i] = initialValue;//Arrays.fill(a, initialValue);
        return a;
    }
}