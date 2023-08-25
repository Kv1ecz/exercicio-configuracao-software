import java.util.ArrayList;

public class Main(){
    public static void main(String[] args) {
        
    }

    public static int nOcorrencias(ArrayList<Integer> l, Integer el){
        int qtdOcorrencias = 0;

        l.forEach((i) -> {
            if(i.equals(el)){
                qtdOcorrencias++;
            }
        });

        return qtdOcorrencias;
    }

    public static ArrayList<Integer> listRepeat(ArrayList< Integer > l){
        ArrayList<Integer> listaAux = new ArrayList<Integer>();
        ArrayList<Integer> listaRepetidos = new ArrayList<Integer>();


        l.forEach((i) -> {
            
            if(listaAux.contains(i)){
                listaRepetidos.add(i);
            }

            listaAux.add(i);
        });

        return listaRepetidos;
    }

}