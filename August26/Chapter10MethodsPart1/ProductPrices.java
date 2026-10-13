public class ProductPrices {
    public static void main(String[] args) {
        double price1 = 250;
        double price2 = 180;

        double highest = Math.max(price1, price2);
        double lowest = Math.min(price1, price2);

        System.out.println("Highest price: RM" + highest);
        System.out.println("Lowest price: RM" + lowest);
    }
}
