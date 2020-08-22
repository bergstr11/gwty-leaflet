/**
 * create a Draw.Polygon object
 */
L.startPolygon = function (map, options, onCreated, onCancel) {
	var poly = new L.Draw.Polygon (map, options);
	var func = function(event) {
		map.off(L.Draw.Event.CREATED, func);
		onCreated(event.layer._latlngs[0]);
	};
	map.on(L.Draw.Event.CREATED, func);
	
	var func2 = function(event) {
		map.off("draw:canceled", func2);
		onCancel(null);
	};
	map.on("draw:canceled", func2);
	poly.enable();
    return poly;
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

/**
 * @extends {L.ShapeMarker}
 */
L.IrrimasterRotateHandle = L.ShapeMarker.extend({
  options: {
    className: 'leaflet-path-transform-handler transform-handler--rotate leaflet-interactive',
  },

  onAdd: function (map) {
    L.ShapeMarker.prototype.onAdd.call(this, map);
    if (this._path && this.options.setCursor) { // SVG/VML
      this._path.style.cursor = 'all-scroll';
    }
  }
});
