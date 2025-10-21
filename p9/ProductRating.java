public class ProductRating {
    public static void main(String[] args) {
        
        int[][] ratings = {
            {4, 5, 4},  // Customer 1
            {3, 5, 3},  // Customer 2
            {4, 5, 3},  // Customer 3
            {1, 2, 1}   // Customer 4
        };

        int numCustomers = ratings.length;
        int numCriteria = ratings[0].length;

        // Calculate average per criterion
        double[] criterionAverage = new double[numCriteria];
        for (int j = 0; j < numCriteria; j++) {
            double sum = 0;
            for (int i = 0; i < numCustomers; i++) {
                sum += ratings[i][j];
            }
            criterionAverage[j] = sum / numCustomers;
        }

        // Display header
        System.out.println("Rating\tProduct\tPackaging\tDelivery");
        System.out.printf("Average\t%.2f\t%.2f\t\t%.2f\n\n",
                          criterionAverage[0], criterionAverage[1], criterionAverage[2]);

        // Display customer averages
        for (int i = 0; i < numCustomers; i++) {
            double sum = 0;
            for (int j = 0; j < numCriteria; j++) {
                sum += ratings[i][j];
            }
            double customerAverage = sum / numCriteria;
            System.out.printf("Customer %d provided the average rating %.2f\n",
                              i + 1, customerAverage);
        }
    }
}
