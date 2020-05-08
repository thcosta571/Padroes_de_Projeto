
public class Principal {
	public static void main(String[] args) {
		
		Data data = new DataAdapter(2020,3,12);
		System.out.println(data);
		
		((DataAdapter) data).setDiaMes(10, 8);
		System.out.println(data);
		
		((DataAdapter) data).setMesAno(11, 2010);
		System.out.println(data);
	
		((DataAdapter) data).setAnoDia(2012, 10);
		System.out.println(data);
		
		((DataAdapter) data).setDiaAnoDia(2019, 23, 24);
		System.out.println(data);
		
	}

}
