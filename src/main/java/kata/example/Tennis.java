package kata.example;

public class Tennis {
    public String score(int num1, int num2) {
        return scoreToWords(num1) + "-" + scoreToWords(num2);
    }


    public String scoreToWords(int points) {
        switch (points) {
            case 0: return "Love";
            case 1: return "Fifteen";
            default: return "";
        }
    }

}
