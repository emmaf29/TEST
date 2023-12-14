package decorator_pancho;

public class CebollaYHuevo extends Agregado{

	public CebollaYHuevo(Pancho pancho, Integer costo, Integer fechaVen, Integer fechaVal) {
		super(pancho, costo, fechaVen , fechaVal);
		
	}
	
	@Override
	public double obtenerCosto() {
		return super.obtenerCosto() + this.extra();
		}
	
	public Integer extra() {
		return 180;
	}

}
