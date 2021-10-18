package ObjtArma.AbstracaoArma;

import ObjtPersonagem.Personagem.AbstractPersonagem;

public interface ArmaDeFogo {

    public void atirar(int tiros);

    public void recarregar();

    public int getMunicao();

}
