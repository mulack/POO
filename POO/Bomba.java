class Bomba extends ObjetoComum{
    public Bomba() {
        super();
        setEnergia(-1);
    }
    public void setEnergia(float energia){
        if (energia < 0){
            setEnergia(energia);
        }
    }
}
