package Modelo;

public interface Gestionable<T,K,V> {
    void alta(T a);
    void baja(T a);
    T buscar(K id);
    T recuperar(V indice);
    int numeroElementos();
}
