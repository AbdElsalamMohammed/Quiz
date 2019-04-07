package quiz;

 class Question {

     public String getCorrect_answer() {
         return correct_answer;
     }

     public void setQuestion(String question) {
         this.question = question;
     }

     public void setCorrect_answer(String correct_answer) {
         this.correct_answer = correct_answer;
     }

     private String question;
     private String wrong_answer1;
     private String wrong_answer2;
     private String correct_answer;


}

