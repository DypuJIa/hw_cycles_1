public class Main {
    public static void main(String[] args) {
//       task1
        System.out.println("Task1");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

//        Task2
        System.out.println("Task2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

//        Task3
        System.out.println("Task3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


//        Task4
        System.out.println("Task4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

//        Task5
        System.out.println("Task5");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }
        System.out.println();

//        Task6
        System.out.println("Task6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

//        Task7
        System.out.println("Task7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i + " ");
        }
        System.out.println();
//        Task8
        System.out.println(" Task 8");
        int amount = 29_000;
        int sum = 0;
        for (int mounth = 1; mounth <= 12; mounth++) {
            sum += amount;
            System.out.println("Месяц " + mounth + " сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();
//        Task9
        System.out.println(" Task 9");
        sum = 0;
        double percent = 1D / 100;
        for (int mounth = 1; mounth <= 12; mounth++) {
            sum += amount;
            sum = (int) (sum * (1 + percent));
            System.out.println("Месяц " + mounth + " сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();
//        Task 10
        System.out.println(" Task 10");
        for (int i = 1; i <= 20; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}

