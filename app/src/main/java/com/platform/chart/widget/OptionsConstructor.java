//
//  ChartModel.java
//  ChartCore-Slim
//
//  Created by AnAn on 2018/12/08.
//  Copyright Â© 2018å¹´ An An. All rights reserved.
//*************** ...... SOURCE CODE ...... ***************
//***...................................................***
//*** https://github.com/ChartModel/ChartCore         ***
//*** https://github.com/ChartModel/ChartCore-Slim    ***
//***...................................................***
//*************** ...... SOURCE CODE ...... ***************


/*

 * -------------------------------------------------------------------------------
 *
 *  ð ð ð ð  âââ   WARM TIPS!!!   âââ ð ð ð ð
 *
 * Please contact me on GitHub,if there are any problems encountered in use.
 * GitHub Issues : https://github.com/ChartModel/ChartCore-Slim/issues
 * -------------------------------------------------------------------------------
 * And if you want to contribute for this project, please contact me as well
 * GitHub        : https://github.com/ChartModel
 * StackOverflow : https://stackoverflow.com/users/7842508/codeforu
 * JianShu       : https://www.jianshu.com/u/f1e6753d4254
 * SegmentFault  : https://segmentfault.com/u/huanghunbieguan
 *
 * -------------------------------------------------------------------------------

 */


package com.platform.chart.widget;

import java.util.HashMap;

public class OptionsConstructor {
    public static HashMap<String, Object> configureChartOptions(ChartModel chartModel) {
        HashMap aaChart = new HashMap<String, Object>();
        aaChart.put("type", chartModel.chartType);//å¾è¡¨ç±»å
        aaChart.put("inverted", chartModel.inverted);//è®¾ç½®æ¯å¦åè½¬åæ è½´ï¼ä½¿Xè½´åç´ï¼Yè½´æ°´å¹³ã å¦æå¼ä¸º trueï¼å x è½´é»è®¤æ¯ åç½® çã å¦æå¾è¡¨ä¸­åºç°æ¡å½¢å¾ç³»åï¼åä¼èªå¨åè½¬
        aaChart.put("backgroundColor", chartModel.backgroundColor);//å¾è¡¨èæ¯è²
        aaChart.put("animation", true);//æ¯å¦å¼å¯å¾è¡¨æ¸²æå¨ç»
        aaChart.put("pinchType", chartModel.zoomType);//è®¾ç½®æå¿ç¼©æ¾æ¹å
        aaChart.put("panning", true);//è®¾ç½®æå¿ç¼©æ¾åæ¯å¦å¯å¹³ç§»
        aaChart.put("polar", chartModel.polar);//æ¯å¦æåå¾è¡¨(å¼å¯æåæ æ¨¡å¼)
        aaChart.put("marginLeft", chartModel.marginLeft);//å¾è¡¨å·¦è¾¹è·
        aaChart.put("marginRight", chartModel.marginRight);//å¾è¡¨å³è¾¹è·

        HashMap aaTitle = new HashMap<String, Object>();
        aaTitle.put("text", chartModel.title);//æ é¢ææ¬åå®¹
        HashMap aaTitleStyle = new HashMap<String, Object>();
        aaTitleStyle.put("color", chartModel.titleColor);//æ é¢æå­é¢è²
        aaTitleStyle.put("fontSize", "12px");//æ é¢æå­å¤§å°
        aaTitle.put("style", aaTitleStyle);

        HashMap aaSubtitle = new HashMap<String, Object>();
        aaSubtitle.put("text", chartModel.subtitle);//å¯æ é¢ææ¬åå®¹
        HashMap aaSubtitleStyle = new HashMap<String, Object>();
        aaSubtitleStyle.put("color", chartModel.subTitleColor);//å¯æ é¢æå­é¢è²
        aaSubtitleStyle.put("fontSize", "9px");//å¯æ é¢æå­å¤§å°
        aaSubtitle.put("style", aaSubtitleStyle);

        HashMap aaTooltip = new HashMap<String, Object>();
        aaTooltip.put("enabled", chartModel.tooltipEnabled);//æ¯å¦å¼å¯æµ®å¨æç¤ºæ¡ tooltip
        aaTooltip.put("valueSuffix", chartModel.tooltipValueSuffix);// æµ®å¨æç¤ºæ¡æ°å­çåä½åç¼
        aaTooltip.put("shared", true);//å¤ç» series æ°æ®æ¶,æ¯å¦å±äº«æµ®å¨æç¤ºæ¡,é»è®¤å±äº«
        aaTooltip.put("crosshairs", chartModel.tooltipCrosshairs);

        HashMap aaSeries = new HashMap<String, Object>();
        aaSeries.put("stacking", chartModel.stacking);//å¾è¡¨å å æ ·å¼ç±»å
        HashMap aaAnimation = new HashMap<String, Object>();
        aaAnimation.put("duration", chartModel.animationDuration);//å¾è¡¨æ¸²æçå¨ç»æ¶é´
        aaAnimation.put("easing", chartModel.animationType);//å¾è¡¨æ¸²æçå¨ç»ç±»å
        aaSeries.put("animation", aaAnimation);

        HashMap aaPlotOptions = new HashMap<String, Object>();
        aaPlotOptions.put("series", aaSeries);

        //æ°æ®ç¹æ è®°çç¸å³éç½®
        aaPlotOptions = configureAAPlotOptionsMarkerStyle(chartModel, aaSeries, aaPlotOptions);
        //éç½® aaPlotOptions ç dataLabels ç­ç¸å³åå®¹
        aaPlotOptions = configureAAPlotOptionsDataLabels(aaPlotOptions, chartModel);

        HashMap aaLegend = new HashMap<String, Object>();
        aaLegend.put("enabled", chartModel.legendEnabled);//æ¯å¦æ¾ç¤ºå¾è¡¨çå¾ä¾,é»è®¤æ¾ç¤º
        aaLegend.put("layout", chartModel.legendLayout); //å¾ä¾æ°æ®é¡¹çå¸å±ãå¸å±ç±»åï¼ "horizontal" æ "vertical" å³æ°´å¹³å¸å±ååç´å¸å± é»è®¤æ¯ï¼horizontal.
        aaLegend.put("align", chartModel.legendAlign);//è®¾å®å¾ä¾å¨å¾è¡¨åºä¸­çæ°´å¹³å¯¹é½æ¹å¼ï¼åæ³å¼æleftï¼center å rightã
        aaLegend.put("verticalAlign", chartModel.legendVerticalAlign);//è®¾å®å¾ä¾å¨å¾è¡¨åºä¸­çåç´å¯¹é½æ¹å¼ï¼åæ³å¼æ topï¼middle å bottomãåç´ä½ç½®å¯ä»¥éè¿ y éé¡¹åè¿ä¸æ­¥è®¾å®ã
        aaLegend.put("borderWidth", 0);
        HashMap aaLegendItemSyle = new HashMap<String, Object>();
        aaLegend.put("color", chartModel.axisColor);//å¾ä¾çæå­é¢è²,é»è®¤å¾ä¾çæå­é¢è²åXè½´æå­é¢è²ä¸æ ·
        aaLegend.put("itemStyle", aaLegendItemSyle);


        HashMap aaOptions = new HashMap<String, Object>();
        aaOptions.put("chart", aaChart);
        aaOptions.put("title", aaTitle);
        aaOptions.put("subtitle", aaSubtitle);
        aaOptions.put("tooltip", aaTooltip);
        aaOptions.put("legend", aaLegend);
        aaOptions.put("plotOptions", aaPlotOptions);
        aaOptions.put("colors", chartModel.colorsTheme);//å¾è¡¨çä¸»ä½é¢è²æ°ç»
        aaOptions.put("series", chartModel.series);//å¾è¡¨çæ°æ®åæ°ç»
        aaOptions.put("axisColor", chartModel.axisColor);//å¾è¡¨ç x è½´é¢è²

        configureAxisContentAndStyle(aaOptions, chartModel);

        return aaOptions;
    }

