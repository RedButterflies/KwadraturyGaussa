import java.util.Arrays;

import static java.lang.Math.*;

public class KwadraturyGaussa {
    public static void kwadratura1()
    {

        int n=3;
        int wezly=n+1;
        double[] tablicaX = new double[wezly];

        for(int i=0;i<tablicaX.length;i++)
        {
            tablicaX[i]=pow(Math.cos((((2*i+1)*Math.PI)/(2*(n+1)))),2);
        }


        double[] H =new double [wezly];
        Arrays.fill(H, Math.PI / (n + 1));
        double wynik =0;
        for(int i=0;i< tablicaX.length;i++)
        {
            wynik+=H[i]*tablicaX[i];
        }
        System.out.println("Wynik: "+wynik);
    }
    public static void kwadratura2()
    {
        int n=4;
        int wezly=n+1;
        double[] tablicaS = new double[wezly];

        tablicaS[0]=-0.906180;
        tablicaS[1]=-0.538469;
        tablicaS[2]=0;
        tablicaS[3]=0.538469;
        tablicaS[4]=0.906180;

        double[] P =new double [wezly];
        P[0]=0.236927;
        P[1]=0.478629;
        P[2]=0.568889;
        P[3]=0.478629;
        P[4]=0.236927;

        double wynik=0;

        for(int i=0;i<tablicaS.length;i++)
        {
            double iloraz =P[i]*(1/(sqrt(1+pow(tablicaS[i],2))));
            wynik+=iloraz;
        }
        System.out.println("Wynik: "+wynik);
    }
    public static void kwadratura3()
    {

        int n=3;
        int wezly=n+1;
        double[] tablicaS = new double[wezly];

        tablicaS[0]=0.322548;
        tablicaS[1]=1.745761;
        tablicaS[2]=4.536620;
        tablicaS[3]=9.395071;


        double[] P =new double [wezly];
        P[0]=0.603154;
        P[1]=0.357419;
        P[2]=0.038888;
        P[3]=0.000539;


        double wynik=0;

        for(int i=0;i<tablicaS.length;i++)
        {
            double iloraz =P[i]*((Math.pow(Math.E,-tablicaS[i]))*(sin(tablicaS[i])/tablicaS[i]));
            wynik+=iloraz;
        }
        System.out.println("Wynik: "+wynik);
    }
    public static void  kwadratura4()
    {
        int n=4;
        int wezly=n+1;
        double[] tablicaS = new double[wezly];

        tablicaS[0]=-2.020183;
        tablicaS[1]=-0.958572;
        tablicaS[2]=0;
        tablicaS[3]=0.958572;
        tablicaS[4]=2.020183;


        double[] P =new double [wezly];
        P[0]=0.019953;
        P[1]=0.393619;
        P[2]=0.945309;
        P[3]=0.393619;
        P[4]=0.019953;


        double wynik=0;

        for(int i=0;i<tablicaS.length;i++)
        {
            double iloraz =P[i]*Math.cos(tablicaS[i]);
            wynik+=iloraz;
        }
        System.out.println("Wynik: "+wynik);
    }

}
