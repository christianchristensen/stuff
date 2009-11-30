// package org.Test.client;
// 
// 
// import java.util.ArrayList;
// import java.util.List;
// 
// import com.google.gwt.core.client.GWT;
// import com.google.gwt.event.dom.client.ClickEvent;
// import com.google.gwt.event.dom.client.ClickHandler;
// import com.google.gwt.event.dom.client.DomEvent;
// import com.google.gwt.event.dom.client.KeyCodes;
// import com.google.gwt.event.dom.client.KeyDownEvent;
// import com.google.gwt.event.dom.client.KeyDownHandler;
// import com.google.gwt.event.logical.shared.SelectionEvent;
// import com.google.gwt.event.logical.shared.SelectionHandler;
// import com.google.gwt.event.shared.EventHandler;
// import com.google.gwt.user.client.ui.Composite;
// import com.google.gwt.user.client.ui.DialogBox;
// import com.google.gwt.user.client.ui.FlowPanel;
// import com.google.gwt.user.client.ui.HTML;
// import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
// import com.google.gwt.user.client.ui.SuggestBox;
// import com.google.gwt.user.client.ui.SuggestOracle;
// import com.google.gwt.user.client.ui.TextBox;
// import com.google.gwt.user.client.rpc.*;
// import com.google.gwt.user.client.ui.*;
// import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;
// 
// public class ItemSuggestion implements IsSerializable, Suggestion {
// 
//       private String s;
//       // Required for IsSerializable to work
//       public ItemSuggestion() {
//       }
// 
//       // Convenience method for creation of a suggestion
//       public ItemSuggestion(String s) {
//          this.s = s;
//       }
// 
//       public String getDisplayString() {
//         System.out.println(s);
//         
//           return s;
//       }
// 
//       public String getReplacementString() {
//         System.out.println(s);
//           return s;
//       }
//    } // end inner class ItemSuggestion
//    