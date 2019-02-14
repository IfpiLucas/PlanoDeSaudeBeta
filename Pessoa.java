public class Pessoa{
	private String nome;
	private String telefone;
	private Date dataNascimento;
	private String cpf;

	public Pessoa(String nome, String telefone, Date data_nascimento, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = data_nascimento;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String data_nascimento) {
		this.dataNascimento = data_nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}