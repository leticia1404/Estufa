package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String nome;
    private int umidade_atual;
	
    public Quote() {
    }

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getUmidade_atual() {
		return umidade_atual;
	}
	public void setUmidade_atual(int umidade_atual) {
		this.umidade_atual = umidade_atual;
	}
	
	@Override
    public String toString() {
        return "Sensor{" +
                ", nome=" + nome +
                ", umidade_atual=" + umidade_atual +
                '}';
    }
}