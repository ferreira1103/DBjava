public class Agenda {

	//Agenda de noticias
	
	public static void main(String[] args) {
		BancoDeDados bancoDeDados = new BancoDeDados();
		bancoDeDados.conectar();
		if(bancoDeDados.estaConectado()) {
			System.out.println("Banco de dados está conectado");
		} else {
			System.out.println("Banco de dados NÂO está conectado :'(");
		}
	}

}
