package interfaces;

/**
 * SOLID (ISP): Interface segregada para armas que consomem poder mágico.
 */
public interface IArmaMagica extends IArma {
    void lancarFeitico();
    int getCustoMana();
}