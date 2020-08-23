/**
 * create a Draw.Polygon object
 */
L.startPolygon = function (map, options, onCreated, onCancel) {
	var poly = new L.Draw.Polygon (map, options);
	var func = function(event) {
		map.off(L.Draw.Event.CREATED, func);
		map.off("draw:canceled", func2);
		onCreated(event.layer._latlngs[0]);
	};
	var func2 = function(event) {
		map.off(L.Draw.Event.CREATED, func);
		map.off("draw:canceled", func2);
		onCancel(null);
	};
	map.on(L.Draw.Event.CREATED, func);
	map.on("draw:canceled", func2);

	poly.enable();
    return poly;
};

L.startMarker = function (map, options, onCreated, onCancel) {
	var marker = new L.Draw.Marker (map, options);
	var func = function(event) {
		map.off(L.Draw.Event.CREATED, func);
		map.off("draw:canceled", func2);
		onCreated(event.layer);
	};
	var func2 = function(event) {
		map.off(L.Draw.Event.CREATED, func);
		map.off("draw:canceled", func2);
		onCancel(null);
	};
	map.on(L.Draw.Event.CREATED, func);
	map.on("draw:canceled", func2);

	marker.enable();
    return marker;
};

L.editPolygon = function (polygon) {
	var poly = new L.Edit.Poly (polygon);
	poly.enable();
    return poly;
};

L.calculateGeodesicArea = function(layer) {
	var area = L.GeometryUtil.geodesicArea(layer.getLatLngs()[0]);
	return area;
}
