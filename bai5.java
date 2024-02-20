public class bai5 {
    public static void main(String[] args) {
        /**Hiển thị các số nguyên tố nhỏ hơn 100*/
        System.out.print("Số nguyên tố nhỏ hơn 100 là 1, 2 ");
        for (int i = 3; i < 100; i += 2) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                {
                    System.out.print(", "+i) ;
                }
            }
        }
    }
}
