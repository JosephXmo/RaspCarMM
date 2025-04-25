public class CDTrack {
    private final String title;
    private final int durationSeconds;

    public CDTrack(String title, int durationSeconds) {
        this.title = title;
        this.durationSeconds = durationSeconds;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }
}
