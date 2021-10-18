package ObjtPersonagem.AcessoriosPersonagem;

public class Capacete extends AbstractAcessoriosPers{


    public Capacete(TiposCapacete tiposCapacete){
        this.durabilidadeAcessorio = tiposCapacete.getDurabilidadeCapacete();
    }

}
