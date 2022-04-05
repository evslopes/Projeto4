import java.util.ArrayList;

public class Projeto4 {

    private static Integer contador = 0;
    private static Integer posicao = 0;
    private static ArrayList<String> Vetor = new ArrayList();

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public ArrayList<String> getVetor() {
        return Vetor;
    }

    public void setVetor(ArrayList<String> vetor) {
        Vetor = vetor;
    }

    public static void ContarRepetiçõesRecursivas(String busca){

        while (posicao < (Vetor.size() -1) ) {
            if( Vetor.get(posicao) == busca) {
                contador++;
            }
            posicao++;
        }

    }

    public static Integer ContarRepetiçõesInterativas(String busca, ArrayList<String> V){

        Integer contadorInterativo = 0;

        for (String v : V ) {
             if (busca == v){
                 contadorInterativo++;
             }
        }
        return contadorInterativo;
    }

    public static void main(String[] args) {

        // Verificações recursivas

        Vetor.add("A");
        Vetor.add("B");
        Vetor.add("B");
        Vetor.add("B");
        Vetor.add("B");

        System.out.println("Verifcações recursivas");

        System.out.println("Buscar recursiva por A");
        ContarRepetiçõesRecursivas("A");
        System.out.println("Repitções de A " + contador);
        // Zerando marcador de posição do vertor
        posicao = 0;

        System.out.println("Busca recursiva por B");
        ContarRepetiçõesRecursivas("B");
        System.out.println("Repitções de B " + contador);
        // Zerando marcador de posição do vertor
        posicao = 0;

        // Verificações interativas

        ArrayList<String> VetorInterativo = new ArrayList<>();

        VetorInterativo.add("A");
        VetorInterativo.add("B");
        VetorInterativo.add("B");
        VetorInterativo.add("B");
        VetorInterativo.add("B");

        System.out.println("Verifcações interativas");
        System.out.println("Repitções de A " + ContarRepetiçõesInterativas("A",VetorInterativo));
        System.out.println("Repitções de B " + ContarRepetiçõesInterativas("B",VetorInterativo));

    }
}
