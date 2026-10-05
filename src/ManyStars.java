
public class ManyStars {
    public static void main(String[] args) {
        int ManyStars = 5;
        for (int i = 0; i <= ManyStars; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        int rows3 = 5;
        for (int i = 1; i <= rows3; i++) {
            for (int s = rows3; s > i; s--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");

            }
            System.out.println();
        }
        int rows4 = 5;
        for (int i = rows4; i >= 1; i--) {
            for (int s = rows4; s > i; s--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }

        int rows5 = 5;
        for (int i = 1; i <= rows5; i++) {
            for (int j = rows5; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("   *");
            }
            System.out.println();
        }

        for (int i = rows5 - 1; i >= 1; i--) {
            for (int s = rows5; s > i; s--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("   *");
            }
            System.out.println();
        }
    }
}








