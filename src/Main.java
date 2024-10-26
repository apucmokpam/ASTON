public class Main
{
    public static void main(String[] args)
    {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван", "Инженер",
                "ivivan@mailbox.com", 892312312, 30000, 30);
        persArray[1] = new Person("Петров Пётр", "Переворачиватель пингвинов",
                "pepetr@mailbox.com", 983221213, 51764, 33);
        persArray[2] = new Person("Сергеев Сергей", "Ряспрямитель подушек",
                "sesergei@mailbox.com", 298213231, 17249, 62);
        persArray[3] = new Person("Семёнов Семён", "Садовод-терапевт",
                "sesemen@mailbox.com", 213198322, 29182, 42);
        persArray[4] = new Person("Алексеев Алексей", "Муравьиный селекционер",
                "alalex@mailbox.com", 139832212, 23146, 27);

        persArray[1].info();

        Park park = new Park();
        Park.Attraction[] attrArray = new Park.Attraction[5];
        attrArray[0] = park.new Attraction("\"Devil's eye\"", 9, "10:00 - 00:00");
        attrArray[1] = park.new Attraction("\"Wolf's fury\"", 8, "10:00 - 23:00");
        attrArray[2] = park.new Attraction("\"Infinity\"", 8.5f, "00:00 - 24:00");
        attrArray[3] = park.new Attraction("\"Funny Jimmy\"", 4, "10:00 - 20:00");
        attrArray[4] = park.new Attraction("\"9D cinema\"", 9.5f, "12:00 - 23:00");

        attrArray[2].info();
    }
}