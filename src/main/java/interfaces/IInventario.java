package interfaces;

/**
 * GoF: Subject
 * Interface comum que define o contrato para o cálculo de peso.
 * * SOLID (ISP): Segregação de Interface. A interface é enxuta e coesa,
 * contendo apenas o que é estritamente necessário para o contexto.
 */
public interface IInventario {
    int pesoTotal();
}