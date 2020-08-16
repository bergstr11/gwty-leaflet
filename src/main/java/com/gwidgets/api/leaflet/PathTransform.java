package com.gwidgets.api.leaflet;

import com.gwidgets.api.leaflet.options.PathTransformOptions;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class PathTransform
{
   @JsMethod
   public native L enable(PathTransformOptions options);
}
