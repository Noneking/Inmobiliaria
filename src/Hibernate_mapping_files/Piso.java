package Hibernate_mapping_files;
// Generated 18-nov-2014 20:09:35 by Hibernate Tools 4.3.1



/**
 * Piso generated by hbm2java
 */
public class Piso  implements java.io.Serializable {


     private int id;
     private Inmueble inmueble;
     private Integer habitaciones;
     private Integer banios;
     private String gas;

    public Piso() {
    }

	
    public Piso(int id) {
        this.id = id;
    }
    public Piso(int id, Inmueble inmueble, Integer habitaciones, Integer banios, String gas) {
       this.id = id;
       this.inmueble = inmueble;
       this.habitaciones = habitaciones;
       this.banios = banios;
       this.gas = gas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Inmueble getInmueble() {
        return this.inmueble;
    }
    
    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }
    public Integer getHabitaciones() {
        return this.habitaciones;
    }
    
    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }
    public Integer getBanios() {
        return this.banios;
    }
    
    public void setBanios(Integer banios) {
        this.banios = banios;
    }
    public String getGas() {
        return this.gas;
    }
    
    public void setGas(String gas) {
        this.gas = gas;
    }




}


