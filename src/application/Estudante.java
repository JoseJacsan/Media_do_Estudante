package application;

public class Estudante {
	private String nome;
	private int idade;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public double tirarMedia() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	//getters
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double getNota1() {
		return this.nota1;
	}
	
	public double getNota2() {
		return this.nota2;
	}
	
	public double getNota3() {
		return this.nota3;
	}
	
	public double getNota4() {
		return this.nota4;
	}
	
	public String toString() {
		return "\nNome do aluno: "+ nome
				+ "\n Idade do aluno: "+ idade +" anos"
				+ "\n Média: "+ String.format("%.2f%n", tirarMedia());
		
	}
}
