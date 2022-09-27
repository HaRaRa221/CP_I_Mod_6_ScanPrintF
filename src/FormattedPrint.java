public class FormattedPrint
{
    public static void main(String[] args)
    {
        String name = "Thomas Edward Wulf";
        double salary = 12345.12345;
        int age = 64;

        for(int x = 0; x < 10; x++)
          System.out.printf("\nRecord: %-20s%5d%15.2f", name, age, salary);


        System.out.println(String.format("\n%15.2f", salary));
    }
}
