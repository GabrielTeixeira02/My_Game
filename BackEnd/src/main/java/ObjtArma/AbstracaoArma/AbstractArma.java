package ObjtArma.AbstracaoArma;

import ObjtPersonagem.Personagem.AbstractPersonagem;
import lombok.Getter;

@Getter
public abstract class AbstractArma implements ArmaDeFogo{

    protected int municao;
    protected int tamanhoPente;
    protected String cano;
    protected String laser;
    protected String camuflagem;
    protected String nomeArma;
    protected int danoDaArma;
    private   int danoTotal;

    public void setCamuflagem(String camuflagem) {
        this.camuflagem = camuflagem;
    }
    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }
    public void setDanoDaArma(int danoDaArma) {
        this.danoDaArma = danoDaArma;
    }

    public void trocaCano(String novoCano){
        novoCano = novoCano.trim();

        if (this.cano != novoCano) {
            this.cano = novoCano;
            System.out.println("O cano foi trocado!");
        }else{
            System.out.println("Esse cano já está em uso!");
        }
    }

    public void trocaLaser(String novoLaser){
        novoLaser = novoLaser.trim();

        if (this.laser != novoLaser){
            this.cano = novoLaser;
            System.out.println("O grip foi trocado!");
        }else{
            System.out.println("A arma já não possui laser ou esse laser já está em uso!");
        }
    }

    @Override
    public void atirar(int tiros) {

        if (this.municao < tiros) {
            System.out.println("Não pode atirar mais balas do que se tem!");
        }else {
            this.municao -= tiros;
            this.danoTotal = tiros * this.danoDaArma;
            System.out.println(String.format("Você deu %d %s. ",tiros, municao != 1 ? "tiros" : "tiro"));
            System.out.println(String.format("Sobrou %d %s no carregador.\n",municao,municao != 1 ? "projéteis" : "projétil" ));
        }
    }

    @Override
    public void recarregar() {
        if (this.municao != this.tamanhoPente){
            this.municao = this.tamanhoPente;
            System.out.println(String.format("Arma recaregada com %d projéteis.\n",tamanhoPente));
        }else{
            System.out.println(String.format("O carregador ainda tem %d %s, não precisa recarregar!\n",municao, municao != 1 ? "projéteis" : "projétil"));
        }
    }
}