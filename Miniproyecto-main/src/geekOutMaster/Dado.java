package geekOutMaster;

import java.util.Random;

/**
 * Clase Dado genera un numero del 1 al 6
 * @autor David Camilo Ordoñez - david.camilo.ordonez@correounivalle.edu.co -2226057
 * @autor Esteban Camilo Martinez Urbano - esteban.urbano@correounivalle.edu.co - 202224043
 * @autor Diana Marcela Sarmiento - diana.sarmiento@correounivalle.edu.co - 2222811
 */
public class Dado {
    private int numeroAccion;
    private String accion;
    private String nombreDado;
    private String activoInactivo;

    public Dado(){
    }

    /**
     * Asignamos un numero aleatorio
     */
    public void setNumAccion(){
        int numeroAleatorio;
        Random aleatorio = new Random();
        numeroAleatorio = aleatorio.nextInt(6)+1;
        if(numeroAccion == numeroAleatorio){
            setNumAccion();
        }else{
            numeroAccion = numeroAleatorio;
        }
    }

    /**
     * Se determina un numero que realiza una accion
     * @param numero
     */
    public void setNumAccionNoAleatorio(int numero){
        numeroAccion = numero;
    }

    /**
     * Se asigna una accion
     * @param _accion
     */
    public void setAccion(String _accion){
        accion = _accion;
    }

    /**
     * Se asigna un nombre al dado
     * @param _nombre
     */
    public void setNombreDado(String _nombre){
        nombreDado = _nombre;
    }

    /**
     * Se asigna un estado (activo, inactivo, utilizado) a un dado
     * @param estado
     */
    public void setActivoInactivo(String estado){
        activoInactivo = estado;
    }

    /**
     * Retorna el numero que representa la accion
     * @return numero int
     */
    public int getNumAccion(){
        return numeroAccion;
    }

    /**
     * Retorna el nombre de la accion
     * @return nombre string
     */
    public String getAccion(){
        return accion;
    }

    /**
     * Retorna el nombre del dado
     * @return String
     */
    public String getNombreDado(){
        return nombreDado;
    }
}
