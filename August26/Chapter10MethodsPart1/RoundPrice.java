public class RoundPrice {
    public static void main(String[] args) {
        double price = 45.678;

        double roundedPrice = Math.round(price * 100) / 100.0;

        System.out.println("Rounded price: RM" + roundedPrice);
    }
}
