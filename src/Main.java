public class Main {
    public static void main(String[] args) {
        /*
        Базовый синтаксис:
         пока     условие
        while (condition) {
            // тело цикла:
        }
         */
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
        } while (i < 5);

    }
}