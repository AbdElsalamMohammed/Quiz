package quiz;

public class UserServices {
    public   Quiz Served_quiz;

    public void takeQuiz(){
        // a quiz is chosen by the user, retrieved in served_quiz object
        //and provided to the user in json format
    }

    public void notifyAdmin(){
        //when the user takes a quiz , the admin should be notified by the action
    }

    public void modifyProfile(){
        //take the user info from the user management component , and store his quiz score if he passes the quiz
        //successfully
    }

    public int getUser_score(){
        //return user score in quiz
        return Served_quiz.getUser_score();
    }
}
