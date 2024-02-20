import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        /**a.	Kiểm tra tính chẵn lẻ của 1 số
         b.	Kiểm tra số nguyên tố
         c.	Kiểm tra một số có chia hết cho 3 không
         d.	Thoát
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("a.\tKiểm tra tính chẵn lẻ của 1 số\n" +
                "b.\tKiểm tra số nguyên tố\n" +
                "c.\tKiểm tra một số có chia hết cho 3 không\n" +
                "d.\tThoát\n");
        System.out.println("Mời bạn chọn menu: ");
        boolean check = true;
        do {
            String chose = sc.nextLine();
            if (chose.equals("a")||chose.equals("b")||chose.equals("c")||chose.equals("d")){
                check = false;
                switch (chose){
                    case "a":
                        System.out.println("Mời bạn nhập số nguyên bất kỳ");
                        int no = Integer.parseInt(sc.nextLine());
                        if (no%2==0){
                            System.out.println("Đây là số chan");
                        }else {
                            System.out.println("Day la so le");
                        }
                        break;
                    case "b":
                        System.out.println("Mời bạn nhập số nguyên bất kỳ");
                        int no2 = Integer.parseInt(sc.nextLine());
                        boolean checknt = true;
                        if (no2==1||no2==2){
                            System.out.println(no2+" La so nguyen to");
                        }else {
                            for (int i = 2; i <no2; i++) {
                                if (no2%i==0){
                                    checknt = false;
                                    break;
                                }
                            }
                            if (checknt) {
                                System.out.println(no2+"  la so nguyen to");
                            }else {
                                System.out.println(no2+" khong phai so nguyen to");
                            }
                        }
                        break;
                    case "c":
                        System.out.println("Mời bạn nhập số nguyên bất kỳ");
                        int no3 = Integer.parseInt(sc.nextLine());
                        if (no3%3==0){
                            System.out.printf("So %d chia het cho 3",no3);
                        }else {
                            System.out.printf("So %d khong chia het cho 3",no3);
                        }
                        break;
                    case "d":
                        System.exit(0);
                }
                return;
            }else {
                System.err.println("Mời chọn lại menu a ,b,c,d ");
            }

        }while (check);
         }
}
