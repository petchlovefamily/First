import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int ans = rd.nextInt(100);
        int input;
        for (int i = 0; i < 3; i++) {
            System.out.print("Input number : ");
            input = sc.nextInt();
            if (input == ans) {
                System.out.println("Correct");
                break;
            }else if (input > ans){
                System.out.println("too high, try again");
            }else if (input < ans){
                System.out.println("too low, try again");
            }
        }
    }
}
