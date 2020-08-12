package com.gwidgets.leaflet.test;

import java.util.ArrayList;
import java.util.List;

import com.gwidgets.api.leaflet.Circle;
import com.gwidgets.api.leaflet.L;
import com.gwidgets.api.leaflet.LatLng;
import com.gwidgets.api.leaflet.Polygon;
import com.gwidgets.api.leaflet.Polyline;
import com.gwidgets.api.leaflet.Rectangle;
import com.gwidgets.api.leaflet.options.CircleOptions;

public class PathTest extends GwtyLeafletTestCase {
	

	public void testPolyline(){
		InjectedLeafletResources.whenReady((e) -> {
				 
					List<LatLng> coordinates = new ArrayList<LatLng>();

					coordinates.add(L.latLng(52.51, 13.37));
					coordinates.add(L.latLng(52.5095, 13.34));


					LatLng[] coordinatesArray = (LatLng[]) coordinates.toArray();
					LatLng[][] polylineCoordinates = {coordinatesArray};
					Polyline pol = L.polyline(polylineCoordinates, null);
					
					
         assertEquals((pol.getLatLngs())[0].lat, 52.51);
         assertEquals((pol.getLatLngs())[0].lng, 13.37);
		
					
					return null;
		});
	}
	
	public void testRectangle(){
		InjectedLeafletResources.whenReady((e) -> {
					Rectangle rect = L.rectangle(L.latLngBounds(L.latLng(52.5139, 13.34), L.latLng(54.51, -3.045)), null);
					
         assertEquals((rect.getLatLngs())[0].lat, 52.5139);
         assertEquals((rect.getLatLngs())[1].lng, -3.045);
						
					return null;
		});
	}
	
	
	public void testCircle(){
		InjectedLeafletResources.whenReady((e) -> {
			
				CircleOptions circleOptions = new CircleOptions.Builder()
	                    .fillColor("#b35d20")
	                    .color("#f54e02")
	                    .radius(500.0)
	                     .build();
				
				Circle circ = L.circle(L.latLng(52.51, 13.37), circleOptions);
				
				
				assertEquals(String.valueOf(circ.getRadius()), "500");
				assertEquals(circ.getLatLng().lat, 52.51);
				assertEquals(circ.getLatLng().lng, 13.37);
				
					
					return null;
		});
	}
	
	
	public void testPolygon(){
		InjectedLeafletResources.whenReady((e) -> {
				
					List<LatLng> coordinates = new ArrayList<LatLng>();

					coordinates.add(L.latLng(52.51, 13.37));
					coordinates.add(L.latLng(52.5095, 13.34));

					LatLng[] coordinatesArray = (LatLng[]) coordinates.toArray();
         Polygon polg = L.polygon(coordinatesArray, null);
					
										
         assertEquals((polg.getLatLngs())[0].lat, 52.51);
         assertEquals((polg.getLatLngs())[0].lng, 13.37);
					
         assertEquals((polg.getLatLngs())[1].lat, 52.5095);
         assertEquals((polg.getLatLngs())[1].lng, 13.34);
					
					
					return null;
		});
	}

}
