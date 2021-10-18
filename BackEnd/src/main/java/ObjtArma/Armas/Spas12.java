package ObjtArma.Armas;

import ObjtArma.ClassesDeArmas.Shotgun;

public class Spas12 extends Shotgun {
    public Spas12(){
        super();
        this.setNomeArma("Spas12");
        this.setDanoDaArma(70);
    }

    public Spas12(int tamanhoPente, String mira, String coronha, String grip, String cano, String laser){
        super(tamanhoPente, mira, coronha, grip, cano,laser);
        this.setNomeArma("Spas12");
        this.setDanoDaArma(70);
    }

}
