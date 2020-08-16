/**
 *  Copyright 2016 G-Widgets
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.gwidgets.api.leaflet.options;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * PathTransform Options.
 * 
 * @author Christian Sell
 */
@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class PathTransformOptions {

	private PathTransformOptions() {
		
	}

   /** Enable/disable rotation. Default true */
   @JsProperty
   boolean rotation;

   /** Enable/disable scaling. Default true */
   @JsProperty
   boolean scaling;

   /** Use uniform scaling (maintain aspect ratio). Default true */
   @JsProperty
   boolean uniformScaling;

   /** Length of the rotation handle in pixels. Defaults to 20. */
   @JsProperty
   int handleLength;

   /** edge markers options */
   @JsProperty
   PathOptions handlerOptions;

   /** bounding rectangle options */
   @JsProperty
   PolylineOptions boundsOptions;

   /** rotation handle line styles */
   @JsProperty
   PolylineOptions rotateHandleOptions;

   /** class implementing the Marker Handle */
   @JsProperty
   String rotateHandleClass;

   @JsOverlay
   public final boolean getRotation()
   {
      return this.rotation;
	}

   @JsOverlay
   public final boolean getScaling()
   {
      return this.scaling;
	}

   @JsOverlay
   public final boolean getUniformScaling()
   {
      return this.uniformScaling;
	}

	public static class Builder {
      private Boolean rotation;

      private Boolean scaling;

      private Boolean uniformScaling;

      private Integer handleLength;

      PathOptions.Builder handlerOptions;

      PolylineOptions.Builder boundsOptions;

      PolylineOptions.Builder rotateHandleOptions;

      String rotateHandleClass;

		public Builder() {
		}
		
      public Builder rotation(Boolean rotation)
      {
         this.rotation = rotation;
         return this;
      }
		 
      public Builder scaling(Boolean scaling)
      {
         this.scaling = scaling;
         return this;
      }
		 
      public Builder handleLength(Integer handleLength)
      {
         this.handleLength = handleLength;
         return this;
      }

      public Builder uniformScaling(Boolean uniformScaling)
      {
         this.uniformScaling = uniformScaling;
         return this;
      }

      public Builder rotateHandleClass(String rotateHandleClass)
      {
         this.rotateHandleClass = rotateHandleClass;
         return this;
      }

      public PathOptions.Builder handlerOptions()
      {
         handlerOptions = new PathOptions.Builder();
         return handlerOptions;
      }

      public PolylineOptions.Builder boundsOptions()
      {
         boundsOptions = new PolylineOptions.Builder();
         return boundsOptions;
      }

      public PolylineOptions.Builder rotateHandleOptions()
      {
         rotateHandleOptions = new PolylineOptions.Builder();
         return rotateHandleOptions;
      }

		public PathTransformOptions build(){
			PathTransformOptions options = new PathTransformOptions();
         if (this.rotation != null)
            options.rotation = this.rotation.booleanValue();
         if (this.scaling != null)
            options.scaling = this.scaling.booleanValue();
         if (this.uniformScaling != null)
            options.uniformScaling = this.uniformScaling.booleanValue();
         if (this.handleLength != null)
            options.handleLength = this.handleLength.intValue();
         if (this.handlerOptions != null)
            options.handlerOptions = this.handlerOptions.build();
         if (this.boundsOptions != null)
            options.boundsOptions = this.boundsOptions.build();
         if (this.rotateHandleOptions != null)
            options.rotateHandleOptions = this.rotateHandleOptions.build();
         if (rotateHandleClass != null)
            options.rotateHandleClass = this.rotateHandleClass;
			
			return options;
		}
	}
}