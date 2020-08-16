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
 * PolylineMeasure Options.
 * 
 * @author Christian Sell
 */
@JsType(isNative=true, namespace=GLOBAL, name="Object")
public class PolylineMeasureOptions {

	private PolylineMeasureOptions() {
		
	}

   @JsProperty
   String position;
   @JsProperty
   String unit;
   @JsProperty
   boolean clearMeasurementsOnStop;
   @JsProperty
   boolean showBearings;
   @JsProperty
   String bearingTextIn;
   @JsProperty
   String bearingTextOut;
   @JsProperty
   String tooltipTextFinish;
   @JsProperty
   String tooltipTextDelete;
   @JsProperty
   String tooltipTextMove;
   @JsProperty
   String tooltipTextResume;
   @JsProperty
   String tooltipTextAdd;

   // language dependend labels for point's tooltips
   @JsProperty
   String measureControlTitleOn;
   @JsProperty
   String measureControlTitleOff;
   @JsProperty
   String measureControlLabel;
   @JsProperty
   String[] measureControlClasses;
   @JsProperty
   boolean showClearControl;
   @JsProperty
   String clearControlTitle;
   @JsProperty
   String clearControlLabel;
   @JsProperty
   String[] clearControlClasses;
   @JsProperty
   boolean showUnitControl;
   @JsProperty
   boolean distanceShowSameUnit;

   @JsOverlay
   public final String getPosition()
   {
      return position;
   }

   @JsOverlay
   public final String getUnit()
   {
      return unit;
   }

   @JsOverlay
   public final boolean isClearMeasurementsOnStop()
   {
      return clearMeasurementsOnStop;
   }

   @JsOverlay
   public final boolean isShowBearings()
   {
      return showBearings;
   }

   @JsOverlay
   public final String getBearingTextIn()
   {
      return bearingTextIn;
   }

   @JsOverlay
   public final String getBearingTextOut()
   {
      return bearingTextOut;
   }

   @JsOverlay
   public final String getTooltipTextFinish()
   {
      return tooltipTextFinish;
   }

   @JsOverlay
   public final String getTooltipTextDelete()
   {
      return tooltipTextDelete;
   }

   @JsOverlay
   public final String getTooltipTextMove()
   {
      return tooltipTextMove;
   }

   @JsOverlay
   public final String getTooltipTextResume()
   {
      return tooltipTextResume;
   }

   @JsOverlay
   public final String getTooltipTextAdd()
   {
      return tooltipTextAdd;
   }

   @JsOverlay
   public final String getMeasureControlTitleOn()
   {
      return measureControlTitleOn;
   }

   @JsOverlay
   public final String getMeasureControlTitleOff()
   {
      return measureControlTitleOff;
   }

   @JsOverlay
   public final String getMeasureControlLabel()
   {
      return measureControlLabel;
   }

   @JsOverlay
   public final String[] getMeasureControlClasses()
   {
      return measureControlClasses;
   }

   @JsOverlay
   public final boolean isShowClearControl()
   {
      return showClearControl;
   }

   @JsOverlay
   public final String getClearControlTitle()
   {
      return clearControlTitle;
   }

   @JsOverlay
   public final String getClearControlLabel()
   {
      return clearControlLabel;
   }

   @JsOverlay
   public final String[] getClearControlClasses()
   {
      return clearControlClasses;
   }

   @JsOverlay
   public final boolean isShowUnitControl()
   {
      return showUnitControl;
   }

   @JsOverlay
   public final boolean isDistanceShowSameUnit()
   {
      return distanceShowSameUnit;
   }


   public static class Builder
   {
      String position;
      String unit;
      Boolean clearMeasurementsOnStop;
      Boolean showBearings;
      String bearingTextIn;
      String bearingTextOut;
      String tooltipTextFinish;
      String tooltipTextDelete;
      String tooltipTextMove;
      String tooltipTextResume;
      String tooltipTextAdd;
      String measureControlTitleOn;
      String measureControlTitleOff;
      String measureControlLabel;
      String[] measureControlClasses;
      Boolean showClearControl;
      String clearControlTitle;
      String clearControlLabel;
      String[] clearControlClasses;
      Boolean showUnitControl;
      Boolean distanceShowSameUnit;

		public Builder() {
		}
		
      public Builder position(String position)
      {
         this.position = position;
         return this;
      }

      public Builder unit(String unit)
      {
         this.unit = unit;
         return this;
      }

      public Builder bearingTextIn(String bearingTextIn)
      {
         this.bearingTextIn = bearingTextIn;
         return this;
      }

      public Builder bearingTextOut(String bearingTextOut)
      {
         this.bearingTextOut = bearingTextOut;
         return this;
      }

