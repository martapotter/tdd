package kata.example;

import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String nums) {
        if (nums.isEmpty()) {
            return 0;
        }
        String delimiter = "[,\n]";
        String numsWithoutDel = nums;
        if (nums.startsWith("//")) {
            int delimiterEnd = nums.indexOf("\n");
            String otherDelimiter = nums.substring(2, delimiterEnd);
            numsWithoutDel = nums.substring(delimiterEnd +1);
            delimiter = Pattern.quote(otherDelimiter);
        }

        String[] tokens = numsWithoutDel.split(delimiter);
        int sum = 0;
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return sum;
    }
}
