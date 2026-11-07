package kata.example;

public class StringCalculator {
    public int add(String nums) {
        if (nums.isEmpty()) {
            return 0;
        }
        else {
            return Integer.parseInt(nums);
        }
    }
}
