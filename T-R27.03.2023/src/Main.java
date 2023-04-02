public class Main {
    public static void main(String[] args) {
        Account account = new Account(2347, "scientist");
        Car car1 = new Car(4150, "stylish");
        Car car2 = new Car(3599, "captain");
        Phone phone1 = new Phone(1299, "scientist");
        Phone phone2 = new Phone(873,"programmer");
        Plane plane1 = new Plane(2347, "scientist");
        Plane plane2 = new Plane(3815, "programmer");
        DownshifterKit kit = new DownshifterKit(0, "stylish");

        buyObject(account, car1, car2, phone1, phone2, plane1, plane2, kit);
    }
    public static void buyObject(Account account, Car car1, Car car2, Phone phone1, Phone phone2, Plane plane1, Plane plane2, DownshifterKit kit) {
        if (account.currentAmount >= car1.price && account.category.equals(car1.category)) {
            System.out.println("You should buy a stylish car");
        } else if (account.currentAmount >= car2.price && account.category.equals(car2.category)) {
            System.out.println("You should buy a captain car");
        } else if (account.currentAmount >= phone1.price && account.category.equals(phone1.category)) {
            System.out.println("You should buy a scientist phone");
        } else if (account.currentAmount >= phone2.price && account.category.equals(phone2.category)) {
            System.out.println("You should buy a programmer phone");
        } else if (account.currentAmount >= plane1.price && account.category.equals(plane1.category)) {
            System.out.println("You should buy a scientist plane");
        } else if (account.currentAmount >= plane2.price && account.category.equals(plane2.category)) {
            System.out.println("You should buy a programmer plane");
        } else if (account.currentAmount >= kit.price && account.category.equals(kit.category)) {
            System.out.println("You should buy a stylish downshifter kit");
        } else {
            System.out.println("Sorry, you can't afford to buy any of the objects");
        }
    }
}

//   ОК     1) Создать класс "Account", который содержит в себе две переменные и конструктор для них:
//        double currentAmount, String category.
//
//   ОК     2) Создать классы Car, Phone, Plane, DownshifterKit с двумя переменными
//        в каждом и конструкторами для них:double price, String category.
//
//   ОК     3) Создать класс “Main”, в нём метод “main”.
//
//   ОК     4) В методе “main” создать 1 объект класса “Account”, 2 объекта класса Car,
//        2 объекта класса Phone,  2 объекта класса Plane, 1  объекта класса
//        DownshifterKit разными значениями “price”(“currentAmount” для объекта класса Account) у каждого.
//
//   ОК     5) Заполнить переменные “category” у каждого объекта(включая объект класса Account)
//        категориями(на выбор): “stylish”, “scientist”, “programmer”, “captain”.
//                               (Стильный) (Ученый)      (Программист) (капитан)

//   ОК     6) В классе Main написать метод , который будет определять по переменным
//        account.currentAmount и account.category c помощью конструкции if->else if… -> else,
//        какой объект из созданных должен купить человек с текущим Account’oм.
//
//        Пример: Если на счёте 1500 USD(account.currentAmount) и
//        категория человека - “scientist”(account.category), то при выборе
//
//        Plane(1500, “scientist”)
//        Phone(1500, “captain”)
//        DownshifterKit(0, “stylish”)
//
//        метод должен будет выбрать “Plane(1500, “scientist”)” т.к. и цена и
//        категория у этого объекта совпадает с тем, что содержится в аккаунте.