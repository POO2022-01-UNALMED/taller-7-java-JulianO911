package comunicacion;

public class Fabula extends Escrito{
    private String ense�anza;
    private String interpretacion;

    public Fabula(String origen, String titulo,String autor,int paginas,String ense�anza, String interpretacion) {
        super(origen,titulo,autor,paginas);
        this.ense�anza = ense�anza;
        this.interpretacion = interpretacion;
    }
    
    public String getEnse�anza() {
        return ense�anza;
    }

    public void setEnse�anza(String ense�anza) {
        this.ense�anza = ense�anza;
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
