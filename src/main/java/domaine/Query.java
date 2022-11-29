package domaine;

public class Query {
    String url;
    QueryMethod httpMethod;

    public Query(String url, QueryMethod httpMethod) {
        this.url = url;
        this.httpMethod = httpMethod;
    }
    public enum QueryMethod {
        GET("Get"),POST("Post");
        private String name;
        QueryMethod(String name) {
            this.name = name;
        }
    }
}

