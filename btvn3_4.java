import java.util.Scanner;

public class btvn3_4 {
    public static void main(String[] args) {
        /**[Bài Tập] Hiển thị ra những số chia hết cho cả 3 và 5 trong khoảng từ 1 đến 100*/
        for (int i = 5; i <= 100; i += 5) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("  " + i);
            }
        }
        /**[Bài tập] Tính tổng các số chẵn trong khoảng cho trước*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Bài 4");
        System.out.println("Nhập số thứ nhất");
        int no1 = sc.nextInt();
        System.out.println("Nhập số thứ 2");
        int no2 = sc.nextInt();
        int total = 0;
        if (no1 < no2) {
            for (int i = no1; i <= no2; i++) {
                if (i % 2 == 0) {
                    total += i;
                }
            }
            System.out.printf("Tổng số chẵn trong khoảng từ %d đến %d là : %d",no1,no2,total);
        } else {
            for (int i = no2; i <= no1; i++) {
                if (i % 2 == 0) {
                    total += i;
                }
            }
            System.out.printf("Tổng số chẵn trong khoảng từ %d đến %d là : %d",no2,no1,total);
        }

    }
}