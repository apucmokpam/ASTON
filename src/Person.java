public class Person
{
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, int phone, int salary, int age)
    {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info()
    {
        System.out.println(name + ", возраст: " + age + ". " + position + ", з/п: " + salary
                + " рублей. Телефон: " + phone + ", email: " + email);
    }
}
