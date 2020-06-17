package Home;

public enum Season {
    WINTER , SPRING , SUMMER , AUTUMN;

    String seasons;

    Season(String seasons) {
        this.seasons = seasons;
    }

    Season() {
    }



    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }
}
