public class Main {
    public static void main(String[] args) {

        int check = 100;
        int rep = 1100;
        check = check + rep;
        int bonus = rep/100;
        if (rep>1000) {check = check + bonus;}

        System.out.println("Итоговый счет: " + check);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}