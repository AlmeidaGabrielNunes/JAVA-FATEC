
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
			System.out.println("N�o h� como realizar est� a��o");
		}
	}
		
	String desligar() {
		if(ligado == 1) {
			ligado = 0;
			return "Desligando...Desligado";
		
		}else {
			return "N�o est� ligado";
		}
		
	}
}
