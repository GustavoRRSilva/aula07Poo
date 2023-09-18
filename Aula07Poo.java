/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07poo;

/**
 *
 * @author userbla
 */
public class Aula07Poo {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
		Genero[] generos = new Genero[3];
		Editora[] editoras = new Editora[2];
		Livro[] livros = new Livro[5];
		
		editoras[0] = new Editora(01,"Gustavo","gustavo.rramos@gmail.com","Recife","PE");
		editoras[1] = new Editora(02,"Nome","caio.schmidts@gmail.com","Recife","PE");
		
		generos[0] = new Genero(01,"Romance");
		generos[1] = new Genero(02,"Comedia");
		generos[2] = new Genero(03,"Fic�ao");
		
		livros[0] = new Livro(01, "A volta dos que nao foram","LPS",100,editoras[0],generos[2]);
		livros[1] = new Livro(01, "Como eu era antes de vc","RPS",300,editoras[0],generos[0]);
		livros[2] = new Livro(01, "Cantos de uma sala redonda","JPS",100,editoras[1],generos[2]);
		livros[3] = new Livro(01, "Minhoco e minhoca ","SPS",100,editoras[1],generos[0]);
		livros[4] = new Livro(01, "Minha triste vida academica","LPS",100,editoras[0],generos[1]);
		for(int i = 0;i < livros.length; i++){
		System.out.printf("\nO titulo do livro é: %s\nO genêro é: %s\nA razão social da editora é:%s\nA cidade da editora é:%s \n",livros[i].getTitulo(),
                                                                                                                                              livros[i].getGenero().getNomeGenero(),
                                                                                                                                              livros[i].getEditora().getRazaoSocial(),
                                                                                                                                              livros[i].getEditora().getCidade());	
	}
}
}