    private static HashMap<String, Object> configureAAPlotOptionsMarkerStyle(ChartModel chartModel,
                                                                             HashMap<String, Object> aaSeries,
                                                                             HashMap<String, Object> aaPlotOptions) {
        String chartType = chartModel.chartType;
        //æ°æ®ç¹æ è®°ç¸å³éç½®ï¼åªæçº¿æ§å¾(æçº¿å¾ãæ²çº¿å¾ãæçº¿åºåå¡«åå¾ãæ²çº¿åºåå¡«åå¾,æ£ç¹å¾)æææ°æ®ç¹æ è®°
        if (chartType == ChartModel.ChartType.Area
                || chartType == ChartModel.ChartType.AreaSpline
                || chartType == ChartModel.ChartType.Line
                || chartType == ChartModel.ChartType.Spline
                || chartType == ChartModel.ChartType.Scatter) {
            HashMap aaMarker = new HashMap<String, Object>();
            aaMarker.put("radius", chartModel.markerRadius);//æ²çº¿è¿æ¥ç¹åå¾ï¼é»è®¤æ¯4
            aaMarker.put("symbol", chartModel.symbol);//æ²çº¿è¿æ¥ç¹ç±»åï¼"circle", "square", "diamond", "triangle","triangle-down"ï¼é»è®¤æ¯"circle"
            //è®¾ç½®æ²çº¿è¿æ¥ç¹é£æ ¼æ ·å¼
            if (chartModel.symbolStyle == ChartModel.ChartSymbolStyleType.InnerBlank) {
                aaMarker.put("fillColor", "#FFFFFF");//ç¹çå¡«åè²(ç¨æ¥è®¾ç½®æçº¿è¿æ¥ç¹çå¡«åè²)
                aaMarker.put("lineWidth", 2);//å¤æ²¿çº¿çå®½åº¦(ç¨æ¥è®¾ç½®æçº¿è¿æ¥ç¹çè½®å»æè¾¹çå®½åº¦)
                aaMarker.put("lineColor", "");//å¤æ²¿çº¿çé¢è²(ç¨æ¥è®¾ç½®æçº¿è¿æ¥ç¹çè½®å»æè¾¹é¢è²ï¼å½å¼ä¸ºç©ºå­ç¬¦ä¸²æ¶ï¼é»è®¤åæ°æ®ç¹ææ°æ®åçé¢è²ã)
            } else if (chartModel.symbolStyle == ChartModel.ChartSymbolStyleType.BorderBlank) {
                aaMarker.put("lineWidth", 2);//å¤æ²¿çº¿çå®½åº¦(ç¨æ¥è®¾ç½®æçº¿è¿æ¥ç¹çè½®å»æè¾¹çå®½åº¦)
                aaMarker.put("lineColor", chartModel.backgroundColor);//å¤æ²¿çº¿çé¢è²(ç¨æ¥è®¾ç½®æçº¿è¿æ¥ç¹çè½®å»æè¾¹é¢è²ï¼å½å¼ä¸ºç©ºå­ç¬¦ä¸²æ¶ï¼é»è®¤åæ°æ®ç¹ææ°æ®åçé¢è²ã)
            }
            aaSeries.put("marker", aaMarker);
            aaPlotOptions.put("series", aaSeries);
        }
        return aaPlotOptions;
    }


