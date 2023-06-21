public class SalesTaxx {

    public static void main(String[] args)
    {
        double itemPrice;
        double salesTax;
        double newPrice;
        System.out.println("What is the price of your item?: ");
        itemPrice=5;
        salesTax=itemPrice* .5;
        newPrice=itemPrice+salesTax;
        System.out.println("Your overall item price with sales tax is: $"+newPrice);
        System.out.println("Your sales tax for the item is: $"+salesTax);
    }
}
