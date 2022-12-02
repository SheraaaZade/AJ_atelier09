package domaine;

 public class QueryImpl implements Query {
    private String url;
    private QueryMethod httpMethod;
    @Override
    public String getUrl() {
        return url;
    }
    @Override
    public QueryMethod getHttpMethod() {
        return httpMethod;
    }

     public void setUrl(String url) {
         this.url = url;
     }

     public void setHttpMethod(QueryMethod httpMethod) {
         this.httpMethod = httpMethod;
     }
 }

