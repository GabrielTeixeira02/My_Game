package ObjtArma.AcessoriosArmas;

import ObjtArma.AbstracaoArma.AbstractArma;
import lombok.Getter;

@Getter
public abstract class AcessoriosAbstractArmaGrande extends AbstractArma {

    protected String mira;
    protected String coronha;
    protected String grip;

    public void trocaMira(String novaMira){
        novaMira = novaMira.trim().toLowerCase();

        if (!this.mira.equals(novaMira)) {
            this.mira = novaMira;
            System.out.println("A mira foi trocada!");
        }else{
            System.out.println("Essa mira já está em uso!");
        }
    }


    public void trocaCoronha(String novaCoronha){
        novaCoronha = novaCoronha.trim().toLowerCase();

        if (!this.coronha.equals(novaCoronha)){
            this.coronha = novaCoronha;
            System.out.println("A coronha foi trocada!");
        }else{
            System.out.println("Essa coronha já está em uso!");
        }
    }


    public void trocaGrip(String novoGrip){
        novoGrip = novoGrip.trim();

        if (this.grip != novoGrip) {
            this.grip = novoGrip;
            System.out.println("O grip foi trocado!");

        }else{
            System.out.println("A arma já não possui nenhum grip ou esse grip já está em uso!");
        }
    }

}
