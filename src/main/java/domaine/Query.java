package domaine;

public class Query {
    private String url;
    private QueryMethod httpMethod;

    public Query(String url, QueryMethod httpMethod) {
        this.url = url;
        this.httpMethod = httpMethod;
    }

    public String getUrl() {
        return url;
    }

    public QueryMethod getHttpMethod() {
        return httpMethod;
    }

    public enum QueryMethod {
        GET("GET"),POST("POST");
        private String name;
        QueryMethod(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

