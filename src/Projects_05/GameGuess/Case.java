package Projects_05.GameGuess;

public class Case {
    private String actualCase;
    private boolean isTested;
    private String conclusion;

    public String getActualCase() {
        return actualCase;
    }

    public void setActualCase(String actualCase) {
        this.actualCase = actualCase;
    }

    public boolean getIsTested() {
        return isTested;
    }

    public void setTested(boolean tested) {
        isTested = tested;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
