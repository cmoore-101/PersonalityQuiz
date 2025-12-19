// Personality quiz- Chaliyah M

package quiz;

public class QuestionsQuiz {

    private PersonalityQuestions[] questions;
    private int currentIndex;
    private int score;

    public QuestionsQuiz() {
        questions = new PersonalityQuestions[] {
            new PersonalityQuestions(
                "How do you prefer to spend a weekend?",
                new String[]{"Reading alone", "Going to a party"},
                1
            ),
            new PersonalityQuestions(
                "How do you feel after social events?",
                new String[]{"Drained", "Energized"},
                1
            ),
            new PersonalityQuestions(
                "Which do you prefer?",
                new String[]{"Deep conversations", "Meeting many people"},
                1
            )
        };

        currentIndex = 0;
        score = 0;
    }

    public PersonalityQuestions getCurrentQuestion() {
        return questions[currentIndex];
    }

    public void answerQuestion(int choice) {
        if (choice == 0) {
            score += questions[currentIndex].getIntrovertScore();
        }
        currentIndex++;
    }

    public boolean hasNextQuestion() {
        return currentIndex < questions.length;
    }

    public String getResult() {
        return score >= 2
                ? "You are an Introvert!"
                : "You are an Extrovert!";
    }
}