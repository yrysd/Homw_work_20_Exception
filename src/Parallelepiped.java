public class Parallelepiped {
    public void formulaThatCalculatesTheAreaOfFigure(int height, int length, int width) throws  ArithmeticException{
        System.out.println("Area: "+2*((height * length)+(length * width)+(height * width)));
    }
    public void formulaThatCalculatesTheVolumeOfAFigure(int height, int length, int width){
        System.out.println("Volume: "+length * width * height);
    }
}
