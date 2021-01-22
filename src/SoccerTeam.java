public class SoccerTeam {

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    private int wins;
    private int losses;
    private int ties;
    private static int gamesPlayed = 0;
    private static int numGoals = 0;

    public SoccerTeam() {this(0,0,0);}

    public SoccerTeam(int w, int l, int t) {
        wins = w;
        losses = l;
        ties = t;
    }

    public void played(SoccerTeam other, int myScore, int otherScore) {

        if(myScore < otherScore) {
            other.wins++;
            this.losses++; }
        else if(myScore == otherScore) {
            this.ties++;
            other.ties++; }
        else {
            this.wins++;
            other.losses++; }

        gamesPlayed++;
        numGoals += myScore + otherScore;
    }

    public int getPoints() {
        return (this.wins*3 + this.ties);
    }

    public static int getGamesPlayed() {
        return gamesPlayed;
    }

    public static int getNumGoals() {
        return numGoals;
    }

    public void reset() {
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }

    public static void startTournament() {
        gamesPlayed = 0;
        numGoals = 0;
    }

    public static void main (String[] args) {

        SoccerTeam BillericaBadgers = new SoccerTeam();
        SoccerTeam TewksburyTigers = new SoccerTeam();
        SoccerTeam ChelmsfordChimps = new SoccerTeam();
        SoccerTeam LowellLions = new SoccerTeam();

        System.out.println(CYAN + "\n-----Tournament 1-----" + RESET);

        BillericaBadgers.played(TewksburyTigers, 5, 3);
        System.out.println(RED + "\n* Game " + getGamesPlayed() + " | Billerica Badgers vs. Tewksbury Tigers *" + RESET);
        System.out.println("Billerica Badgers Current Points: " + BillericaBadgers.getPoints());
        System.out.println("Tewksbury Tigers Current Points: " + TewksburyTigers.getPoints());

        ChelmsfordChimps.played(LowellLions, 3, 7);
        System.out.println(YELLOW + "\n* Game " + getGamesPlayed() + " | Chelmsford Chimps vs. Lowell Lions *" + RESET);
        System.out.println("Chelmsford Chimps Current Points: " + ChelmsfordChimps.getPoints());
        System.out.println("Lowell Lions Current Points: " + LowellLions.getPoints());

        TewksburyTigers.played(ChelmsfordChimps, 4, 4);
        System.out.println(GREEN + "\n* Game " + getGamesPlayed() + " | Tewksbury Tigers vs. Chelmsford Chimps *" + RESET);
        System.out.println("Tewksbury Tigers Current Points: " + TewksburyTigers.getPoints());
        System.out.println("Chelmsford Chimps Current Points: " + ChelmsfordChimps.getPoints());

        BillericaBadgers.played(ChelmsfordChimps, 9, 5);
        System.out.println(BLUE + "\n* Game " + getGamesPlayed() + " | Billerica Badgers vs. Chelmsford Chimps *" + RESET);
        System.out.println("Billerica Badgers Current Points: " + BillericaBadgers.getPoints());
        System.out.println("Chelmsford Chimps Current Points: " + ChelmsfordChimps.getPoints());

        System.out.println(PURPLE + "\nTotal Tournament Statistics:" + RESET);
        System.out.println("Billerica Badgers Total Points: " + BillericaBadgers.getPoints());
        System.out.println("Chelmsford Chimps Total Points: " + ChelmsfordChimps.getPoints());
        System.out.println("Tewksbury Tigers Total Points: " + TewksburyTigers.getPoints());
        System.out.println("Lowell Lions Total Points: " + LowellLions.getPoints());
        System.out.println("Total Games Played: " + getGamesPlayed() + " | Total Goals Scored: " + getNumGoals());

        BillericaBadgers.reset();
        TewksburyTigers.reset();
        ChelmsfordChimps.reset();
        LowellLions.reset();
        startTournament();

        System.out.println(CYAN + "\n-----Tournament 2-----" + RESET);

        ChelmsfordChimps.played(BillericaBadgers, 4, 6);
        System.out.println(RED + "\n* Game " + getGamesPlayed() + " | Chelmsford Chimps vs. Billerica Badgers *" + RESET);
        System.out.println("Chelmsford Chimps Current Points: " + ChelmsfordChimps.getPoints());
        System.out.println("Billerica Badgers Current Points: " + BillericaBadgers.getPoints());

        LowellLions.played(TewksburyTigers, 5, 5);
        System.out.println(YELLOW + "\n* Game " + getGamesPlayed() + " | Lowell Lions vs. Tewksbury Tigers *" + RESET);
        System.out.println("Lowell Lions Current Points: " + LowellLions.getPoints());
        System.out.println("Tewksbury Tigers Current Points: " + TewksburyTigers.getPoints());

        TewksburyTigers.played(ChelmsfordChimps, 3, 1);
        System.out.println(GREEN + "\n* Game " + getGamesPlayed() + " | Tewksbury Tigers vs. Chelmsford Chimps *" + RESET);
        System.out.println("Tewksbury Tigers Current Points: " + TewksburyTigers.getPoints());
        System.out.println("Chelmsford Chimps Current Points: " + ChelmsfordChimps.getPoints());

        BillericaBadgers.played(TewksburyTigers, 0, 6);
        System.out.println(BLUE + "\n* Game " + getGamesPlayed() + " | Billerica Badgers vs. Tewksbury Tigers *" + RESET);
        System.out.println("Billerica Badgers Current Points: " + BillericaBadgers.getPoints());
        System.out.println("Tewksbury Tigers Current Points: " + TewksburyTigers.getPoints());

        System.out.println(PURPLE + "\nTotal Tournament Statistics:" + RESET);
        System.out.println("Billerica Badgers Total Points: " + BillericaBadgers.getPoints());
        System.out.println("Chelmsford Chimps Total Points: " + ChelmsfordChimps.getPoints());
        System.out.println("Tewksbury Tigers Total Points: " + TewksburyTigers.getPoints());
        System.out.println("Lowell Lions Total Points: " + LowellLions.getPoints());
        System.out.println("Total Games Played: " + getGamesPlayed() + " | Total Goals Scored: " + getNumGoals());

    }
}
