public class Racine {

    private double precision;

    public Racine(double precision){
        this.precision = precision;
    }

    public double racine(double operande){
        double solution = 0;
        double a = 0,b = operande;
        while(b-a>precision) {
            solution = (a+b)/2;
            if(solution*solution > operande)
                b = solution;
            else
                a = solution;
        }
        return solution;
    }

    public int racine(int N){
        int n = 0;
        while( n*n < N ) {
            n++;
        }
        return n-1;
    }

    public static void main(String[] s) {
        Racine r = new Racine(0.0001);
        System.out.println(r.racine(50.0));
    }

}