# Scheduler Baseado em Timestamp Básico

Este projeto é uma implementação em Java do algoritmo de TS-Básico
usado pelo escalonador do SGBD como uma das técnicas de controle de concorrência.

## Algoritmo

    TS-Básico(Tx, dado, operação)

    início
        se operação= ‘READ’então
    	    se TS(Tx)< R-TS(dado).TS-Write então
    	        início abort(Tx);
    		        restart(Tx) com novo TS;
    	        fim
    	    senão início executar read(dado);
    			se R-TS(dado).TS-Read < TS(Tx)então
    				R-TS(dado).TS-Read =TS(Tx);
    		    fim
        senão início/* operação= ‘WRITE’*/
    	    se TS(Tx)< R-TS(dado).TS-Read ou
                TS(Tx)< R-TS(dado).TS-Write então
    		    início abort(Tx);
        			restart(Tx) com novo TS;
    		    fim
    	    senão início executar write(dado);
    			R-TS(dado).TS-Write =TS(Tx);
    		fim
    	fim
    fim

---

## Mais informações
[Slide da ufsc sobre o assunto](http://www.inf.ufsc.br/~r.mello/ine5616/11-Scheduler-III.pdf)
