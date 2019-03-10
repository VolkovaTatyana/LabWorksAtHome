package com.selfHome;

public class Sport {
    public static void main(String[] args) {

        SportsMan[] sportsMans1 = new SportsMan[3];

        sportsMans1[0] = new Footballer("Pele", "Football");
        sportsMans1[1] = new Pilot("Gastello", "Formula");
        sportsMans1[2] = new Chessplayer("Garry", "Chess");

        for (SportsMan sportsMan : sportsMans1) {
            System.out.println("Kind of sport: " + sportsMan.kindOfSport() + " / "
                    + "Name of sportsman: " + sportsMan.Name());
            System.out.println();
        }

    }
}
