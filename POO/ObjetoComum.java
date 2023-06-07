class ObjetoComum {
    private String descricao;
    private float energia;

    public ObjetoComum() {
        super();
    }

    public String getDescricao(){
        return descricao;
    }
    public float getEnergia(){
        return energia;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setEnergia(float energia){
        this.energia = energia;
    }

}