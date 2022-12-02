package domaine;

public interface Query {
    String getUrl();
    void setUrl(String name);
    void setHttpMethod(QueryMethod get);
    QueryMethod getHttpMethod();

    enum QueryMethod {
        GET("GET"), POST("POST");
        private String name;

        QueryMethod(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
