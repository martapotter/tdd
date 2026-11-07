package kata.example;

public class Tennis {
    public String score(int num1, int num2) {
        /*if (num1==4) {
            return "Advantage Player 1";
        }

        else if (num2==4) {
            return "Advantage Player 2";
        }

        else if (num1 != num2) {
            return scoreToWords(num1) + "-" + scoreToWords(num2);
        }
        else {
            if (num1==0) {
                return scoreToWords(num1) + "-" + scoreToWords(num2);
            }
            else if (num1==3) {
                return "Deuce";
            }
            else {
                return scoreToWords(num1) + "-All";
            }
        } */
        if (num1==num2) {
            switch (num1) {
                case 0: return "Love-Love";
                case 1: return "Fifteen-All";
                case 2: return "Thirty-All";
                case 3: return "Deuce";
                default: return "";
            }
        }
        else if (num1>=4 || num2>=4) {
            switch (num1 - num2) {
                case 1: return "Advantage Player 1";
                case -1: return "Advantage Player 2";
                case 2: return "Player 1 wins";
                case -2: return "Player 2 wins";
                default: return "";
            }
        }

        else {
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
