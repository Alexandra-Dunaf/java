public class Worker {
    private String name;
    private String post;
    private String phone;
    private int salary;
    private int age;


    public Worker(String name, String post, String phone, int salary, int age) {
        this.name =name;
        this.post = post;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public int getAge() {
        return age;
    }


    public void printInfo() {
        System.out.println("Имя сотрудника: " + name);
        System.out.println("Должность: " + post);
        System.out.println("Номер телефона: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();

    }
}



