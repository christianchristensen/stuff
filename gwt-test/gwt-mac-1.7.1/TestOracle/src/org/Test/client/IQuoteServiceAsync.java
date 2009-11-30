package org.Test.client;

import com.google.gwt.user.client.ui.SuggestOracle;
import com.google.gwt.user.client.rpc.*;

public interface IQuoteServiceAsync {
   public void getQuote(SuggestOracle.Request req, AsyncCallback callback);
}
