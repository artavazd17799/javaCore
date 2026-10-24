package lessons7;

public class Box {
    double width;
    double height;
    double depth;

    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width = height = depth = len;

    }
    double volume(){
        return width * height * depth;
    }
}
class OverloadCons {
    public static void main(String[] args) {
     Box mybox1 = new Box(10,20,15);
     Box mybox2 = new Box();
     Box mycube = new Box(7);

     Box myclone = new Box ();

     double vol;
     vol = mybox1.volume();
        System.out.println("Объем myboxl равен " + vol);

        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);

        vol = mycube.volume();
        System.out.println("Oбъeм mycube равен " + vol);

        vol = myclone.volume();
        System.out.println("Oбъeм клона равен " + vol);

    }
}
