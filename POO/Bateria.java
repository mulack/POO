class Bateria extends ObjetoComum{
    
    public Bateria() {
        super();
        setEnergia(1);
    }
    public void setEnergia(float energia){
        if (energia > 0){
            setEnergia(energia);
        }
    }
}
