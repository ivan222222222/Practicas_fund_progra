public class Paleta {

    private int tamaño;
    private ColorRGB[] colores;

    public Paleta(int tamaño) {
        this.tamaño= tamaño;
        colores= new ColorRGB[tamaño];
    }

    public void setColorRGB(int i, ColorRGB color) {
        colores[i] = color;
    }

    public void setColorRGB(int i, int r, int g, int b) {
        colores[i]=new ColorRGB(r,g,b);
    }

    public ColorRGB getColorRGB(int i) {
        return colores[i];
    }

    public int getTamaño() {
        return tamaño;

    }

}
