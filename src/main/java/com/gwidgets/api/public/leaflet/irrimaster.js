/**
 * create a Draw.Polygon object
 */
L.startPolygon = function (map, options, onCreated, onCancel) {
	var poly = new L.Draw.Polygon (map, options);
	map.on(L.Draw.Event.CREATED, function(event) {
		onCreated(event.layer._latlngs);
	});
	map.on("draw:canceled", function(event) {
		onCancel(null);
	});
	poly.enable();
    return poly;
};

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
