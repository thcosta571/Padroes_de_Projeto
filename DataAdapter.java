
public class DataAdapter extends Data{
	
	public DataAdapter(int ano, int mes, int dia) {
		super(dia, mes, ano);
	}

	public void setDiaMes(int dia, int mes) {
		super.setMes(mes);
		super.setDia(dia);
	}
	
	public void setMesAno(int mes, int ano) {
		super.setAno(ano);
		super.setMes(mes);
	}
	
	public void setAnoDia(int ano, int dia) {
		super.setAno(ano);
		super.setDia(dia);
	}
	
	public void setDiaAnoDia(int ano, int dia, int mes) {
		super.setAno(ano);
		super.setDia(dia);
		super.setDia(mes);
	}
}
