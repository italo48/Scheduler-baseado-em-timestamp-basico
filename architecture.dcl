%def modules
module Model: exec.Dado.java, exec.Transacao.java, 
module Control: exec.Escalonador.java
module View: exec.Main.java

%def rules
Control must-create Model
