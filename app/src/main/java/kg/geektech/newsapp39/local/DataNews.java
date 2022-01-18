package kg.geektech.newsapp39.local;

import java.util.ArrayList;

import kg.geektech.newsapp39.models.News;

public class DataNews {
    private ArrayList<News> newsList = new ArrayList<>();

    public DataNews(){
        for (int i = 0; i < 15; i++) {
            newsList.add(new News("news: "+i, 101));
        }
    }

    public ArrayList<News> getNewsList(){
        return newsList;
    }
}
