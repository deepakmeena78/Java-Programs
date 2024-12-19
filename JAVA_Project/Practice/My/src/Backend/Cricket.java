package Backend;

public class Cricket {

    private long over;
    private long ball;
    private long runs;
    private String batsman;
    private String bowler;
    private String nonStriker;

    public Cricket(long over, long ball, long runs, String batsman, String bowler, String nonStriker) {
        this.over = over;
        this.ball = ball;
        this.runs = runs;
        this.batsman = batsman;
        this.bowler = bowler;
        this.nonStriker = nonStriker;
    }

    public void setOver(long over) {
        this.over = over;
    }

    public void setBall(long ball) {
        this.ball = ball;
    }

    public void setRuns(long runs) {
        this.runs = runs;
    }

    public void setBatsman(String batsman) {
        this.batsman = batsman;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }

    public void setNonStriker(String nonStriker) {
        this.nonStriker = nonStriker;
    }

    public long getOver() {
        return over;
    }

    public long getBall() {
        return ball;
    }

    public long getRuns() {
        return runs;
    }

    public String getBatsman() {
        return batsman;
    }

    public String getBowler() {
        return bowler;
    }

    public String getNonStriker() {
        return nonStriker;
    }
}
