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
import com.google.gwt.user.client.rpc.*;

public class ItemSuggestOracle extends SuggestOracle {

       public boolean isDisplayStringHTML() {
           return true;
       }

       public void requestSuggestions(SuggestOracle.Request req,SuggestOracle.Callback callback) {         
           IQuoteService.Util.getInstance().getQuote(req, new ItemSuggestCallback(req, callback));
       }

       class ItemSuggestCallback implements AsyncCallback {

           private SuggestOracle.Request req;
           private SuggestOracle.Callback callback;

           public ItemSuggestCallback(SuggestOracle.Request _req,
                   SuggestOracle.Callback _callback) {
               req = _req;
               callback = _callback;
           }

           public void onFailure(Throwable error) {
               callback.onSuggestionsReady(req, new SuggestOracle.Response());
           }

           public void onSuccess(Object retValue) {             
               callback.onSuggestionsReady(req,
                       (SuggestOracle.Response) retValue);
           }
       }
   }
   