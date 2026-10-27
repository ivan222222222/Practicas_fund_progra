public class MatrizCuadrada {
    private int[][] matriz;
    public MatrizCuadrada(int dimension,int valor){
        matriz = new int[dimension][dimension];
        for (int i =0;i<dimension;i++){
            for (int j=0;j<dimension;j++){
                matriz[i][j]=valor;
            }
        }
    }
    public void mostrar(){
        for (int i =0;i<matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int getDimension(){
        return matriz.length;
    }
    public int getElemento(int fila, int columna){
        int resultado = -1;
        if (fila>=0 && fila< matriz.length && columna>=0 && columna< matriz[fila].length){
            resultado = matriz[fila][columna];
        }
        return resultado;
    }
    public void asignar(int fila,int columna,int valor){
        if (fila>=0 && fila< matriz.length && columna>=0 && columna< matriz[fila].length){
            matriz[fila][columna]=valor;
        }
        else {
            System.out.println("fuera de rango");
        }
    }
    public void asignar(int[]vector,int fila){
        if (fila>=0 && fila< matriz.length && vector.length== matriz[fila].length){
            for (int j=0;j< vector.length;j++){
                matriz[fila][j]=vector[j];
            }
        }
        System.out.println("error de rango");
    }
    public void rellenarDiagonales(){
        for (int i =0;i<matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                if (i==j || i+j== matriz.length-1){
                    matriz[i][j]=0;
                }
            }
        }
    }
    public void rellenarTriangularInferior(){
        for (int i =1;i<matriz.length;i++){
            for (int j=0;j< i;j++){
                matriz[i][j]=0;
            }
        }
    }
    public void transponer(){
        int aux;
        for (int i =1;i<matriz.length;i++){
            for (int j=0;j< i;j++){
                aux = matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
            }
        }

    }
}
