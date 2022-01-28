import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startIncl = scanner.nextInt();
        int endIncl = scanner.nextInt();
        int devNum = scanner.nextInt();
        int count = 0;
        for (int i = startIncl; i <= endIncl; i++) {
            if (i % devNum == 0) {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}