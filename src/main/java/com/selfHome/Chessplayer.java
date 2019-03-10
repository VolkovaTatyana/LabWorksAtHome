package com.selfHome;

public class Chessplayer implements SportsMan {

    private String name;
    private String kindOfSport;

    private String getName() {
        return name;
    }

    private String getKindOfSport() {
        return kindOfSport;
    }

    Chessplayer(String name, String kindOfSport) {
        this.name = name;
        this.kindOfSport = kindOfSport;
    }

    @Override
    public String Name() {
        return getName();
    }

    @Override
    public String kindOfSport() {
        return getKindOfSport();
    }
}
