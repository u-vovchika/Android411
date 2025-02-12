package Lesson17.articles;

import java.util.Collection;
import java.util.Map;

public class Controller {
    private Model articleModel;
    private View userInterface;

    public Controller() {
        this.articleModel = new Model();
        this.userInterface = new View();
    }

    public void run(){
        String answer = "";
        while (!answer.equals("q")){
            answer = userInterface.waitUserAnswer();
            checkUserAnswer(answer);
        }
    }

    public void checkUserAnswer(String answer){
        if(answer.equals("1")){
            Map article = userInterface.addUserArticle();
            articleModel.addArticle(article);
        } else if(answer.equals("2")){
            Collection articles = articleModel.getAllArticles();
            userInterface.showAllArticles(articles);
        }else if(answer.equals("3")){
            Map article = userInterface.allUserArticle();
            articleModel.addArticle(article);
        }else if(answer.equals("4")){
            Map article = userInterface.removeUserArticle();
            articleModel.addArticle(article);
        }

    }
}
