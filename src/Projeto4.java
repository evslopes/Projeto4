import java.util.ArrayList;

public class Projeto4 {

    // Variaveis de controle de recursividade
    public static int contador;
    public static int posicao;

    public static void main(String[] args) {

        ArrayList<String> Vetor = new ArrayList();
        Vetor.add("A");
        Vetor.add("B");
        Vetor.add("B");
        Vetor.add("B");
        Vetor.add("B");

        // Verificações recursivas
        System.out.println("Verifcações recursivas");
        ContarRepetiçõesRecursivas("A", Vetor);
        System.out.println("Repitções de A " + contador);

        // Zerando contadores
        contador=0;posicao=0;

        ContarRepetiçõesRecursivas("B", Vetor);
        System.out.println("Repitções de B " + contador);

        // Verificações interativas
        System.out.println("Verifcações interativas");
        System.out.println("Repitções de A " + ContarRepetiçõesInterativas("A", Vetor));
        System.out.println("Repitções de B " + ContarRepetiçõesInterativas("B", Vetor));

    }

    public static void ContarRepetiçõesRecursivas(String busca, ArrayList<String> vetor) {

        // Verificando a posicao final para não cair em null pointer
        if (posicao == vetor.size()) {
            return;
        }

        // Comparando com a posição com a busca
        String comparar = vetor.get(posicao);
        if (comparar == busca) {
            contador++;
        }

        // Incrementando posição para chamada recursiva verificar a posição seguinte
        posicao++;
        ContarRepetiçõesRecursivas(busca, vetor);

        return;

    }

    public static Integer ContarRepetiçõesInterativas(String busca, ArrayList<String> V) {

        Integer contadorInterativo = 0;

        for (String v : V) {
            if (busca == v) {
                contadorInterativo++;
            }
        }
        return contadorInterativo;
    }
}
