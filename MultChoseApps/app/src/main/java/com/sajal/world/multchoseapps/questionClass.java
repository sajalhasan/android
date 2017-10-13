package com.sajal.world.multchoseapps;


public class questionClass {
    public String mQuestions[] ={
            "1st question",
            "2nd Question",
            "3rd question",
            "4th question"
            };

    private String mChoices[][]={
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},
      };

      private String mCorrectAnswers[]={"1","2","3","4"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice=mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice=mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice=mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice=mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
