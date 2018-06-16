
package model;
// @author Well

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
    
    private Date dataDoEvento;

    public Date getDataDoEvento() {
        return dataDoEvento;
    }

    public void setDataDoEvento(Date dataDoEvento) {
        this.dataDoEvento = dataDoEvento;
    }
    
    public List<Evento> criarEventosFuturos(){
        List<Evento> eventos = new ArrayList<>();
            Evento eventoFuturo = new Evento ();
            
            Date dataFutura = new Date (dataDoEvento.getTime() + 1000 * 60 * 60 * 24 * 30);
            eventoFuturo.setDataDoEvento(dataFutura);
           
                eventos.add(eventoFuturo);
                return eventos;
    }
    
}
