public class Racine2 {
    private double precision;
    Racine2(double precision){
        this.precision = precision;
    }
    public double racine(double x){
        double a = 0, b = x,m=0;
        while (b-a>precision){
            m = (a+b)/2;
            if(m*m>x) b=m; else a=m;
        }
        return m;
    }
    public int racine(int x){
        int a = 0, b = x,m=0;
        while (b-a>1){
            m = (a+b)/2;
            System.out.println(m);
            if(m*m>x) b=m; else a=m;
        }
        return a;
    }
    public static void main(String[]str){
        Racine2 r = new Racine2(0.000001);
        System.out.println(r.racine(50));
    }
}
