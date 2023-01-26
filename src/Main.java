public class Main {
    public static void main(String[] args) {
        // переменная, которая содержит информацию об изначальном количестве средств на счете клиента
        int amountMoneyAccoun = 13502;
        // переменная, которая содержит информацию о сумме пополнения
        int replenishmentAmount = 700;
        // заранее объявляем переменную, в которой будет указано количество начисленных бонусных рублей
        int bonusRubles;
        // заранее объявляем переменную для внесения в нее суммы на счете после пополнения и добавления бонусов
        int totalAccountWithBonuses;
        // заранее объявляем переменную для внесения в нее суммы на счете после пополнения, если бонусы не были начислены
        int totalAccountNoBonuses;

        // Проверяем является ли сумма пополнения больше, чем 1000 и если да, то считаем сколько денег будет у клиента
        // после пополнения и начисления бонусов
        if (replenishmentAmount > 1000) {
            bonusRubles = replenishmentAmount / 100;
            totalAccountWithBonuses = amountMoneyAccoun + replenishmentAmount + bonusRubles;
            System.out.println("Благодарим за пополнение счета!");
            System.out.println("Теперь у Вас на счете " + totalAccountWithBonuses + " рублей");
            System.out.println("Сумма бонусных рублей за пополнение свыше, чем на 1000 рублей составила " + bonusRubles + " рублей");
            // Если сумма пополнения была меньше 1000, то считаем без бонусов :(
        } else {
            totalAccountNoBonuses = amountMoneyAccoun + replenishmentAmount;
            System.out.println("Благодарим за пополнение счета!");
            System.out.println("Теперь у Вас на счете " + totalAccountNoBonuses + " рублей");
        }
    }
}