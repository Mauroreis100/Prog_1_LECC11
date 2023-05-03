import java.util.*;

public class contagemVotos{
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Quantos candidatos?: ");
        int nrCandidato = ler.nextInt();
        int[] m = votos(nrCandidato);
        imprimir(m);
    }

    public static int[] contarVotos(int c) {
        int[] M = new int[nrCandidato];
        System.out.print("Quantos Votantes?: ");
        int nrVotantes = ler.nextInt();
        do {
            System.out.print("Insira o nr do candidato");
            int x = ler.nextInt();
            M[x] ++;
            nrVotantes--;
        } while (nrVotantes > 0);
        return M;
    }

    public static void imprimir(int[] M) {
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i]);
        }
    }
}