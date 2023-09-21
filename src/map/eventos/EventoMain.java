package map.eventos;

import java.time.LocalDate;
import java.util.Date;

public class EventoMain {

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.now().minusDays(1L), "Party 1", "Festa na praia");
        agenda.adicionarEvento(LocalDate.now(), "Party 2", "Festa na varanda");
        agenda.adicionarEvento(LocalDate.now().plusDays(1L), "Party 3", "Festa na piscina");
        agenda.adicionarEvento(LocalDate.now().plusDays(2L), "Party 4", "Festa na praça");

        agenda.exibirAgenda();
        agenda.proxEvento();
    }
}
