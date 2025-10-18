import java.util.Scanner;

class Solution {
    public void solution(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// repeat
// for (int i = 0; i < n; i++) {
//     System.out.println("*".repeat(i+1));
// }