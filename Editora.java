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
public class Editora {
    private int idEditora;
    private String razaoSocial;
    private String contato;
    private String cidade;
    private String UF;
 
    
	public Editora(int idEditora, String razaoSocial, String contato, String cidade, String uF) {
		super();
		this.idEditora = idEditora;
		this.razaoSocial = razaoSocial;
		this.contato = contato;
		this.cidade = cidade;
		UF = uF;
	}
	public int getIdEditora() {
		return idEditora;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	
}
