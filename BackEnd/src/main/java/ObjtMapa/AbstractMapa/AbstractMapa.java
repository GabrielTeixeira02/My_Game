package ObjtMapa.AbstractMapa;

import ObjtMapa.OrganizarPartida.OrganizadorDePartida;
import ObjtPersonagem.Personagem.AbstractPersonagem;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractMapa implements InterfaceMapa  {
    private OrganizadorDePartida organiza = new OrganizadorDePartida();
    private List<AbstractPersonagem> coalisao = new ArrayList<>();
    private List<AbstractPersonagem> marines = new ArrayList<>();

    @Override
    public void comecarJogo() throws Exception {
        organiza.verificaLevel();
        coalisao = organiza.getTimeCoalisao();
        marines  = organiza.getTimeMarines();
    }

    public void PassarPersonagensParaMapa(AbstractPersonagem personagem) throws Exception{
        organiza.adicionaPersoNoTime(personagem);
    }

}
