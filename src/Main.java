public class Main {
    public static void main(String[] args) {
        int flyTicket; // переменная Стоимость авиа билета
        int payBonus = 20; // цена 1-ой бонусной мили
        int bonusMiles; // переменная бонусные мили
        flyTicket = 13_676;
        bonusMiles = flyTicket / payBonus; // Расчет количества бонусных миль
        // int x = 20;
        // int p = 20;

        // System.out.println(x / p + " Бонусных (-ая, ые) миль (-я, -и)");
        System.out.println("Бонусные мили = " + bonusMiles); // Код по 2-му варианту
    }
}