package decorator_pancho;

import java.util.ArrayList;
import java.util.Collection;

public class Agregado implements Pancho {
    private Pancho pancho;
    private Integer costo;
    private Integer fechaVencimiento;
    private Integer fechaValida;
    
    private Collection <Agregado>agregados;
    
    public Agregado(Pancho pancho, Integer costo, Integer fechaVen, Integer fechaVal) {
        this.pancho = pancho;
        this.costo = costo;
        this.fechaVencimiento = fechaVen;
        this.fechaValida = fechaVal;
        this.agregados = new ArrayList<>();    }


	@Override
    public double obtenerCosto() {
        return pancho.obtenerCosto() + costo;
    }

    public Integer obtenerPoderDiarreico() {
    	return this.agregados.stream()
    		   .mapToInt(a -> a.estaVencido())
    		   .sum();
          }
      
 
    	public Integer estaVencido(){
    	if(this.fechaVencimiento > this.fechaValida) {
    		return 1;
    	}
    	else {
    		return 0;
    	}
          
    	}
    	
        public Pancho getPancho() {
    		return pancho;
    	}

    	public Integer getCosto() {
    		return costo;
    	}

    	public Integer getFechaVencimiento() {
    		return fechaVencimiento;
    	}

    	public Integer getFechaValida() {
    		return fechaValida;
    	}

    	public Collection<Agregado> getAgregados() {
    		return agregados;
    	}

    	public void setPancho(Pancho pancho) {
    		this.pancho = pancho;
    	}

    	public void setCosto(Integer costo) {
    		this.costo = costo;
    	}

    	public void setFechaVencimiento(Integer fechaVencimiento) {
    		this.fechaVencimiento = fechaVencimiento;
    	}

    	public void setFechaValida(Integer fechaValida) {
    		this.fechaValida = fechaValida;
    	}

    	public void setAgregados(Collection<Agregado> agregados) {
    		this.agregados = agregados;
    	}
    	
    }
    	
    
