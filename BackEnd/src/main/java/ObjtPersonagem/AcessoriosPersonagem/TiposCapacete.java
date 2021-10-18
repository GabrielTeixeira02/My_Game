package ObjtPersonagem.AcessoriosPersonagem;

public enum TiposCapacete {
    CAPACETELEVE(30),
    CAPACETEMEDIO(40),
    CAPACETEPESADO(50);

    private int durabilidadeCapacete;

    public int getDurabilidadeCapacete(){
        return this.durabilidadeCapacete;
    }

    TiposCapacete(int durabilidadeCapacete){
        this.durabilidadeCapacete = durabilidadeCapacete;
    }
}
