package Patterns;

public class Abrar_Pattern17 {

    public static int combination(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n* factorial(n-1);
    }
    public static void pascalTriangle(int n){
        for(int i=0;i<n;i++){

            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<=i;k++){
                System.out.print(combination(i,k)+" ");
            }
            System.out.println();
        }
    }
    public static void starPyramid(int n){
        int i,j;
        for (i=1;i<=n;i++){
            for (j=n;j>=i;j--){
                System.out.print(" ");
            }

            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            for (j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void invertedStarPyramid(int n){
        int i,j,sp;
        for (i=n;i>=1;i--){
            for (sp=n;sp>i;sp--){
                System.out.print(" ");
            }
            for (j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void diamondStarPattern(int n){
        int i,j,sp;
        //print top triangle
        for (i=1;i<=n;i++) {
            for (sp = n; sp > i; sp--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            for (i=n;i>=1;i--){
                for (sp=n;sp>i;sp--){
                    System.out.print(" ");
                }
                for (j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
    public static void halfDiamondStarPattern(int n){
        int i,j;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (i=n-1;i>=1;i--){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void binaryNumberTrianglePattern(int n){
        int i,j;
        int start = 1;
        for (i=1;i<=n;i++){
            if (i % 2 == 0){
                start =0;
            }else {
                start = 1 ;
            }
            for (j=1;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    public static void numberCrownPattern(int n){
        int i,j,sp;
        //number Forward
        for (i=1;i<=n;i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //print spaces
            for (sp = 1; sp <= 2 * (n - i); sp++) {
                System.out.print(" ");
            }
            //number reverse
                for (j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
        }
    }
    public static void increasingNumberTrianglePattern(int n){
        int i,j;
        int num =1;
        for (i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void increasingLetterTrianglePattern(int n){
        int i,j;
        for (i=1;i<=n;i++){
            char ch = 'A';
            for (j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void reverseLetterTrianglePattern(int n){
        int i,j;
        for (i=n;i>=1;i--){
            char ch = 'A';
            for (j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void alphaRampPattern(int n){
        int i,j;
        char ch = 'A';
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
    public static void alphaHillPattern(int n){
        int i,j,sp;
        for (i=1;i<=n;i++){
            for (sp=n;sp>=i;sp--){
                System.out.print(" ");
            }
            char ch = 'A';
            for (j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            ch--;

            for(j=1;j<i;j++){
                ch--;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void alphaTrianglePattern(int n){
        int i, j;
          // Starting character
        for (i = 1; i <= n; i++) {
            char currentChar = (char)('E'-i+1);  // Use a separate variable to keep track of the current character
            for (j = 1; j <= i; j++) {
                System.out.print(currentChar);
                currentChar++;  // Decrement the character
            }
            System.out.println();
             // Increment the starting character for the next row
        }
    }
    public static void symmetricVoidPattern(int n){
        int i,j;
        //for printing rows
        for (i=n;i>=1;i--){
            //left star
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            //left space
            for (j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            //right space
            for (j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            //right star
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //for printing rows
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }

            for (j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for (j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            //right star
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void symmetricButterflyPattern(int n){
        int i,j;
        //Top patttern
        for (i=1;i<=n-1;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            for (j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for (j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Bottom Pattern
        for (i=1;i<=n;i++){
            for (j=n;j>=i;j--){
                System.out.print("*");
            }
            for (j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for (j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for (j=n;j>=i;j--){
                System.out.print("*");
            }


            System.out.println();
        }

    }
    public static void  hollowRectanglePattern(int n){
        int i,j;

        for (i=1;i<=n;i++){
            for (j=1;j<=n;j++){
                if (i==1 || i==n||j==1||j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    private static void xPatern(String s) {
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j ){
                    System.out.print(s.charAt(j));
                } else if (j == (n-i-1)) {
                    System.out.print(s.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void Zpatern(int n) {

        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
        System.out.println();

        for (int i=1;i<=n-2;i++){
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("*");

        }
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }

        System.out.println();
    }



    public static void main(String[] args) {
        int n =5;
//      Scanner scanner = new Scanner(System.in);
//      n = scanner.nextInt();
//       starPyramid(n);
//        System.out.println("---------------------------------");
//        invertedStarPyramid(n);
//        System.out.println("---------------------------------");
//        diamondStarPattern(n);
//        System.out.println("---------------------------------");
//        halfDiamondStarPattern(n);
//        System.out.println("---------------------------------");
//        binaryNumberTrianglePattern(n);
//        System.out.println("---------------------------------");
//        numberCrownPattern(n);
//        System.out.println("---------------------------------");
//        increasingNumberTrianglePattern(n);
//        System.out.println("---------------------------------");
//        increasingLetterTrianglePattern(n);
//        System.out.println("---------------------------------");
//        reverseLetterTrianglePattern(n);
//        System.out.println("---------------------------------");
//        alphaRampPattern(n);
//        System.out.println("---------------------------------");
//        alphaHillPattern(n);
//        System.out.println("---------------------------------");
//        alphaTrianglePattern(n);
//        System.out.println("---------------------------------");
//        symmetricVoidPattern(n);
//        System.out.println("---------------------------------");
//        symmetricButterflyPattern(n);
//        System.out.println("---------------------------------");
//        hollowRectanglePattern(n);
//        System.out.println("---------------------------------");
//
//        pascalTriangle(n);
//        System.out.println("---------------------------------");
//        xPatern("HelloWorldP");

        System.out.println("---------------------------------");
        Zpatern(n);


    }



}
