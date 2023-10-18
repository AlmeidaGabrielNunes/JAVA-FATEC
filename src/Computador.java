
public class Computador {
	String proc;
	String mem;
	String ssd;
	int ligado;
	
	void ligar() {
		if(proc != null && mem != null && ssd != null) {
			System.out.println("Ligando");
			System.out.println("Ligado");
			ligado = 1;
		}else {
			System.out.println("Não há como realizar está ação");
		}
	}
		
	String desligar() {
		if(ligado == 1) {
			ligado = 0;
			return "Desligando...Desligado";
		
		}else {
			return "Não está ligado";
		}
		
	}
}
