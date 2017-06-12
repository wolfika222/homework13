/**
 * Created by Hp_Workplace on 2017. 06. 12..
 */
public class FilmActor {

    private int actorId;
    private int filmId;
    private String lastUpdate;

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "FilmActor{" +
                "actorId=" + actorId +
                ", filmId=" + filmId +
                ", lastUpdate='" + lastUpdate + '\'' +
                '}';
    }
}
