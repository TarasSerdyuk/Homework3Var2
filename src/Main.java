public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        byte a = 1;
        System.out.println("Значение переменной а с типом byte равно " + a);
        short b = 30000;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 2000000000;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 3L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 1.2f;
        System.out.println("Значение переменной e с типом byte равно " + e);
        double g = 3.123;
        System.out.println("Значение переменной g с типом double равно " + g);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte ludPav = 23;
        byte annSer = 27;
        byte ekAnd = 30;
        short allPaper = 480;
        int paperOne = allPaper/(ludPav+annSer+ekAnd);
        System.out.println("На каждого ученика рассчитано " + paperOne + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte performance = 16/2;
        int perf20min = performance*20;
        System.out.println("За 20 минут машина произвела " + perf20min + " штук бутылок");
        int perf24H = performance * 24;
        System.out.println("За сутки машина произвела " + perf24H + " штук бутылок");
        int perf3Days = perf24H * 3;
        System.out.println("За 3  дня машина произвела " + perf3Days + " штук бутылок");
        int perfMonth = perf24H * 30;
        System.out.println("За месяц машина произвела " + perfMonth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte allJar = 120;
        byte whiteJar = 2;
        byte brownJar = 4;
        byte oneClassJar = (byte) (whiteJar + brownJar);
        byte quantityClass = (byte) (allJar/oneClassJar);
        byte allWhiteJar = (byte) (quantityClass * whiteJar);
        byte allBrownJar = (byte) (quantityClass * brownJar);
        System.out.println("В школе, где "+ quantityClass + " классов, нужно " + allWhiteJar + " банок белой краски и " + allBrownJar + " банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte weightBanan = 80;
        byte weightMilk = 105;
        byte weightIceCream = 100;
        byte weightEgg = 70;
        short allWeightGr = (short) (5 * weightBanan + 2 * weightMilk + 2 * weightIceCream + 4 * weightEgg);
        float allWeightKg = allWeightGr / 1000f;
        System.out.println("Вес спортзавтрака равен " + allWeightGr + " гр");
        System.out.println("Вес спортзавтрака равен " + allWeightKg + " кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        short loseWeight = 7000;
        short loseWeight250 = 250;
        short loseWeight500 = 500;
        short dayLoseWeight250 = (short) (loseWeight / loseWeight250);
        short dayLoseWeight500 = (short) (loseWeight / loseWeight500);
        float midleDay = (dayLoseWeight250+dayLoseWeight500)/2f;
        System.out.println("Потребуется " + dayLoseWeight250 + " дней для похудения, если терять каждый день 250гр");
        System.out.println("Потребуется " + dayLoseWeight500 + " дней для похудения, если терять каждый день 500гр");
        System.out.println("Потребуется " + midleDay + " дней для похудения, в среднем");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int newSalaryMasha = (int) (salaryMasha * 1.1);
        int newSalaryDenis = (int) (salaryDenis * 1.1);
        int newSalaryKristina = (int) (salaryKristina * 1.1);
        int payRiseMasha = newSalaryMasha * 12 - salaryMasha * 12;
        int payRiseDenis = newSalaryDenis * 12 - salaryDenis * 12;
        int payRiseKristina = newSalaryKristina * 12 - salaryKristina * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + payRiseMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + payRiseDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + payRiseKristina + " рублей.");
    }
}