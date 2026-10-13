public class StudentResult {
    public static void main(String[] args) {
        int mark1 = 78;
        int mark2 = 85;

        int highest = Math.max(mark1, mark2);
        int lowest = Math.min(mark1, mark2);

        double average = (mark1 + mark2) / 2.0;
        long roundedAverage = Math.round(average);

        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);
        System.out.println("Average mark: " + average);
        System.out.println("Rounded average: " + roundedAverage);
    }
}
