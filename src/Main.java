public class Main {
    public static void main(String[] args) {

        // Задание №1


        int dog = 1;
        byte b = 2;
        short c = 3;
        long d = 4L;
        float e = 4.56F;
        double k = 4.6;
        boolean dogIsAdult = dog > 5;
        char f = 35;
        System.out.println(dogIsAdult);
        // Задание №2

        double fighter1 = 78.2F;
        double fighter2 = 82.7F;
        double weight = fighter1 + fighter2;
        double weightDifferense = fighter2 - fighter1;
        System.out.println("Общий вес " + weight);
        System.out.println("Разница " + weightDifferense);

        // Задание 3

        int bananas = 5;
        int milk = 200;
        int iseCream = 2;
        int eggs = 4;
        int Calories = bananas * 80 + iseCream * 100 + eggs * 70 + milk + 10;
        System.out.println("Количество грамм в завтраке " + Calories);
        double KilogramWeight = Calories /(float)1000;
        System.out.println(KilogramWeight);

        int LoseWeight = 7;
        int  DailyweightLoss250 = 250;
        float WeightLossPerDay = LoseWeight /(float)DailyweightLoss250;
        System.out.println(WeightLossPerDay);

        int LoseWeight2 = 7;
        int  DailyweightLoss500 = 500;
        float WeightLossPerDay2 = LoseWeight /(float) DailyweightLoss500;
        System.out.println(WeightLossPerDay2);



        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int Masha1 = Masha / 100 * 10;
        int Denis1 = Denis / 100 * 10;
        int Kristina1 = Kristina / 100 * 10;
        System.out.println("Прибавка к зарплате Маши в месяц " + Masha1);
        System.out.println("Прибавка к зарплате Денис в месяц " + Kristina1);
        System.out.println("Прибавка к зарплате Кристина в месяц " + Denis1);
        int TotalSalaryInYearMasha = Masha * 12 + Masha1 * 12;
        int TotalSalaryInYearDenis = Denis * 12 + Denis1 * 12;
        int TotalSalaryInYearKristina = Kristina * 12 + Kristina1 * 12;
        System.out.println("Общая сумма после прибавки  на 10%  " + TotalSalaryInYearMasha);
        System.out.println("Общая сумма после прибавки  на 10%  " + TotalSalaryInYearDenis);
        System.out.println("Общая сумма после прибавки  на 10%  " + TotalSalaryInYearKristina);
        int TotalSalaryInYearMashaWithout10 = TotalSalaryInYearMasha - 813120;
        int TotalSalaryInYearDenisWithout10 = TotalSalaryInYearDenis - 1004280;
        int TotalSalaryInYearKristinaWithout10 = TotalSalaryInYearKristina - 914760;
        System.out.println(" Разница в зарплате " +  TotalSalaryInYearMashaWithout10);
        System.out.println(" Разница в зарплате " + TotalSalaryInYearDenisWithout10);
        System.out.println(" Разница в зарплате " + TotalSalaryInYearKristinaWithout10);












    }
}