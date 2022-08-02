public class Main {
 public static void main(String[] args) {
  task1();
  task2();
  task3();
  task4();
  task5();
 }

 public static void task1() {
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
 }


   public static void  task2() {
    // Задание №2


    double fighter1 = 78.2;
    double fighter2 = 82.7;
    double weight = fighter1 + fighter2;
    double weightDifferense = Math.abs(fighter2 - fighter1);
    System.out.println("Общий вес " + weight);
    System.out.println("Разница " + weightDifferense);

 }
   public static void  task3() {

   // Задание 3

    int banana = 5;
    int bananaWeight = 80;


    int milk = 200 / 100;
    int milkWeight = 105;

    int iseCream = 2;
    int iseCreamWeight = 100;

    int eggs = 4;
    int eggWeight = 70;

    int total = (banana * bananaWeight) + (milk * milkWeight) + (iseCream * iseCreamWeight) + (eggs * eggWeight);
    int gramInKg = 1000;
    double totalKgs =  (double) total / 1000;
    System.out.println(totalKgs);

 }

 public static void  task4() {
  int weight = 7;
  int gramInKg = 1000;
  int weightInGrams = weight * gramInKg;

  int minInGramsPerDay = 250;
  int maxInGramsPerDay = 500;

  int minDays = weightInGrams / maxInGramsPerDay;
  int maxDays = weightInGrams / minInGramsPerDay;

  int aveDays = (minDays + maxDays) / 2;

  System.out.println("Min " +  minDays);
  System.out.println("Max " +  maxDays);
  System.out.println("Avg" +  aveDays);

 }
  public static void task5() {

  int percent = 10;
  double multiplier = percent / (100 * 1.0);

   int mashaSalary = 67_760;
   int denisSalary = 83_690;
   int kristinaSalary = 76_230;

   int mashaNewSalary = (int) (mashaSalary + (mashaSalary * multiplier));
   int denisNewSalary = (int) (denisSalary + (denisSalary * multiplier));
   int kristinaNewSalary = (int) (kristinaSalary + (kristinaSalary * multiplier));

   int mashaDefferense = (mashaNewSalary - mashaSalary) * 12;
   int denisDefferense = (denisNewSalary - denisSalary) * 12;
   int kristinaDefferense = (kristinaNewSalary - kristinaSalary) * 12;

   System.out.println("Маши новая зп " + mashaNewSalary + " Разница " + mashaDefferense);
   System.out.println("Денис новая зп "  + denisNewSalary + " Разница "  + denisDefferense);
   System.out.println("Денис новая зп "  + kristinaNewSalary + " Разница "  + kristinaDefferense);


 }
}