public class Fecha {
    private int dia,mes,anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public static boolean bisiesto(int anio){
        return (anio%4==0 && (anio&100)!=0) || (anio%400==0);
    }
    public static boolean combrobarFecha(int dia, int mes, int anio){
        boolean resulltado  = true;
        if (anio<1900 || mes<1 || mes >12 || dia<1){
            resulltado = false;

        }else {
            switch (mes){
                case 1,3,5,7,8,10,12:
                    if (dia>31){
                        resulltado = false;
                    }
                    break;
                case 4,6,9,11:
                    if (dia>30){
                        resulltado = false;
                    }
                    break;
                case 2:
                    if (bisiesto(anio)){
                        if (dia>29){
                            resulltado = false;
                        }
                    }else {
                        if (dia>28){
                            resulltado = false;
                        }
                    }
                    break;
            }
        }

        return resulltado;
    }
}
