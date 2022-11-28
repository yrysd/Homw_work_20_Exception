import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.Area      2.Volume");
            int areaAndVolume = scanner.nextInt();

            Parallelepiped parallelepiped = new Parallelepiped();
            if (areaAndVolume == 1) {
                System.out.println("Enter HEIGHT:");
                int height = scanner.nextInt();
                System.out.println("Enter LENGTH:");
                int length = scanner.nextInt();
                System.out.println("Enter WIDTH:");
                int width = scanner.nextInt();
                if (height < 0 || length < 0 || width < 0) {
                    if (height < 20 && length < 20 && width < 20) {

                    }else {
                        throw new RuntimeException("the given value cannot be greater than 20!");
                    }
                    throw new RuntimeException("the given number cannot be zero!");
                }else{ parallelepiped.formulaThatCalculatesTheAreaOfFigure(height, length, width);
                }

            } else if (areaAndVolume == 2) {
                System.out.println("Enter HEIGHT:");
                int height = scanner.nextInt();
                System.out.println("Enter LENGTH:");
                int length = scanner.nextInt();
                System.out.println("Enter WIDTH:");
                int width = scanner.nextInt();
                if(height > 0 &&  length > 0 && width > 0){
                    if (height < 20 && length < 20 && width < 20) {

                    }else {
                        throw new RuntimeException("the given value cannot be greater than 20!");
                    }
                    parallelepiped.formulaThatCalculatesTheVolumeOfAFigure(height, length, width);
                }else {
                    throw new RuntimeException("the given number cannot be zero!");
                }

            }
        } catch (InputMismatchException e){
            System.out.println("The given value cannot be a character");
        }


    }
}