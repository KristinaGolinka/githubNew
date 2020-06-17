package Home;

public enum Month {
    JANUARY, MARCH, FEBRUARY, APRIL , MAY , JUNE , JULY , AUGUST , SEPTEMBER , OCTOBER , NOVEMBER , DECEMBER;

     private int days;
    private String seasons;

    Month(int weeks, String seasons) {
        this.days = weeks;
        this.seasons = seasons;
    }

    Month() {

    }


    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }
}
