package Lesson17.articles;

import java.util.*;

public class View {
    Scanner input = new Scanner(System.in);

    public String waitUserAnswer() {
        System.out.println("========= Ввод пользовательских данных =========");
        System.out.println("Действия со статьями:");
        System.out.println("1 - создание строки" +
                "\n2 - просмотр статей" +
                "\n3 - просмотр определенной статьи" +
                "\n4 - удаление статьи" +
                "\nq - выход из программы");
        System.out.print("Выберите вариант действия: ");
        String userAnswer = input.nextLine();
        System.out.println("================================================");
        return userAnswer;
    }

    public Map addUserArticle() {
        Map<String, String> dictArticle = new LinkedHashMap<>();
        dictArticle.put("название", "");
        dictArticle.put("автор", "");
        dictArticle.put("количество страниц", "");
        dictArticle.put("описание", "");
        System.out.println("=============== Создание статьи ===============");
        for (Map.Entry<String, String> el : dictArticle.entrySet()) {
            System.out.print("Введите " + el.getKey() + " статьи: ");
            dictArticle.put(el.getKey(), input.nextLine());
        }
        System.out.println("================================================");
        return dictArticle;
    }

    public void showAllArticles(Collection articles) {
        System.out.println("================= Список статей ================");
        for (var element : articles) {
            System.out.println(element);
        }
        System.out.println("================================================");
    }

    public String getUserArticle() {
        System.out.println("============= Ввод название статьи =============");
        System.out.print("-> ");
        String user_article = input.nextLine();
        System.out.println("================================================");
        return user_article;
    }

    public void getSingleArticles(Map article) {
        System.out.println("============= Просмотр статьи =============");
        for (Object el : article.entrySet()) {
            System.out.println(el);
        }
        System.out.println("================================================");
    }

    public void showIncorrectTitleError(String userTitle) {
        System.out.println("============= Сообщение об ошибке ==============");
        System.out.println("Статьи с названием " + userTitle + " не существует");
        System.out.println("================================================");
    }


    public void removeSingleArticle(Article article) {
        System.out.println("============= Удаление статьи ==================");
        System.out.println("Статья " + article + " была удалена");
        System.out.println("================================================");
    }

    public void showIncorrectAnswerError(String answer){
        System.out.println("============= Сообщение об ошибке ==============");
        System.out.println("Варианта " + answer + " не существует");
        System.out.println("================================================");
    }





//    public Map allUserArticle() {
//        Map<String, String> dictArticle = new LinkedHashMap<>();
//        dictArticle.put("Название статьи: Кому на Руси жить хорошо.", "");
//        dictArticle.put("Автор: Н. А. Некрасова.", "");
//        dictArticle.put("количество страниц: 448.", "");
//        dictArticle.put("Описание: путешествии семерых крестьянских мужиков по всей Руси с целью поиска счастливого человека.", "");
//        System.out.println("======== Просмотр определенной статьи ==========");
//        for (Map.Entry<String, String> el : dictArticle.entrySet()){
//            System.out.print("" + el.getKey() + "\n");
//            //dictArticle.put(el.getKey(), input.nextLine());
//        }
//        System.out.println("================================================");
//        return dictArticle;
//    }
//
//    public Map removeUserArticle(){
//        Map<String, String> remDictArticle = new LinkedHashMap<>();
//
//        remDictArticle.put("1", "1) Кому на руси жить хорошо.");
//        remDictArticle.put("2", "2) Слово пацана, кровь на асфальте.");
//        remDictArticle.put("3", "3) Государство Палестина.");
//        remDictArticle.put("4", "4) Сектор газа.");
//
//        System.out.println("=============== Удаление статьи ================");
//        for (Map.Entry<String, String> el : remDictArticle.entrySet()){
//            System.out.print("Список на удаление: " + el.getValue() + "\n");
//        }
//        System.out.print("Выберете номер: ");
//        String keyToRemove = input.nextLine();
//        if (remDictArticle.containsKey(keyToRemove)) {
//            remDictArticle.remove(keyToRemove);
//            System.out.println("Элемент с ключом '" + keyToRemove + "' был удален.");
//        } else {
//            System.out.println("Ключ '" + keyToRemove + "' не найден.");
//        }
//
//        System.out.println("============== Оставшиеся статьи ================");
//        for (Map.Entry<String, String> el : remDictArticle.entrySet()){
//            System.out.print("" + el.getValue() + "\n");
//        }
//
//        System.out.println("================================================");
//        return remDictArticle;
//    }
}
