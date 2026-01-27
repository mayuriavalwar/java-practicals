public class sy2024bit052 {
 public void pattern1 () {
        public class Pattern {
    public static void main(String[] args) {

        int n = 4; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {

                if (j <= i || j >= (2 * n - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

       public void pattern2() {

    int n = 4; 

    for (int i = n; i >= 1; i--) {

        for (int k = 0; k < (n - i); k++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}

        public void pattern3() {

    int n = 5;                
    int mid = (n / 2) + 1;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {

            if (i == mid || j == mid) {
                System.out.print("+");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
public void pattern4() {

    int n = 4;
    int count = 1;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(count++ + " ");
        }
        System.out.println();
    }
}
public void pattern5() {

    int n = 3;
    int num = 1;

    for (int i = 1; i <= n; i++) {

        if (i != 2) System.out.print(" ");

        if (i == 2) {
            System.out.print(num++ + " " + num++);
        } else {
            System.out.print(num++);
        }
        System.out.println();
    }
}

