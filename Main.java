public class Main {

    public static void main  (String[] args) {

        Worker[] array = new Worker [5];
        array[0] = new Worker("Иванов Иван", "Инженер", "892312312", 30000, 30);
        array[1] = new Worker("Сидоров Петр", "Доктор", "89285268649", 40549, 41);
        array[2] = new Worker("Петров Сергей", "Менеджер", "89278572596", 15768, 51);
        array[3] = new Worker("Кулагин Иван", "Водитель", "89271526849", 25656, 64);
        array[4] = new Worker("Иванова Катерина", "Адвокат", "89284159501", 88526, 29);




       for (int i = 0; i < array.length; i++) {
           if (array[i].getAge() > 40) {
               array[i].printInfo();
           }

       }

    }
}
