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
public class Genero {
	private int idGenero;
	private String nomeGenero;
	public Genero(int idGenero, String nomeGenero) {
		super();
		this.idGenero = idGenero;
		this.nomeGenero = nomeGenero;
	}
	public int getIdGenero() {
		return idGenero;
	}
	public String getNomeGenero() {
		return nomeGenero;
	}
	public void setNomeGenero(String nomeGenero) {
		this.nomeGenero = nomeGenero;
	}
}

