package Menu;


public interface Factory <T,V,K>{
    T factory(V criterio,  K id);
}

