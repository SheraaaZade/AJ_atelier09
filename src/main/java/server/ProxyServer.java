package server;

import domaine.Query;
import domaine.QueryFactory;
import domaine.QueryImpl;

import java.util.Scanner;

public class ProxyServer {
    Scanner scanner = new Scanner(System.in);
    QueryFactory queryFactory;

    public void startServer(){
        String url;

        while(true){
            url = scanner.nextLine();
            Query query = QueryFactory.getQuery();
            query.setUrl(url);

            query.setHttpMethod(Query.QueryMethod.GET);
            QueryHandler queryhandler = new QueryHandler(query);
            queryhandler.start();

        }
    }
}
