public class Park
{
    public class Attraction
    {
        private String name;
        private float price;
        private String openingHours;

        public Attraction(String name, float price, String openingHours)
        {
            this.name = name;
            this.price = price;
            this.openingHours = openingHours;
        }

        public void info()
        {
            System.out.println("Аттракцион " + name + " стоит " + price + " рублей. Часы работы: " + openingHours);
        }
    }
}
