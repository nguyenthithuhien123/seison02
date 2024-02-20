import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("Moi ban nhap 3 canh cua tam giac");
            System.out.println("Canh 1: ");
            float a = sc.nextFloat();
            System.out.println("Canh 2: ");
            float b = sc.nextFloat();
            System.out.println("Canh 3: ");
            float c = sc.nextFloat();
            float max = a;
            float total = 0;
        if (max<=b){
            max = b;
            if (max<=c){
                max = c;
                total = a+b;
            }else {
                max = b;
                total = a+c;
            }
        } else if (max <=c) {
            max = c;
            total = b+a;
        }else {
            max = a;
            total =b+c;
        }
        if (total>max){
            float p = a+b+c;
            System.out.printf("chu vy cua tam giac la: %f\n",p);
            double dt = Math.sqrt(Math.abs(p*(p-a)*(p-b)*(p-c)));
            System.out.printf("Dien tich cua tam giac la %d",dt);
            check = false;
        }else {
            System.err.println("Khong ton tai tam giac, yeu cau nhap lai");
        }
        }while (check);
    }
}
