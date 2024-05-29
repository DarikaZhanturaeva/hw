import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myAge;
        final int NUM = 50;
        String world = "World";
        myAge = NUM + world;
        String name = "Введите ваше имя:";
        System.out.print(myAge);
        System.out.print(NUM);
        System.out.println(world);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("“Вы сохранили ноль");
        }
        //dop
        Scanner scanner = new Scanner(System.in);
        System.out.println(name);
        String name1 = scanner.next();
        System.out.println("Здравствуй " + name1);
    }
}
