public class Main {
    public static void main(String[] args) {
        int initial = 100; // Сколько средств на счете у клиента
        int sum = 1500;// Сколько средств клиент внес на счет
        int bonus = sum / 100; // 1 бонус = 100 рублей, если клиент пополняет счет более чем на 1000 рублей
        if (sum <= 1000) {
            bonus = 0;
        }
            System.out.println("Счет клиента с учетом начисленных бонусов составляет:");
            System.out.println(initial + sum + bonus);
        }
    }
