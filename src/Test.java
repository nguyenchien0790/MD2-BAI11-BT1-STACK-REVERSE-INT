import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<String>();

        System.out.println("Nhap vao chuoi : ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i)+"");

        }
        System.out.println("Chuoi dao nguoc : ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackChuoi.pop());

        }
//        Cac lenh trong Stack
//        stackChuoi.push("giatri");
//        stackChuoi.pop();
//        stackChuoi.peek();
//        stackChuoi.clear();
//        stackChuoi.contains("gia tri")
    }
}
