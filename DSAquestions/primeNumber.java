package DSAquestions;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i=2;i<n;i++){
            if(n%i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Prime");
        }else{
            System.out.println("not prime");
        }
//        for(int i=2;i<=n;i++){
//           boolean flag =true;
//           for (int j=2;j<=i/2;j++){
//               if(i%j == 0){
//                   flag = false;
//                   break;
//               }
//           }
//            if(flag){
//                System.out.println(i);
//            }
//
//        }
    }
}
