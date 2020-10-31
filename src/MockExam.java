import java.util.Random;
import java.util.Set;

public class MockExam {

    private String course;
    private String randomQuestions;
    private int numberOfQuestions;
    private Set<String> questions = java.util.Set.of("!d-Vf-Vi-a-t", "d-!Vf-Vi-a-t", "d-Vf-!Vi-a-t","d-!a-!t-deltaV", "Vf-Vi-!d-!t-a", "d-Vf-Vi-!a-t", "d-Vf-Vi-a-!t", "!Vf-Vi-d-a-t","Vf-!Vi-d-a-t","Vf-Vi-!d-a-t","Vf-Vi-d-!a-t","Vf-Vi-d-a-!t","t-Vf-Vi-!d-a","t-!Vi-d-a-Vf","deltaV-!d-a-t", "t-a-d-Vi-!Vf", "t-a-di-!df-Vi-Vf", "t-Vi-Vf-!a-d", "comes to a stop - !a - d - Vi - !t");


    public MockExam(String course, int numberOfQuestions) {
        this.course = course;
        this.numberOfQuestions = numberOfQuestions;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getRandomQuestions() {
        if (this.randomQuestions==null) {
            this.randomQuestions = "";
            setRandomQuestions(randomQuestions);
        }
        return this.randomQuestions;
    }

    public void setRandomQuestions(String randomQuestions) {
        int totalQuestions = getNumberOfQuestions();
        StringBuilder newQuestions;
        newQuestions = new StringBuilder(randomQuestions);
        for (int i = 0; i<totalQuestions; i++) {
            //have a set here from another class containing the strings of the questions that I have to do
            String newRandomString = randomString();

            newQuestions.append("\r\n" +
                    "\r\n" +
                    "\r\n").append(newRandomString);
            //randomly
           // newQuestions = appendToRandomQuestions(newRandomString);
        }


        this.randomQuestions = String.valueOf(newQuestions);
        System.out.println("testing");
    }

    public String randomString() {
        int size = questions.size();
        int item = new Random().nextInt(size);
        int i = 0;

        String chosenString = "";
        for(String str : questions)
        {
            if (i == item) {
                chosenString = str;
            }
            i++;
        }
        return chosenString;
    }

    public int getNumberOfQuestions() {
        return this.numberOfQuestions;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public String appendToRandomQuestions(String textToAppend) {
        return getRandomQuestions() + "\n " + textToAppend;

    }

    public String toString() {
        System.out.println(getRandomQuestions());
        return "Randomly generated Mock Exam for " + this.course + getRandomQuestions();
    }

}
