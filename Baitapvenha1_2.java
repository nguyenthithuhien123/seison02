import java.util.Scanner;

public class Baitapvenha1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**[Bài tập] Kiểm tra 1 số có chia hết cho 3 và 5*/
        System.out.println("Nhập vào số cần kiểm tra!");
        int n = sc.nextInt();
        if (n%3==0&&n%5==0){
            System.out.printf("Số %d chia hết  cho cả  3 và 5",n);
        }else {
            System.out.printf("Số %d không chia hết cho cả 3 và 5",n);
        }

          /**[Bài tập] Chuyển đổi số thành chữ **/
        System.out.println("Nhập vào số từ 0-9");
        do {
            int no = sc.nextInt();
            if (no>=0&&no<=9){
                switch (no){
                    case 0:
                        System.out.println("số không");
                        break;
                    case 1:
                        System.out.println("số một");
                        break;
                    case 2:
                        System.out.println("số hai");
                        break;
                    case 3:
                        System.out.println("số ba");
                        break;
                    case 4:
                        System.out.println("số bốn");
                        break;
                    case 5:
                        System.out.println("số năm");
                        break;
                    case 6:
                        System.out.println("số sáu");
                        break;
                    case 7:
                        System.out.println("số bảy");
                        break;
                    case 8:
                        System.out.println("số tám");
                        break;
                        case 9:
                        System.out.println("số chín");
                        break;
                }
                return;
            }else {
                System.out.println("Hãy nhập lại số từ 0-9");
            }
        }while (true);
        /**[Bài Tập] Hiển thị ra những số chia hết cho cả 3 và 5 trong khoảng từ 1 đến 100*/

    }
}
