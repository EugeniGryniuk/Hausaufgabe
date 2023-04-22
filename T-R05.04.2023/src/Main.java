import java.util.Scanner;
// прошу прощение что так поздно отсылаю домашку,
// надеюсь я правильно все понял,
// ибо пришлось еще досматривать доп уроки из интернета
public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в математический quiz!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String player1Name = scanner.nextLine();
        Player player1 = new Player(player1Name);

        System.out.print("Введите имя второго игрока: ");
        String player2Name = scanner.nextLine();
        Player player2 = new Player(player2Name);

        System.out.println("\nНачинаем игру!");
        for (int i = 1; i <= 5; i++) {
            Question question = new Question();
            System.out.println("Вопрос " + i + ": " + question.getQuestion());

            Player currentPlayer = i % 2 == 1 ? player1 : player2;
            int answer = scanner.nextInt();

            if (question.checkAnswer(answer)) {
                System.out.println("Правильно!");
                currentPlayer.addPoints(5);
            } else {
                System.out.println("Неправильно. Правильный ответ: " + question.getAnswer());
                currentPlayer.addPoints(-5);
            }
        }

        System.out.println("\nИгра окончена!");
        System.out.println(player1.getName() + " - " + player1.getPoints() + " баллов");
        System.out.println(player2.getName() + " - " + player2.getPoints() + " баллов");
    }
}
