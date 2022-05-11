package comunicacion;

public class Fabula extends Escrito{
    private String enseñanza;
    private String interpretacion;

    public Fabula(String origen, String titulo,String autor,int paginas,String enseñanza, String interpretacion) {
        super(origen,titulo,autor,paginas);
        this.enseñanza = enseñanza;
        this.interpretacion = interpretacion;
    }
    
    public String getEnseñanza() {
        return enseñanza;
    }

    public void setEnseñanza(String enseñanza) {
        this.enseñanza = enseñanza;
    }

    String Interpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
	public String toString() {
		String retorno = "";

		return retorno;
	}
	
	int palabrasTotales(int palabrasPagina) {
		
	}
}
