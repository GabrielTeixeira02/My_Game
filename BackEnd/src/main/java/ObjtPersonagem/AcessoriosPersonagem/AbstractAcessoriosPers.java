package ObjtPersonagem.AcessoriosPersonagem;

import java.util.Locale;

public abstract class AbstractAcessoriosPers {
    protected int durabilidadeAcessorio;


    public int getDurabilidadeAcessorio() {
        return this.durabilidadeAcessorio;
    }


    public int DarDanoNoAcessorio(int dano){
        if(dano > this.durabilidadeAcessorio) {
            dano -= durabilidadeAcessorio;
            this.durabilidadeAcessorio = 0;
            return dano;
        }
        this.durabilidadeAcessorio -= dano;
        return 0;
  }


}
