import java.math.*;
import javax.swing.*;
public class ejercicio {
    public static void main(String[] args) {

        BigInteger a=new BigInteger("1");

        BigInteger b=new BigInteger("1");

        BigInteger c=new BigInteger("1");

        BigInteger d=new BigInteger("1");

        BigInteger x=new BigInteger("0");
        
        BigInteger j=new BigInteger("2");

        BigInteger k=new BigInteger("3");

        BigInteger l=new BigInteger("4");

        BigInteger z=new BigInteger("10000000000");

        int n=Integer.parseInt(JOptionPane.showInputDialog("Indique cuantas veces se repite el bucle"));

        for(int i=0; i<n;i++){

            x=d.add(j.multiply(c).add(k.multiply(b).add(l.multiply(a))));

            a=b;

            b=c;

            c=d;

            d=x;

        }

        System.out.println(d.mod(z));

    }
}
