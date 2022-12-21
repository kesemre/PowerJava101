import java.util.Scanner;

public class PowerJava101 {
    static double power(int base,int pow){
        if (pow==0)
            return 1;

        else if (pow<0)
          return (1/(double)base)*(double) power(base,pow+1);

        else
            return base*power(base,pow-1);

    }
    public static void main(String[] args) {
        int base,pow;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Tabanı giriniz");
        base = input.nextInt();
        System.out.print("Lütfen Üssü giriniz");
        pow = input.nextInt();
        System.out.println(power(base,pow));
    }
}