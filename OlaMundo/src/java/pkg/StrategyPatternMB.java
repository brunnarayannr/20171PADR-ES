package pkg;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "strategyPatternMB")
@Dependent
public class StrategyPatternMB {
     StringBuilder texto = new StringBuilder();
    
    public StrategyPatternMB() {
    }

    public StringBuilder getTexto() {
        texto.append("<br />")
             .append("Agora são: ")
             .append(new SimpleDateFormat("hh:mm:ss")
                     .format(new Date()))
             .append("<br />")
             .append("Do dia: ")
             .append(new SimpleDateFormat("dd-MM-yyyy")
                     .format(new Date()))
        ;
        return texto;
    }

    // Não é necessário
    public void setTexto(StringBuilder texto) {
        this.texto = texto;
    }


}