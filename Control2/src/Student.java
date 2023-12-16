import java.lang.Math;
public abstract class Student {
    private int score;
    private String inItis;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getisInItis() {
        return inItis;
    }

    public void setInItis(String inItis) {
        this.inItis = inItis;
    }

    protected abstract void makeElecEngineering();
    protected abstract void makeProgrammiring();

}
