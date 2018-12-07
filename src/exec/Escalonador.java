package exec;

import java.util.List;

public class Escalonador {
//	falsificando um vetor de booleans
	public boolean[] madeInChina(int tamanho) {
		boolean[] vetor = new boolean[tamanho];
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = false;
		}
		return vetor;
	}
	public boolean isSerializavel(List<Transacao> transacoes) {
		boolean[] resultados = madeInChina(transacoes.size());
		int indice = 0;
		int cont = 0;
		
		for(Transacao t : transacoes) {
			indice++;
//			READ
			if(t.getOperacao().equals("r")) {				
				if(t.getTimeStamp() < t.getDado().getWriteTimeStamp()) {
					t.setTimeStamp(t.getTimeStamp());
				}else {
					if(t.getDado().getReadTimeStamp() < t.getTimeStamp()) {
						t.getDado().setReadTimeStamp(t.getTimeStamp());
					}
					resultados[indice - 1] = true;
				}
			}
//			WRITE
			else {
				if(t.getTimeStamp() < t.getDado().getReadTimeStamp()
						|| t.getTimeStamp() < t.getDado().getWriteTimeStamp()) {
					t.setTimeStamp(t.getTimeStamp());
				}else {
					t.getDado().setWriteTimeStamp(t.getTimeStamp());
					resultados[indice - 1] = true;
				}
			}
		}
		for(boolean b : resultados) {
			if(b == true) {
				cont++;
			}
		}
		if(cont == transacoes.size())
			return true;
		
		return false;
	}
}
