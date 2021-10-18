package ObjtPersonagem.AcessoriosPersonagem;

public enum TiposColete {
    COLETELEVE(60),
    COLETEMEDIO(80),
    COLETEPESADO(100);

    private int durabilidadeColete;

    public int getDurabilidadeColete(){
        return this.durabilidadeColete;
    }

    TiposColete(int durabilidadeColete){
        this.durabilidadeColete = durabilidadeColete;
    }

}
