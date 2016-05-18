package com.asaneasa.sports.playbigbackend.controllers;

import com.asaneasa.sports.playbigbackend.daos.Tournament;
import com.asaneasa.sports.playbigbackend.repositories.TournamentRepository;
import com.asaneasa.sports.playbigbackend.responses.TournamentResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TournamentController {
    @Autowired
    private TournamentRepository tournamentRepository;
    private final static Logger LOGGER = Logger.getLogger(TournamentController.class);

    @RequestMapping("/tournament")
    public ArrayList<TournamentResponse> getAllTournaments() {
        TournamentResponse tournamentResponse;
        ArrayList<TournamentResponse> listTournamentResponse = new ArrayList<>();
        try {

            ArrayList<Tournament> listTournament = (ArrayList<Tournament>) tournamentRepository.findAll();
            if (listTournament != null) {

                for (Tournament tournament: listTournament) {
                    tournamentResponse = new TournamentResponse();

                    tournamentResponse.setTournamentId(tournament.getTournamentId());
                    tournamentResponse.setName(tournament.getName());
                    tournamentResponse.setStartTime(tournament.getStartTime());
                    tournamentResponse.setDescription(tournament.getDescription());

                    listTournamentResponse.add(tournamentResponse);
                }

               // LOGGER.debug(String.format("%s user found", firstName));
            } else {
                //LOGGER.debug(String.format("%s user not found", firstName));
            }

        }
        catch (Exception ex) {
           // LOGGER.debug(String.format("%s user not found", firstName));
        }
        return listTournamentResponse;
    }

}
