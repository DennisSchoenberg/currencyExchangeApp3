import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyExchangeApp currencyExchangeApp = new CurrencyExchangeApp();
        Scanner scanner = new Scanner(System.in);
// add
        try {
            int choice;
            do {
                currencyExchangeApp.displayMenu();
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        currencyExchangeApp.performExchange(scanner);
                        break;
                    case 2:
                        currencyExchangeApp.viewExchangeHistory();
                        break;
                    case 3:
                        System.out.println("Выход из программы. До свидания!");
                        break;
                    default:
                        System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
                }
            } while (choice != 3);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}




