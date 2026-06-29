package proxy;

import interfaces.IInventario;
import model.Inventario;
import repository.InventarioRepository;

/**
 * GoF: Proxy
 * Atua como um substituto do Inventario real para adiar o acesso ao banco de dados.
 * * GRASP (Pure Fabrication): Uma classe criada puramente para gerenciar o
 * Lazy Loading, garantindo a alta coesão e baixo acoplamento do sistema.
 * * SOLID (OCP): Estende o comportamento do sistema (adiciona carregamento
 * sob demanda) sem modificar o código do Objeto Real (Inventario).
 */
public class InventarioProxy implements IInventario {

    private Long jogadorId;
    private Inventario inventario;
    private InventarioRepository repository;

    // Construtor atualizado para garantir injeção de dependência
    public InventarioProxy(Long jogadorId, InventarioRepository repository) {
        this.jogadorId = jogadorId;
        this.repository = repository;
    }

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