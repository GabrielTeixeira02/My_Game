package ObjtArma.Armas;

import ObjtArma.ClassesDeArmas.Fuzil;

public class M4A1 extends Fuzil {
    public M4A1(){
        super();
        this.setNomeArma("M4A1");
        this.setDanoDaArma(30);
    }

    public M4A1(int tamanhoPente, String mira, String coronha, String grip, String cano, String laser, String camuflagem){
        super(tamanhoPente, mira, coronha, grip, cano,laser,camuflagem);
        this.setNomeArma("M4A1");
        this.setDanoDaArma(30);
    }
}
