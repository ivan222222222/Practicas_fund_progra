public class Imagen {
    // Atributos
    private int ancho;
    private int alto;
    private int numColores;
    private Paleta paleta;
    private int[][] pixeles;

    // Constructores
    public Imagen(int ancho, int alto, int numColores) {
        this.alto=alto;
        this.ancho = ancho;
        this.numColores=numColores;
        new Paleta(numColores);
        pixeles = new int[ancho][alto];
    }

    public Imagen(int[][] pixeles, Paleta paleta) {
        this.pixeles = pixeles;
        this.paleta = paleta;
        ancho = pixeles.length;
        alto = pixeles[0].length;
        numColores = paleta.getTamaño();


    }

    // setters y getters
    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public int getNumColores() {
        return numColores;
    }

    public Paleta getPaleta() {
        return paleta;
    }

    public int[][] getPixeles() {
        return pixeles;
    }

    // Métodos
    public void espejoHorizontal() {
        for (int y=0; y<=alto/2;y++){
            for (int x =0;x<ancho;x++){
                int aux = pixeles[x][y];
                pixeles[x][y]=pixeles[x][alto-1-y];
                pixeles[x][alto-1-y]=aux;
            }
        }
    }

    public void espejoVertical() {
        for (int x=0; x<=ancho/2;x++){
            for (int y =0;y<alto;y++){
                int aux = pixeles[x][y];
                pixeles[x][y]=pixeles[ancho-1-x][y];
                pixeles[ancho-1-x][y]=aux;
            }
        }
    }

    public void rotar180() {
        espejoHorizontal();
        espejoVertical();
    }

    public void invertirColores() {
        for (int i=0; i< paleta.getTamaño();i++) {
            ColorRGB auxColor = paleta.getColorRGB(i);
            int auxR = 255 - auxColor.getR();
            int auxG = 255 - auxColor.getG();
            int auxB = 255 - auxColor.getB();
            paleta.setColorRGB(i,auxR,auxG,auxB);
        }
    }

    public void convertirAGrises() {
        for (int i=0; i< paleta.getTamaño();i++) {
            ColorRGB auxColor = paleta.getColorRGB(i);
            double auxR = 0.299 * auxColor.getR();
            double auxG = 255 - auxColor.getG();
            double auxB = 255 - auxColor.getB();
            paleta.setColorRGB(i, (int) auxR, (int) auxG, (int) auxB);
        }
    }

    public Imagen duplicar() {
        
    }

    public boolean equals(Imagen imagen) {

    }




}