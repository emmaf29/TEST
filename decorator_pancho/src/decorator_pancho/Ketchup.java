package decorator_pancho;

public class Ketchup extends Agregado {

	public Ketchup(Pancho pancho, Integer costo, Integer fechaVen, Integer fechaVal)  {
		super(pancho, costo, fechaVen , fechaVal);
		
	}
	
	@Override
	public double obtenerCosto() {
		return super.obtenerCosto() + this.extra();
		}
	
	public Integer extra() {
		return 50;
	}

}
