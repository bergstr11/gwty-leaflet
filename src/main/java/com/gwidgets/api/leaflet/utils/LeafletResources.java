package com.gwidgets.api.leaflet.utils;

import com.google.gwt.core.client.GWT;

import elemental2.dom.DomGlobal;
import elemental2.dom.Element;
import elemental2.dom.HTMLLinkElement;
import elemental2.dom.HTMLScriptElement;


public class LeafletResources {
	public static void whenReady(boolean debug, Element.OnloadFn function){
		HTMLScriptElement leafletScript = (HTMLScriptElement) DomGlobal.document.createElement("script");
      HTMLScriptElement transformScript = (HTMLScriptElement) DomGlobal.document.createElement("script");
      HTMLScriptElement measureScript = (HTMLScriptElement) DomGlobal.document.createElement("script");
      HTMLScriptElement drawScript = (HTMLScriptElement) DomGlobal.document.createElement("script");
      HTMLScriptElement irrimasterScript = (HTMLScriptElement) DomGlobal.document.createElement("script");

		if (debug) {
			leafletScript.src = GWT.getModuleName() + "/leaflet/leaflet-src.js";
         transformScript.src = GWT.getModuleName() + "/leaflet/L.Path.Transform-src.js";
		} else {
			leafletScript.src = GWT.getModuleName() + "/leaflet/leaflet.js";
         transformScript.src = GWT.getModuleName() + "/leaflet/L.Path.Transform.js";
		}
      drawScript.src = GWT.getModuleName() + "/leaflet/leaflet-draw.js";
      irrimasterScript.src = GWT.getModuleName() + "/leaflet/irrimaster.js";
      measureScript.src = GWT.getModuleName() + "/leaflet/Leaflet.PolylineMeasure.js";

		leafletScript.type="text/javascript";
      measureScript.type = "text/javascript";
      transformScript.type = "text/javascript";
      drawScript.type = "text/javascript";
      irrimasterScript.type = "text/javascript";

		HTMLLinkElement leafletStyle = (HTMLLinkElement) DomGlobal.document.createElement("link");
		leafletStyle.href=GWT.getModuleName()+"/leaflet/leaflet.css";
		leafletStyle.rel="stylesheet";
		
      HTMLLinkElement measureStyle = (HTMLLinkElement) DomGlobal.document.createElement("link");
      measureStyle.href = GWT.getModuleName() + "/leaflet/Leaflet.PolylineMeasure.css";
      measureStyle.rel = "stylesheet";

      HTMLLinkElement drawStyle = (HTMLLinkElement) DomGlobal.document.createElement("link");
      drawStyle.href = GWT.getModuleName() + "/leaflet/leaflet.draw.css";
      drawStyle.rel = "stylesheet";

      irrimasterScript.onload = function;

      leafletScript.onload = e -> {
         DomGlobal.document.head.appendChild(transformScript);
         DomGlobal.document.head.appendChild(measureScript);
         return null;
      };
      transformScript.onload = e -> {
         DomGlobal.document.head.appendChild(drawScript);
         return null;
      };
      drawScript.onload = e -> {
         DomGlobal.document.head.appendChild(irrimasterScript);
         return null;
      };
      DomGlobal.document.head.appendChild(leafletScript);
      DomGlobal.document.head.appendChild(leafletStyle);
      DomGlobal.document.head.appendChild(measureStyle);
      DomGlobal.document.head.appendChild(drawStyle);
	}
}