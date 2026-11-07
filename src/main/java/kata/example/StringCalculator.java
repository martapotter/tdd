package kata.example;

public class StringCalculator {
    public int add(String nums) {
        if (nums.isEmpty()) {
            return 0;
        } else {
            String[] tokens = nums.split(",");
            int sum = 0;
            for (String token : tokens) {
                sum += Integer.parseInt(token);
            }
            return sum;
        }
    }
}
