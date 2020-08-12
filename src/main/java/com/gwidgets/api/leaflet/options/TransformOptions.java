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
public class TransformOptions {

	private TransformOptions() {
		
	}

   @JsProperty
   boolean rotation;

   @JsProperty
   boolean scaling;

   @JsProperty
   boolean uniformScaling;

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
		 
      public Builder uniformScaling(Boolean uniformScaling)
      {
         this.uniformScaling = uniformScaling;
         return this;
      }
		
		public TransformOptions build(){
			TransformOptions options = new TransformOptions();
         if (this.rotation != null)
            options.rotation = this.rotation.booleanValue();
         if (this.scaling != null)
            options.scaling = this.scaling.booleanValue();
         if (this.uniformScaling != null)
            options.uniformScaling = this.uniformScaling.booleanValue();
			
			return options;
		}
	}
}