    private static HashMap<String, Object> configureAAPlotOptionsDataLabels(HashMap<String, Object> aaPlotOptions,
                                                                            ChartModel chartModel) {

        String chartType = chartModel.chartType;
        HashMap aaDataLabels = new HashMap<String, Object>();
        aaDataLabels.put("enabled", chartModel.xAxisLabelsEnabled);
        HashMap aaSomeTypeChart = new HashMap<String, Object>();

        if (chartType == ChartModel.ChartType.Column
                || chartType == ChartModel.ChartType.Bar) {
            aaSomeTypeChart.put("borderWidth", 0);
            aaSomeTypeChart.put("borderRadius", chartModel.borderRadius);
            aaSomeTypeChart.put("dataLabels", aaDataLabels);
            if (chartModel.polar == true) {
                aaSomeTypeChart.put("pointPadding", 0);
                aaSomeTypeChart.put("groupPadding", 0.005);
            }
        } else if (chartType == ChartModel.ChartType.Pie) {
            aaSomeTypeChart.put("allowPointSelect", true);
            aaSomeTypeChart.put("cursor", "pointer");
            aaSomeTypeChart.put("showInLegend", chartModel.legendEnabled);
            aaDataLabels.put("format", "{point.name}");
            aaSomeTypeChart.put("dataLabels", aaDataLabels);
        } else {
            aaSomeTypeChart.put("dataLabels", aaDataLabels);
        }
        aaPlotOptions.put(chartType, aaSomeTypeChart);

        return aaPlotOptions;
    }

    private static void configureAxisContentAndStyle(HashMap<String, Object> aaOptions,
                                                     ChartModel chartModel) {

        if (chartModel.chartType != ChartModel.ChartType.Pie
                && chartModel.chartType != ChartModel.ChartType.Pyramid
                && chartModel.chartType != ChartModel.ChartType.Funnel) {
            HashMap aaAxisLabel = new HashMap<String, Object>();
            aaAxisLabel.put("enabled", chartModel.xAxisLabelsEnabled);

            HashMap aaXAxis = new HashMap<String, Object>();
            aaXAxis.put("label", aaAxisLabel);
            aaXAxis.put("reversed", chartModel.xAxisReversed);
            aaXAxis.put("gridLineWidth", chartModel.xAxisGridLineWidth);
            aaXAxis.put("categories", chartModel.categories);
            aaXAxis.put("visible", chartModel.xAxisVisible);

            HashMap aaYAxis = new HashMap<String, Object>();
            aaYAxis.put("label", aaAxisLabel);
            aaYAxis.put("reversed", chartModel.yAxisReversed);
            aaYAxis.put("gridLineWidth", chartModel.yAxisGridLineWidth);
            aaYAxis.put("title", chartModel.yAxisTitle);
            aaYAxis.put("lineWidth", chartModel.yAxisLineWidth);
            aaYAxis.put("visible", chartModel.yAxisVisible);

            aaOptions.put("xAxis", aaXAxis);
            aaOptions.put("yAxis", aaYAxis);
        }
    }
}
