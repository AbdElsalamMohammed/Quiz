package quiz;

public class Quiz {
    public String getTitle() {
        return title;
    }

    public String getSkill_type() {
        return skill_type;
    }

    public int getPass_score() {
        return pass_score;
    }

    public int getUser_score() {
        return user_score;
    }

    public int getNum_questions() {
        return num_questions;
    }

    public int getDuration() {
        return duration;
    }

    public Question getQuuestions() {
        return questions;
    }

    private String title;


    private String skill_type;
    private int pass_score;
    private int user_score;
    private int num_questions;
    private int duration;
    private Question questions;



}
