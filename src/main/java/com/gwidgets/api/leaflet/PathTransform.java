package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.options.PathTransformOptions;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class PathTransform
{
   @JsMethod
   public native L enable(PathTransformOptions options);

   @JsMethod
   public native void scale(Point scale, LatLng origin);

   @JsMethod
   public native void rotate(Double angle, LatLng origin);

   @JsMethod
   public native PathTransform transform(Double angle, Point scale, LatLng rotationOrigin, LatLng scaleOrigin);

   @JsMethod
   public native void reset();
}
