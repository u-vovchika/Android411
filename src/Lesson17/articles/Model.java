package Lesson17.articles;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
    private Map<String, Article> articles;

    public Model() {
        this.articles = new LinkedHashMap<>();
    }

    public void addArticle(Map dictArticle){
        Article article = new Article(dictArticle);
        articles.put((String) dictArticle.get("название"), article);
        //System.out.println(articles);
    }

    public Collection getAllArticles(){
        return articles.values();
    }
}


class Article{
    private String title;
    private String author;
    private String page;
    private String description;

    public Article(Map dictArticle) {
        this.title = (String) dictArticle.get("название");
        this.author = (String) dictArticle.get("автор");;
        this.page = (String) dictArticle.get("количество страниц");;
        this.description = (String) dictArticle.get("описание");;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPage() {
        return page;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return title + " (" + author + ')';
    }
}