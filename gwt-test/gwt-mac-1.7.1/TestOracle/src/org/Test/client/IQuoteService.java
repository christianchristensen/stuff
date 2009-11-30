package org.Test.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.SuggestOracle;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.*;

public interface IQuoteService extends RemoteService {

public static class Util {
  public static IQuoteServiceAsync getInstance() {
   IQuoteServiceAsync instance=(IQuoteServiceAsync) GWT.create(IQuoteService.class);
   ServiceDefTarget target = (ServiceDefTarget) instance;
//http://localhost:8081/drupal-6.14/userreference/autocomplete/field_user/ad
   target.setServiceEntryPoint("/userreference/autocomplete/field_user");
   System.out.println(instance);
   System.out.println(target.getServiceEntryPoint());
  //target.setServiceEntryPoint("/GWT/quote");
   return instance;
  }
}

   public SuggestOracle.Response getQuote(SuggestOracle.Request req);
}

