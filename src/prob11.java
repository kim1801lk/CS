import java.util.Scanner;

public class prob11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfStudents = input.nextInt();
        input.close();

        int numOfCars = numOfStudents / 4;
        int numOfFullCars = numOfCars;
        int numOfPartialCars = 0;

        if (numOfStudents % 4 != 0) {
            numOfPartialCars = 1;
        }

        if (numOfFullCars == 1) {
            System.out.print(numOfFullCars + " full car");
        } else if (numOfFullCars > 1) {
            System.out.print(numOfFullCars + " full cars");
        }

        if (numOfPartialCars == 1) {
            System.out.print((numOfFullCars > 0 ? ", " : "") + numOfPartialCars + " partial car\n");
        } else if (numOfPartialCars > 1) {
            System.out.print((numOfFullCars > 0 ? ", " : "") + numOfPartialCars + " partial cars\n");
        }


    }
}
