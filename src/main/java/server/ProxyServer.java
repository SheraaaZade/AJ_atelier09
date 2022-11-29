package server;

import domaine.Query;

import java.util.Scanner;

public class ProxyServer {
    Scanner scanner = new Scanner(System.in);

    public void startServer(){
        String url;
        while(true){
            url = scanner.nextLine();
            QueryHandler queryhandler = new QueryHandler();
            queryhandler.start();
            Query query = new Query(url, Query.QueryMethod.GET);
        }
    }
}
