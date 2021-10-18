package ObjtArma.Armas;

import ObjtArma.ClassesDeArmas.Pistola;

public class Glock extends Pistola {
    public Glock(){
        super();
        this.setNomeArma("Glock");
        this.setDanoDaArma(15);
    }

    public Glock(int tamanhoPente,String cano, String laser, String camuflagem){
        super(tamanhoPente, cano,laser, camuflagem);
        this.setNomeArma("Glock");
        this.setDanoDaArma(15);
    }
}
