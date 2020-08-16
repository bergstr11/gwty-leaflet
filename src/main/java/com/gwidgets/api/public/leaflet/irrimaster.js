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
