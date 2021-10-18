package ObjtMapa.OrganizarPartida;
import ObjtPersonagem.Personagem.AbstractPersonagem;
import ObjtPersonagem.Times.EnumTimes;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrganizadorDePartida {

    private int cont;
    private List<AbstractPersonagem> juntarTimes = new ArrayList<>();

    public List<AbstractPersonagem> getTimeCoalisao() {
        return juntarTimes.stream().filter(p -> p.getTimeDoPersonagem().equals(EnumTimes.COALISAO)).collect(Collectors.toList());
    }

    public List<AbstractPersonagem> getTimeMarines(){
        return juntarTimes.stream().filter(p -> p.getTimeDoPersonagem().equals(EnumTimes.MARINES)).collect(Collectors.toList());
    }

    public void verificaLevel() throws Exception {
        int pegaLevelCoalisao = getTimeCoalisao().stream().mapToInt(p -> p.getLevel()).sum();
        int pegaLevelMarines = getTimeMarines().stream().mapToInt(p -> p.getLevel()).sum();
        if (pegaLevelMarines - pegaLevelCoalisao < 4 && pegaLevelMarines - pegaLevelCoalisao > -4) {
            System.out.println("Jogo está balanceado e já vai começar!");
            return ;
        }else{
            throw new Exception("O jogo está desbalanceado");
        }


    }

    public void adicionaPersoNoTime(AbstractPersonagem personagem) throws Exception {
        if (juntarTimes.size() <= 10) {
            verificaQuantPorTime(personagem);
            juntarTimes.add(personagem);
        }else {
            throw new Exception("Só por haver 10 jogares por partida!");
        }
    }

    private void verificaQuantPorTime(AbstractPersonagem personagem) throws Exception {
        if (personagem.getTimeDoPersonagem().equals(EnumTimes.COALISAO) && getTimeCoalisao().size() < 5){
            return;
        }else if (personagem.getTimeDoPersonagem().equals(EnumTimes.MARINES) && getTimeMarines().size() < 5){
            return;
        }else{
            throw new Exception("Só pode haver 5 por time");
        }
    }
}



