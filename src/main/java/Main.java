public class Main {
    public static void main(String[] args) {
        int min = 80;
        int max = 100;
        for (int r : new Randoms(min, max)) {
            System.out.println("Случайное число: " + r);
            if (r == max) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}