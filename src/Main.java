public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);


        System.out.println();
        System.out.println("Price 20");
        System.out.println(service.calculate(20));

        System.out.println();
        System.out.println("Price 5");
        System.out.println(service.calculate(5));

        System.out.println();
        System.out.println("Price 9_876");
        System.out.println(service.calculate(9876));

        // int flyTicket; // переменная Стоимость авиа билета
        // int payBonus = 20; // цена 1-ой бонусной мили
        // int bonusMiles; // переменная бонусные мили
        // flyTicket = 13_676;
        // bonusMiles = flyTicket / payBonus; // Расчет количества бонусных миль
        // System.out.println("Бонусные мили = " + bonusMiles); // Код по 2-му варианту
    }
}