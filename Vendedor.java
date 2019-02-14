public class Vendedor extends Pessoa{
	private Date dataAdmicao;
	private float salario;
	private float salarioMes;

	public getSalario(){
		return this.salario;
	}

	public setSalario(float salario){
		this.salario = salario;
	}

	public Vendedor(String nome, String telefone, Date data_nascimento, String cpf, Date dtAdmicao) {
		super(nome, telefone, data_nascimento, cpf);
		this.dataAdmicao = dtAdmicao;
	}

}