import java.util.Scanner;
public class mainclass{
    public static void main(String [] args) {
      int h, m, s;
      Scanner t = new Scanner(System.in);
      //using set and get methods
        h=t.nextInt();//hour
        m=t.nextInt();//minute
        s=t.nextInt();//seconds
        tomilitary t1=new tomilitary();
        tomilitary tm=new tomilitary(h);
        tomilitary tm1=new tomilitary(h,m);
        tomilitary tm2=new tomilitary(h,m,s);
        System.out.println(t1.toMilitaryTime());
        System.out.println(tm.toMilitaryTime());
        System.out.println(tm1.toMilitaryTime());
        System.out.println(tm2.toMilitaryTime());


    }
}
