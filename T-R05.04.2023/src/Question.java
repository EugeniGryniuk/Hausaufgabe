import java.util.Random;

public class Question {
    private String question;
    private int answer;

    public Question() {
        Random random = new Random();
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        int operation = random.nextInt(4);

        switch (operation) {
            case 0:
                question = number1 + " + " + number2 + " = ";
                answer = number1 + number2;
                break;
            case 1:
                question = number1 + " - " + number2 + " = ";
                answer = number1 - number2;
                break;
            case 2:
                question = number1 + " * " + number2 + " = ";
                answer = number1 * number2;
                break;
            case 3:
                question = number1 + " / " + number2 + " = ";
                answer = number1 / number2;
                break;
        }
    }

    public String getQuestion() {
        return question;
    }

    public int getAnswer() {
        return answer;
    }

    public boolean checkAnswer(int answer) {
        return this.answer == answer;
    }
}
