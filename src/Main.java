public class Main {
    public static void main(String[] args) {
        int ticketPriceRub = 13676;
        int rublesPerMile = 20;
        int bonusMiles = ticketPriceRub / rublesPerMile;

        // Вывод результата
        System.out.println("Начислено бонусных миль: " + bonusMiles);
    }
}