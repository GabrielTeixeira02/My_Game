package ObjtPersonagem.AcessoriosPersonagem;

public class Colete extends AbstractAcessoriosPers{


    public Colete(TiposColete tiposColete){
        this.durabilidadeAcessorio = tiposColete.getDurabilidadeColete();
    }

}
