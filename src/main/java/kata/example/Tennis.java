package kata.example;

public class Tennis {
    public String score(int num1, int num2) {
        if (num1 != num2) {
            return scoreToWords(num1) + "-" + scoreToWords(num2);
        }
        else {
            if (num1==0) {
                return scoreToWords(num1) + "-" + scoreToWords(num2);
            }
            else {
                return scoreToWords(num1) + "-All";
            }
        }

    }


    public String scoreToWords(int points) {
        switch (points) {
            case 0: return "Love";
            case 1: return "Fifteen";
            case 2: return "Thirty";
            default: return "";
        }
    }

}