      public Builder tooltipTextFinish(String tooltipTextFinish)
      {
         this.tooltipTextFinish = tooltipTextFinish;
         return this;
      }

      public Builder tooltipTextDelete(String tooltipTextDelete)
      {
         this.tooltipTextDelete = tooltipTextDelete;
         return this;
      }

      public Builder tooltipTextMove(String tooltipTextMove)
      {
         this.tooltipTextMove = tooltipTextMove;
         return this;
      }

      public Builder tooltipTextResume(String tooltipTextResume)
      {
         this.tooltipTextResume = tooltipTextResume;
         return this;
      }

      public Builder tooltipTextAdd(String tooltipTextAdd)
      {
         this.tooltipTextAdd = tooltipTextAdd;
         return this;
      }

      public Builder measureControlTitleOn(String measureControlTitleOn)
      {
         this.measureControlTitleOn = measureControlTitleOn;
         return this;
      }

      public Builder measureControlTitleOff(String measureControlTitleOff)
      {
         this.measureControlTitleOff = measureControlTitleOff;
         return this;
      }

      public Builder measureControlLabel(String measureControlLabel)
      {
         this.measureControlLabel = measureControlLabel;
         return this;
      }

      public Builder clearControlTitle(String clearControlTitle)
      {
         this.clearControlTitle = clearControlTitle;
         return this;
      }

      public Builder clearMeasurementsOnStop(Boolean clearMeasurementsOnStop)
      {
         this.clearMeasurementsOnStop = clearMeasurementsOnStop;
         return this;
      }

      public Builder showBearings(Boolean showBearings)
      {
         this.showBearings = showBearings;
         return this;
      }

      public Builder showClearControl(Boolean showClearControl)
      {
         this.showClearControl = showClearControl;
         return this;
      }

      public Builder showUnitControl(Boolean showUnitControl)
      {
         this.showUnitControl = showUnitControl;
         return this;
      }

      public Builder distanceShowSameUnit(Boolean distanceShowSameUnit)
      {
         this.distanceShowSameUnit = distanceShowSameUnit;
         return this;
      }

      public Builder measureControlClasses(String... measureControlClasses)
      {
         this.measureControlClasses = measureControlClasses;
         return this;
      }

      public Builder clearControlClasses(String... clearControlClasses)
      {
         this.clearControlClasses = clearControlClasses;
         return this;
      }

      public Builder clearControlLabel(String clearControlLabel)
      {
         this.clearControlLabel = clearControlLabel;
         return this;
      }

		public PolylineMeasureOptions build(){
         PolylineMeasureOptions options = new PolylineMeasureOptions();
         if (this.position != null)
            options.position = this.position;
         if (this.unit != null)
            options.unit = this.unit;
         if (this.bearingTextIn != null)
            options.bearingTextIn = this.bearingTextIn;
         if (this.bearingTextOut != null)
            options.bearingTextOut = this.bearingTextOut;
         if (this.tooltipTextFinish != null)
            options.tooltipTextFinish = this.tooltipTextFinish;
         if (this.tooltipTextDelete != null)
            options.tooltipTextDelete = this.tooltipTextDelete;
         if (this.tooltipTextMove != null)
            options.tooltipTextMove = this.tooltipTextMove;
         if (this.tooltipTextResume != null)
            options.tooltipTextResume = this.tooltipTextResume;
         if (this.tooltipTextAdd != null)
            options.tooltipTextAdd = this.tooltipTextAdd;
         if (this.measureControlTitleOn != null)
            options.measureControlTitleOn = this.measureControlTitleOn;
         if (this.measureControlTitleOff != null)
            options.measureControlTitleOff = this.measureControlTitleOff;
         if (this.measureControlLabel != null)
            options.measureControlLabel = this.measureControlLabel;
         if (this.clearControlTitle != null)
            options.clearControlTitle = this.clearControlTitle;
         if (this.clearControlLabel != null)
            options.clearControlLabel = this.clearControlLabel;
         if (this.clearMeasurementsOnStop != null)
            options.clearMeasurementsOnStop = this.clearMeasurementsOnStop.booleanValue();
         if (this.showBearings != null)
            options.showBearings = this.showBearings.booleanValue();
         if (this.showUnitControl != null)
            options.showUnitControl = this.showUnitControl.booleanValue();
         if (this.distanceShowSameUnit != null)
            options.distanceShowSameUnit = this.distanceShowSameUnit.booleanValue();
         if (this.measureControlClasses != null)
            options.measureControlClasses = this.measureControlClasses;
         if (this.clearControlClasses != null)
            options.clearControlClasses = this.clearControlClasses;
         if (this.showClearControl != null)
            options.showClearControl = this.showClearControl.booleanValue();
			
			return options;
		}
	}
}