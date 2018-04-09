
package laboratorio1;

/**
 *
 * @author Nicole
 */
public class Logica {
    
    public Frutas sumarFrutas(Frutas frutaUno, Frutas frutaDos) {
        
        /*
        * Compara todas las posibles combinaciones de frutas para  
        * así determinar el resultado de la suma,
        */
        
        Frutas resultado = Frutas.LIMÓN;
        
        if(frutaUno.equals(frutaDos)) {
            resultado = frutaUno;
        } else if (frutaUno.equals(Frutas.PERA) && frutaDos.equals(Frutas.MANZANA) || (frutaUno.equals(Frutas.MANZANA) && (frutaDos.equals(Frutas.PERA)))) {
            resultado = Frutas.MELÓN;
        } else if (frutaUno.equals(Frutas.PERA) && frutaDos.equals(Frutas.LIMÓN) || (frutaUno.equals(Frutas.LIMÓN) && (frutaDos.equals(Frutas.PERA)))) {
            resultado = Frutas.NARANJA;
        } else if (frutaUno.equals(Frutas.PERA) && frutaDos.equals(Frutas.MELÓN)) {
            resultado = Frutas.LIMÓN;
        } else if (frutaUno.equals(Frutas.PERA) && frutaDos.equals(Frutas.NARANJA)) {
            resultado = Frutas.MANZANA;
        } else if (frutaUno.equals(Frutas.MANZANA) && frutaDos.equals(Frutas.LIMÓN))  {
            resultado = Frutas.NARANJA;
        } else if (frutaUno.equals(Frutas.MANZANA) && frutaDos.equals(Frutas.MELÓN)) {
            resultado = Frutas.LIMÓN;
        } else if (frutaUno.equals(Frutas.MANZANA) && frutaDos.equals(Frutas.NARANJA)) {
            resultado = Frutas.PERA;
        } else if (frutaUno.equals(Frutas.LIMÓN) && frutaDos.equals(Frutas.MANZANA)) {
            resultado = Frutas.PERA;
        } else if (frutaUno.equals(Frutas.LIMÓN) && frutaDos.equals(Frutas.MELÓN)) {
            resultado = Frutas.MANZANA;
        } else if (frutaUno.equals(Frutas.LIMÓN) && frutaDos.equals(Frutas.NARANJA)) {
            resultado = Frutas.MELÓN;
        } else if (frutaUno.equals(Frutas.MELÓN) && frutaDos.equals(Frutas.PERA)) {
            resultado = Frutas.MANZANA;
        } else if (frutaUno.equals(Frutas.MELÓN) && frutaDos.equals(Frutas.MANZANA)) {
            resultado = Frutas.PERA;
        } else if (frutaUno.equals(Frutas.MELÓN) && frutaDos.equals(Frutas.LIMÓN)) {
            resultado = Frutas.NARANJA;
        } else if (frutaUno.equals(Frutas.MELÓN) && frutaDos.equals(Frutas.NARANJA)) {
            resultado = Frutas.LIMÓN;
        } else if (frutaUno.equals(Frutas.NARANJA) && frutaDos.equals(Frutas.PERA)) {
            resultado = Frutas.LIMÓN;
        } else if (frutaUno.equals(Frutas.NARANJA) && frutaDos.equals(Frutas.MANZANA)) {
            resultado = Frutas.MELÓN;
        } else if (frutaUno.equals(Frutas.NARANJA) && frutaDos.equals(Frutas.LIMÓN)) {
            resultado = Frutas.PERA;
        } else if (frutaUno.equals(Frutas.NARANJA) && frutaDos.equals(Frutas.MELÓN)) {
            resultado = Frutas.MANZANA;
        }
        return resultado;
    }
   
}
