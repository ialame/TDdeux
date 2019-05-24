public class Pile2 {
    private int capacite;
    private int taille=0;
    private int T[];
    private int increment;
    Pile2(int capacite, int increment){
        this.capacite =capacite;
        this.increment =increment;
        this.T = new int[capacite];
    }
    public void inserer(int x){
        if(taille==capacite){
            capacite+=increment;
            int[] grandT = new int[capacite];
            for(int i=0;i<taille;i++)
                grandT[i]=T[i];
            this.T=grandT;
        }
        int i=taille-1;
        while (i>=0 && T[i]>x){
            T[i+1]=T[i];
            i--;
        }
        T[i]=x;
        taille++;
    }
}
