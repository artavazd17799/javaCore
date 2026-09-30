package lessons3;

public class Light {
    public static void main(String[] args) {
        int Lightspeed;
        long days;
        long seconds;
        long distance;
        //
        Lightspeed = 186000;

        days = 1000; //

        seconds = days * 24 * 60 * 60;
             //
        distance = Lightspeed * seconds;
            //
        System.out.println("За " + days);
        System.out.println("dnei svet proydyot okolo  ");
        System.out.println(distance +   "миль.");

    }
}
