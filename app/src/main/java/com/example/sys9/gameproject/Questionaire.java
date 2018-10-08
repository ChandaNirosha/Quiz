package com.example.sys9.gameproject;

class Questionaire {
    public String questions[]={"Who is the Prime Minister of india?",
            "Which of the following is the national animal of india?",
            "How many colours are in indian national flag?",
            "Which of the following organ is used to taste food?",
            "Which of the followin is not an outdoor game?"};
    public String choices[][]={
            {"Narendra Modi","Gandhiji","Nehru","Rahul"},
            {"Lion","Tiger","Elephant","Fox"},
            {"One","Two","Three","Four"},
            {"Tongue","kidney","Lips","Teeth"},
            {"Hockey","Table Tennis","Cricket","Football"},};
    public String correctAnswer[]={"NarendraModi",
            "Tiger",
            "Three",
            "Tongue",
            "Table Tennis"};
    public String getQusetion(int a){
        String question=questions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice=choices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice=choices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice=choices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice=choices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer=correctAnswer[a];
        return answer;
    }
    public String getScore(String score){
        return score;
    }
}

