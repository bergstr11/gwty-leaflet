package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * <pre>
      showArea: false,
      showLength: false,
      shapeOptions: {
         stroke: true,
         color: '#3388ff',
         weight: 4,
         opacity: 0.5,
         fill: true,
         fillColor: null, //same as color by default
         fillOpacity: 0.2,
         clickable: true
      },
      // Whether to use the metric measurement system (truthy) or not (falsy).
      // Also defines the units to use for the metric system as an array of
      // strings (e.g. `['ha', 'm']`).
      metric: true,
      feet: true, // When not metric, to use feet instead of yards for display.
      nautic: false, // When not metric, not feet use nautic mile for display
      // Defines the precision for each type of unit (e.g. {km: 2, ft: 0}
      precision: {}
 * </pre>
 * 
 * @author byter
 */
@JsType(isNative = true, namespace = GLOBAL, name = "Object")
public class DrawPolygonOptions
{
   @JsType(isNative = true, namespace = GLOBAL, name = "Object")
   public static class ShapeOptions
   {
      @JsProperty
      boolean stroke; // = true
      @JsProperty
      String color; // = "#3388ff"
      @JsProperty
      double weight; // = 4
      @JsProperty
      double opacity; // = 0.5;
      @JsProperty
      boolean fill; // = true;
      @JsProperty
      String fillColor; // same as color by default
      @JsProperty
      double fillOpacity; // = 0.2;
      @JsProperty
      boolean clickable; // = true;
   }

   @JsProperty
   ShapeOptions shapeOptions;

   @JsProperty
   boolean showArea;

   @JsProperty
   boolean showLength;

   @JsProperty
   boolean metric;

   @JsProperty
   boolean feet;

   @JsProperty
   boolean nautic;

   public static class Builder
   {
      Boolean showArea;
      Boolean showLength;
      Boolean metric;
      Boolean feet;
      Boolean nautic;

      ShapeOptionsBuilder shapeOptions;

      public class ShapeOptionsBuilder
      {
         Boolean stroke;
         String color;
         Double weight;
         Double opacity;
         Boolean fill;
         String fillColor;
         Double fillOpacity;
         Boolean clickable;

         public DrawPolygonOptions build()
         {
            return Builder.this.build();
         }

         public ShapeOptionsBuilder stroke(Boolean value)
         {
            stroke = value;
            return this;
         }

         public ShapeOptionsBuilder color(String value)
         {
            this.color = value;
            return this;
         }

         public ShapeOptionsBuilder weight(Double value)
         {
            weight = value;
            return this;
         }

         public ShapeOptionsBuilder opacity(Double value)
         {
            opacity = value;
            return this;
         }

         public ShapeOptionsBuilder fill(Boolean value)
         {
            fill = value;
            return this;
         }

         public ShapeOptionsBuilder fillColor(String value)
         {
            fillColor = value;
            return this;
         }

         public ShapeOptionsBuilder fillOpacity(Double value)
         {
            fillOpacity = value;
            return this;
         }

         public ShapeOptionsBuilder clickable(Boolean value)
         {
            clickable = value;
            return this;
         }

         protected void setup(DrawPolygonOptions options)
         {
            if (options.shapeOptions == null)
               options.shapeOptions = new ShapeOptions();
            if (stroke != null)
               options.shapeOptions.stroke = stroke;
            if (color != null)
               options.shapeOptions.color = color;
            if (weight != null)
               options.shapeOptions.weight = weight;
            if (opacity != null)
               options.shapeOptions.opacity = opacity;
            if (fill != null)
               options.shapeOptions.fill = fill;
            if (fillColor != null)
               options.shapeOptions.fillColor = fillColor;
            if (fillOpacity != null)
               options.shapeOptions.fillOpacity = fillOpacity;
            if (clickable != null)
               options.shapeOptions.clickable = clickable;
         }
      }

      public Builder showArea(Boolean value)
      {
         showArea = value;
         return this;
      }

      public Builder showLength(Boolean value)
      {
         showLength = value;
         return this;
      }

      public Builder metric(Boolean value)
      {
         metric = value;
         return this;
      }

      public Builder feet(Boolean value)
      {
         feet = value;
         return this;
      }

      public Builder nautic(Boolean value)
      {
         nautic = value;
         return this;
      }

      public ShapeOptionsBuilder shapeOptions()
      {
         this.shapeOptions = new ShapeOptionsBuilder();
         return shapeOptions;
      }

      public DrawPolygonOptions build()
      {
         DrawPolygonOptions options = new DrawPolygonOptions();
         if (showArea != null)
            options.showArea = showArea;
         if (showLength != null)
            options.showLength = showLength;
         if (metric != null)
            options.metric = metric;
         if (feet != null)
            options.feet = feet;
         if (nautic != null)
            options.nautic = nautic;
         if (shapeOptions != null)
            shapeOptions.setup(options);
         return options;
      }
   }
}
