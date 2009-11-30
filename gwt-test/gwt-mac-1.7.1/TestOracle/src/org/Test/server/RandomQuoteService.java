public class RandomQuoteService extends RemoteServiceServlet implements IQuoteService {
  
  
   public SuggestOracle.Response getQuote(SuggestOracle.Request req) {
      
       // req has request properties that you can use to perform a db search
       // or some other query. Then populate the suggestions up to req.getLimit() and
       // return in a SuggestOracle.Response object.
       SuggestOracle.Response resp = new SuggestOracle.Response();
      
       List<suggestion> suggestions = new ArrayList<suggestion>();
       suggestions.add(new ItemSuggestion("It is a good day to die"));
       suggestions.add(new ItemSuggestion("I shall return"));
       suggestions.add(new ItemSuggestion("There is nothing to fear but fear itself"));
      
       resp.setSuggestions(suggestions);
       return resp;
   }
}