package map.eventos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> agenda;

    public AgendaEventos(){
        this.agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate date, String nome, String atracao){
        this.agenda.put(date, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventos = new TreeMap<>(this.agenda);
        System.out.println(eventos);
    }

    public void proxEvento(){
        LocalDate hoje = LocalDate.now();
        Map<LocalDate, Evento> eventos = new TreeMap<>(agenda);

        for(Map.Entry<LocalDate, Evento> entry : eventos.entrySet()) {
            if(entry.getKey().isEqual(hoje) || entry.getKey().isAfter(hoje)) {
                System.out.println("Próximo evento: " + entry.getValue());
                break;
            }
        }

    }
}
