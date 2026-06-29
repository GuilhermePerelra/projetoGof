package interfaces;

/**
 * SOLID (ISP): Interface segregada para armas de projétil.
 */
public interface IArmaDistancia extends IArma {
    void atirar();
    int getMunicao();
}