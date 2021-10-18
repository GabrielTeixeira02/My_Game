package ObjtPersonagem.Personagem;

import ObjtArma.AbstracaoArma.AbstractArma;
import ObjtArma.AcessoriosArmas.AcessoriosAbstractArmaGrande;
import ObjtArma.AcessoriosArmas.AcessoriosAbstractArmaPequena;
import ObjtPersonagem.AcessoriosPersonagem.AbstractAcessoriosPers;
import ObjtPersonagem.AcessoriosPersonagem.Capacete;
import ObjtPersonagem.AcessoriosPersonagem.Colete;
import ObjtPersonagem.Times.EnumTimes;

import java.util.Random;

public abstract class AbstractPersonagem {

    protected Random geradorAleatorio = new Random();
    protected int vida;
    protected int vidaMaisProtecao;
    protected int level;
    protected AbstractAcessoriosPers colete ;
    protected AbstractAcessoriosPers capacete;
    protected AbstractArma armaNaMao;
    protected AcessoriosAbstractArmaGrande armaPrimaria;
    protected AcessoriosAbstractArmaPequena armaSecundaria;
    protected EnumTimes timeDoPersonagem ;
    private AbstractPersonagem quemtaNaMira;
    private boolean taNaMira = false;

    public String getArmaNaMao() {
        return armaNaMao.getNomeArma();
    }

    public int getLevel() {
        return level;
    }

    public int getVida() {
        return vida;
    }

    public EnumTimes getTimeDoPersonagem() {
        return timeDoPersonagem;
    }

    public int getVidaMaisProtecao() {
        return vidaMaisProtecao;
    }

    /* Metodo para o personagem tomar dano */
    private void PersonagemTomarDano(int dano) throws Exception {
        dano = capacete.DarDanoNoAcessorio(dano);
        dano = colete.DarDanoNoAcessorio(dano);
        TirarVida(dano);
        AtualizaVidaMaisProtecao();
    }

    /* Metodo para o personagem mirar */
    public void PersonagemMirar(AbstractPersonagem personagem) throws Exception {
        if (this.quemtaNaMira == null) {
            this.quemtaNaMira = personagem;
            System.out.println(String.format("Você está mirando no personagem"));
        }else if (this.quemtaNaMira == personagem){
            throw new Exception("Esse personagem já está na mira!!");
        }else {
            this.quemtaNaMira = personagem;
            System.out.println(String.format("Você está mirando em outro personagem"));
        }
        taNaMira = true;
    }

    /* Metodo para o personagem parar de mirar */
    public void PersonagemParaDeMirar() throws Exception {
        if (this.quemtaNaMira != null){
            this.quemtaNaMira = null;
            System.out.println("Você parou de mirar");
        }else{
            throw new Exception("Esse personagem já não está mirando em ninguém");
        }
        taNaMira = false;
    }

    /* Metodo para o personagem atirar */
    public void PersonagemAtirar(int tiros) throws Exception {
        if (taNaMira == true) {
            this.armaNaMao.atirar(tiros);
            quemtaNaMira.PersonagemTomarDano(this.armaNaMao.getDanoTotal());
        }else{
            throw new Exception("Você não está mirando em ninguém, por favor mire em alguém para atirar!!");
        }
    }

    /* Metodo para o personagem recarregar */
    public void PersonagemRecarregar(){
        armaNaMao.recarregar();
    }

    /* Metodo para escolher qual arma vai estar na mão */
    public void TrocaArmaNaMao(int escolhaArma){
        if (escolhaArma == 1) {
            this.armaNaMao = armaPrimaria;
            System.out.println(String.format("Está com a %s na mão",armaNaMao.getNomeArma()));

        }else if (escolhaArma == 2){
            this.armaNaMao = armaSecundaria;
            System.out.println(String.format("Está com a %s na mão",armaNaMao.getNomeArma()));

        }else {
            System.out.println("Não tem essa opção");
            this.armaNaMao = armaSecundaria;
            System.out.println(String.format("Está com a %s na mão",armaNaMao.getNomeArma()));
        }
    }

    /* Metodo para tirar a vida do personagem */
    private void TirarVida(int dano){
        if(dano > this.vida ){
            this.vida = 0;
            System.out.println("O personagem morreu");
        }else {
            this.vida -= dano;
        }
    }

    /* Metodo para atualizar a vida total do personagem */
    private void AtualizaVidaMaisProtecao(){
        this.vidaMaisProtecao = getVida() + this.capacete.getDurabilidadeAcessorio() + this.colete.getDurabilidadeAcessorio();
        System.out.println(String.format("O personagem ficou com %d de vida", this.getVidaMaisProtecao()));
    }

}
