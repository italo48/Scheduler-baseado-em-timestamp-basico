package exec;

public class Transacao {
	private int timeStamp;
	private Dado dado;
	private String operacao;
	
	
	
	public Transacao(int timeStamp, Dado dado, String operacao) {
		super();
		this.timeStamp = timeStamp;
		this.dado = dado;
		this.operacao = operacao;
	}
	public int getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(int timeStamp) {
		this.timeStamp = timeStamp;
	}
	public Dado getDado() {
		return dado;
	}
	public void setDado(Dado dado) {
		this.dado = dado;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
}
