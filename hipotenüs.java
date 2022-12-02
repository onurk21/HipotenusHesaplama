package src;
import java.util.Scanner;
public class hipotenüs {
    public static void main(String[] args) {


        int  k1,k2;
        double k3;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. kenarı giriniz:");
        k1 =girdi.nextInt();
        System.out.print("2. kenarı giriniz:");
        k2 =girdi.nextInt();
        /*System.out.print("3. kenarı giriniz:");
        k3=input.nextDouble();*/

        
        k3 = Math.sqrt((k1*k1)+(k2*k2));
        System.out.println("Hipotenüs:"+k3);

        /*double u = (k1+k2+k3)/2;
        double cevre =2*u;
        double alan =u*(u-k1)*(u-k2)*(u-k3);*/
       

        
        


}
}
