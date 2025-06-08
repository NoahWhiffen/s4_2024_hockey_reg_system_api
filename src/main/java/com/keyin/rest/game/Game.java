package com.keyin.rest.game;

import jakarta.persistence.*;
import com.keyin.rest.team.*;
import java.time.*;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameId;
    @ManyToOne
    private Team homeTeam;
    @ManyToOne 
    private Team awayTeam;
    private String location;
    private LocalDateTime scheduledDate;

    // Getters
    public long getGameId() {
        return gameId;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getScheduledDate() {
        return scheduledDate;
    }

    // Setters
    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setScheduledDate(LocalDateTime scheduledDate) {
        this.scheduledDate = scheduledDate;
    }
}
