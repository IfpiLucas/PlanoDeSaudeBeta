public class Contratante{
	private int numeroConta;
	private int numeroAgencia;
	private String nome;
	
	public Contratante(int numeroConta, int numeroAgencia, String nome){
        this.nome = nome;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Número da conta: "+this.numeroConta+"\n"+
                "Número da agencia: "+this.numeroAgencia+"\n"+
                "Nome: "+this.nome;
	}
}
