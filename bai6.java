public class bai6 {
    public static void main(String[] args) {
        /**[Bài tập] Hiển thị 20 số nguyên tố đầu tiên*/
        System.out.print("20 số nguyên tố đầu tiên là 1 , 2 ");
        int count = 2;
        int n=3;
        while (count<=19){
            boolean check = true;
            for (int i = 2; i <n ; i++) {
                if (n%i==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.print(", "+n);
                count++;
            }
            n++;
        }
    }
}
