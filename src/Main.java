import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TArbolTrie trie = new TArbolTrie();
        TNodoTrie nodoBusqueda = new TNodoTrie();
        String[] palabrasclave = ManejadorArchivosGenerico.leerArchivo("src/palabras.txt");
        String[] palabrasClave = {
                "apple", "app", "apricot", "banana", "band", "bandit", "bandage",
                "berry", "blueberry", "blackberry", "cherry", "cranberry", "date",
        };
        for (String palabra : palabrasClave) {
            trie.insertar(palabra);
        }

        for (String p : palabrasclave) {
            trie.insertar(p);
        }
        trie.imprimir();
        System.out.println("--------------");
        LinkedList<String> lista = trie.predecir("programa");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        List<String> palabrasBuscar = new ArrayList<>(Arrays.asList(
                "apple", "apricot", "banana", "bandage", "blueberry", "cranberry",
                "date", "notaword", "bandit", "cherry", "blackberry", "berry"
        ));

        // Realizar búsqueda masiva y medir tiempo y memoria
        trie.busquedaMasiva(palabrasBuscar);

    }
}
