package quiz;

public class PersonalityQuestions {

    private String question;
    private String[] options;
    private int introvertScore;

    public PersonalityQuestions(String question, String[] options, int introvertScore) {
        this.question = question;
        this.options = options;
        this.introvertScore = introvertScore;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getIntrovertScore() {
        return introvertScore;
    }
}