package com.w3d3;

public final class GestioneEventi {
    public static void main(String[] args) {
        Location irishPub = new Location("Irish Pub", "Roma");
        Persona mario = new Persona("Mario", "Rossi", "mrossi@gmail.com", "21/01/1996", sesso.MASCHIO);
        Evento ev = new Evento("festa di Luca", "11/08/2023", "festa all'Irish pub", tipoEvento.PRIVATO, 30, irishPub);
        mario.partecipa(ev);
        LocationDAO.save(irishPub);
        PersonaDAO.save(mario);
        EventoDAO.save(ev);
        
    }
}
