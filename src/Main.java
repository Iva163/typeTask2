public class Main {
    public static void main(String[] args) {

        int check = 100;
        int rep = 1255;
        check = check + rep;
        int bonus = 0;
        if (rep>1000) {
            bonus = rep/100;
            check = check + bonus;
        }

        System.out.println("Итоговый счет: " + check);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}