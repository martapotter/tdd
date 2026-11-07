package kata.example;

public class Tennis {
    public String score(int num1, int num2) {
        if (num1==num2) {
            return switch (num1) {
                case 0 ->  "Love-Love";
                case 1 ->  "Fifteen-All";
                case 2 ->  "Thirty-All";
                case 3 -> "Deuce";
                default ->  "";
            };
        } else if (num1>=4 || num2>=4) {
            return switch ((Integer) num1 - num2) {
                case 1 -> "Advantage Player 1";
                case -1 -> "Advantage Player 2";
                case Integer diff when diff >= 2 -> "Player 1 wins";
                case Integer diff -> "Player 2 wins";
            };
        } else {
            return scoreToWords(num1) + "-" + scoreToWords(num2);
        }
    }


    public String scoreToWords(int points) {
        switch (points) {
            case 0: return "Love";
            case 1: return "Fifteen";
            case 2: return "Thirty";
            case 3: return "Forty";
            default: return "";
        }
    }

}
