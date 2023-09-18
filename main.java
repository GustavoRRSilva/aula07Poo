package aula07;

public class main {

	public static void main(String[] args) {
		Genero[] generos = new Genero[3];
		Editora[] editoras = new Editora[2];
		Livro[] livros = new Livro[5];
		
		editoras[0] = new Editora(01,"Gustavo","gustavo.rramos@gmail.com","Recife","PE");
		editoras[1] = new Editora(02,"Nome","caio.schmidts@gmail.com","Recife","PE");
		
		generos[0] = new Genero(01,"Romance");
		generos[1] = new Genero(02,"Comedia");
		generos[2] = new Genero(03,"Ficçao");
		
		livros[0] = new Livro(01, "A volta dos que não foram","LPS",100,editoras[0],generos[2]);
		livros[1] = new Livro(01, "Como eu era antes de vc","RPS",300,editoras[0],generos[0]);
		livros[2] = new Livro(01, "Cantos de uma sala redonda","JPS",100,editoras[1],generos[2]);
		livros[3] = new Livro(01, "Minhoco e minhoca ","SPS",100,editoras[1],generos[0]);
		livros[4] = new Livro(01, "Minha triste vida academica","LPS",100,editoras[0],generos[1]);
		
	}

}
