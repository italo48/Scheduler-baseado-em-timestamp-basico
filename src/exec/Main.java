package exec;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Escalonador tercio = new Escalonador();
		
		Dado x = new Dado("(x)", 0, 0);
		Dado y = new Dado("(y)", 0, 0);
		Dado z = new Dado("(z)", 0, 0);

		
		List<Transacao> transacoes = new ArrayList<>();
		transacoes.add(new Transacao(2, x,"r"));
		transacoes.add(new Transacao(1, y,"r"));
		transacoes.add(new Transacao(1, y,"w"));
		transacoes.add(new Transacao(2, y,"r"));
		transacoes.add(new Transacao(1, z,"w"));
		transacoes.add(new Transacao(2, y,"w"));
		
		
		
		for(Transacao t : transacoes) {			
			System.out.println(t.getOperacao() + t.getTimeStamp() + t.getDado().getId());
		}
		if(tercio.isSerializavel(transacoes)) {
			System.out.println("É serializavel");
		}else {
			System.out.println("Não é serializavel");
		}
	}
}
