public class Rando {
    public static int random(int n)
    {
        int Rn = 0;
        int n1, n2;
        final int a=5, b=7, m=1200;
        for (int i=0; i<n; i++)
        {
            n1 = Rn * a;
            n2 = n1 + b;
            Rn = n2 % m;
        }
        return Rn;
    }

    public static void main(String [] args)
    {
        System.out.println("The 10th random number is " + random(10));
    }
}
