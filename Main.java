public class Main {
    public static void main(String[] args) {

        //Задание 1
        int[] f = new int[3];
        f[0] = 1;
        f[1] = 2;
        f[2] = 3;
        double[] z = {1.57, 7.654, 9.986};
        int[] bike = new int[]{3, 4, 8, 12, 15};

        //Задание 2

        for (int a = 0; a < f.length; a++){

            System.out.print(f[a]);
            if (a!= f.length-1) {
                System.out.print(", ");

            }
        }

        for (int a = 0; a < z.length; a++) {

            System.out.print(z[a]);
            if (a!= z.length-1) {
                System.out.print(", ");

            }
        }

        for (int a = 0; a < bike.length; a++) {

            System.out.print(bike[a]);
            if (a!= bike.length-1) {
                System.out.print(", ");

            }
        }



    }
}
