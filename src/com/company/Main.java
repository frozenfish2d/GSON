package com.company;

import com.google.gson.Gson;
import com.google.gson.internal.$Gson$Types;


import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

interface DownloadListener {
    void onError();
    void onDownload(WikiJSON wikiJSON);
}

class Parser implements Runnable {
    private String search;


    public DownloadListener getListener() {
        return listener;
    }

    public void setListener(DownloadListener listener) {
        this.listener = listener;
    }

    private DownloadListener listener;


    Parser(String s) {
        search = s;
    }



    @Override
    public void run() {
        try {
            URL jsonUrl = new URL("https://ru.wikipedia.org/w/api.php?" +
                    "action=query&list=search&utf8=&format=json&srsearch=" + search);
            InputStream jsonStream = jsonUrl.openStream();
            Reader reader = new InputStreamReader(jsonStream, "UTF-8");
            Gson gson = new Gson();
            WikiJSON wikiJSON = gson.fromJson(reader, WikiJSON.class);

            List<Search> results = wikiJSON.getQuery().getSearch();
            if(results !=null){
                //listener.onDownload();
            }
            for (Search result : results) {
                System.out.println(result.getTitle());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {

//        try {
//            URL url = new URL("http://school444.ru");
//            URLConnection conn = url.openConnection();
//            System.out.println(conn.getContentLength());
//            System.out.println(conn.getContentType());
//            Map<String, List<String>> map = conn.getHeaderFields();
//            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
//                System.out.println("Key : " + entry.getKey() +
//                        " ,Value : " + entry.getValue());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        String searchString;
        Scanner valueS = new Scanner(System.in);
        System.out.print("Enter string for search:");
        searchString = valueS.next();
        Parser parser = new Parser(searchString);
        parser.setListener(new WikiJSON());
        Thread thread = new Thread(parser);
        thread.start();

    }
}