package lessons6;

public class Box {

    double width;
    double height;
    double depth;
    //
    double volume() {
        return width * height * depth;

    }//
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox1 = new Box();
        double vol;
      //
        mybox.setDim(10,20,15);
        mybox1.setDim(3, 6,9);
        //
        vol = mybox.volume();
        System.out.println(" obyem raven" + vol);
        //
        vol =mybox1.volume();
        System.out.println(" obyem raven" + vol);
    }
}