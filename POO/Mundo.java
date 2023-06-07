class Mundo {

    private ObjetoComum objetos [][];

    public void criarObjetos(int n){
        objetos = new ObjetoComum[n][n];
    }

    public void setObjeto(ObjetoComum p, int i, int j){
        if (i >= 0 && i < objetos.length && j >= 0 && j < objetos.length){
            objetos[i][j] = p;
        }
        
    }
                
    public void listarObjetos(){
        for (int i = 0; i < objetos.length; i++ ) {
            for (int j = 0; j < objetos[i].length; j++ ) {
                System.out.print( objetos[i][j].getDescricao() + "  " );
            }
            System.out.println();
        }
    }
}
