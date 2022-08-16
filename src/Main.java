public class Main {
    public static void main(String[] args) {

        // task 1
        int[] d = new int[3];
        d[0] = 1;
        d[1] = 2;
        d[2] = 3;

        double[] b = {1.57, 7.654, 9.986};
        char[] c = {36, 37, 38};

        // task 2


        for (int i1 = 0; i1 < d.length; i1++) {
            System.out.print(d[i1]);
            if (i1 != d.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();


        for (int i1 = 0; i1 < b.length; i1++) {
            System.out.print(b[i1]);
            if (i1 != b.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i1 = 0; i1 < c.length; i1++) {
            System.out.print(c[i1]);
            if (i1 != c.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        // task 3

        for (int i1 = d.length - 1; i1 >= 0; i1--) {
            System.out.print(d[i1]);
            if (i1 != 0) {
                System.out.print(",");
            }
        }
        System.out.println();


        for (int i1 = b.length - 1; i1 >= 0; i1--) {
            System.out.print(b[i1]);
            if (i1 != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i1 = c.length - 1; i1 >= 0; i1--) {
            System.out.print(c[i1]);
            if (i1 != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        // Task 4
        for (int i1 = 0; i1 < d.length; i1++) {
            if (i1 % 2 == 0) {
                d[i1]++;

            }
            System.out.print(d[i1]);
            if (i1 != d.length - 1) {
                System.out.print(",");
            }
        }

    }
}