package proxy;

import interfaces.IInventario;
import model.Inventario;
import repository.InventarioRepository;

public class InventarioProxy implements IInventario {

    private Long jogadorId;
    private Inventario inventario;
    private InventarioRepository repository;

    @Override
    public int pesoTotal(){

        inicializar();

        return inventario.pesoTotal();

    }
    private void inicializar() {
        if (inventario == null) {

            inventario = repository.buscarInventarioPorJogador(jogadorId);

        }
    }
}
