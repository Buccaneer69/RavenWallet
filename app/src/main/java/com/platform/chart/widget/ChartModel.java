//
//  ChartModel.java
//  ChartCore-Slim
//
//  Created by AnAn on 2017/9/5.
//  Copyright ยฉ 2018ๅนด An An. All rights reserved.
//*************** ...... SOURCE CODE ...... ***************
//***...................................................***
//*** https://github.com/ChartModel/ChartCore         ***
//*** https://github.com/ChartModel/ChartCore-Slim    ***
//***...................................................***
//*************** ...... SOURCE CODE ...... ***************


/*

 * -------------------------------------------------------------------------------
 *
 *  ๐ ๐ ๐ ๐  โโโ   WARM TIPS!!!   โโโ ๐ ๐ ๐ ๐
 *
 * Please contact me on GitHub,if there are any problems encountered in use.
 * GitHub Issues : https://github.com/ChartModel/ChartCore-Slim/issues
 * -------------------------------------------------------------------------------
 * And if you want to contribute for this project, please contact me as well
 * GitHub        : https://github.com/ChartModel
 * StackOverflow : https://stackoverflow.com/users/7842508/codeforu
 * JianShu       : http://www.jianshu.com/u/f1e6753d4254
 * SegmentFault  : https://segmentfault.com/u/huanghunbieguan
 *
 * -------------------------------------------------------------------------------

 */

package com.platform.chart.widget;

/**
 * Created by AnAn on 2017/9/5.
 */

public class ChartModel {

    public interface ChartAnimationType {
        String EaseInQuad = "easeInQuad";
        String EaseOutQuad = "easeOutQuad";
        String EaseInOutQuad = "easeInOutQuad";
        String EaseInCubic = "easeInCubic";
        String EaseOutCubic = "easeOutCubic";
        String EaseInOutCubic = "easeInOutCubic";
        String EaseInQuart = "easeInQuart";
        String EaseOutQuart = "easeOutQuart";
        String EaseInOutQuart = "easeInOutQuart";
        String EaseInQuint = "easeInQuint";
        String EaseOutQuint = "easeOutQuint";
        String EaseInOutQuint = "easeInOutQuint";
        String EaseInSine = "easeInSine";
        String EaseOutSine = "easeOutSine";
        String EaseInOutSine = "easeInOutSine";
        String EaseInExpo = "easeInExpo";
        String EaseOutExpo = "easeOutExpo";
        String EaseInOutExpo = "easeInOutExpo";
        String EaseInCirc = "easeInCirc";
        String EaseOutCirc = "easeOutCirc";
        String EaseInOutCirc = "easeInOutCirc";
        String EaseOutBounce = "easeOutBounce";
        String EaseInBack = "easeInBack";
        String EaseOutBack = "easeOutBack";
        String EaseInOutBack = "easeInOutBack";
        String Elastic = "elastic";
        String SwingFromTo = "swingFromTo";
        String SwingFrom = "swingFrom";
        String SwingTo = "swingTo";
        String Bounce = "bounce";
        String BouncePast = "bouncePast";
        String EaseFromTo = "easeFromTo";
        String EaseFrom = "easeFrom";
        String EaseTo = "easeTo";
    }

    public interface ChartType {
        String Column = "column";
        String Bar = "bar";
        String Area = "area";
        String AreaSpline = "areaspline";
        String Line = "line";
        String Spline = "spline";
        String Scatter = "scatter";
        String Pie = "pie";
        String Bubble = "bubble";
        String Pyramid = "pyramid";
        String Funnel = "funnel";
        String Columnrange = "columnrange";
        String Arearange = "arearange";
        String Areasplinerange = "areasplinerange";
        String Boxplot = "boxplot";
        String Waterfall = "waterfall";
    }

    public interface ChartSubtitleAlignType {
        String Left = "left";
        String Center = "center";
        String Right = "right";
    }

    public interface ChartZoomType {
        String X = "x";
        String Y = "y";
        String XY = "xy";
    }

    public interface ChartStackingType {
        String False = "";
        String Normal = "normal";
        String Percent = "percent";
    }

    public interface ChartSymbolType {
        String Circle = "circle";
        String Square = "square";
        String Diamond = "diamond";
        String Triangle = "triangle";
        String Triangle_down = "triangle-down";
    }

    public interface ChartSymbolStyleType {
        String Normal = "normal";
        String InnerBlank = "innerBlank";
        String BorderBlank = "borderBlank";
    }

    public interface chartLegendlLayoutType {
        String Horizontal = "horizontal";
        String Vertical = "vertical";
    }

    public interface ChartLegendAlignType {
        String Left = "left";
        String Center = "center";
        String Right = "right";
    }

    public interface ChartLegendVerticalAlignType {
        String Top = "top";
        String Middle = "middle";
        String Bottom = "bottom";
    }

    public interface LineDashSyleType {
        String Solid = "Solid";
        String ShortDash = "ShortDash";
        String ShortDot = "ShortDot";
        String ShortDashDot = "ShortDashDot";
        String ShortDashDotDot = "ShortDashDotDot";
        String Dot = "Dot";
        String Dash = "Dash";
        String LongDash = "LongDash";
        String DashDot = "DashDot";
        String LongDashDot = "LongDashDot";
        String LongDashDotDot = "LongDashDotDot";
    }


    public String animationType;         //ๅจ็ป็ฑปๅ
    public Integer animationDuration;     //ๅจ็ปๆถ้ด
    public String title;                 //ๆ?้ขๅๅฎน
    public String subtitle;              //ๅฏๆ?้ขๅๅฎน
    public String chartType;             //ๅพ่กจ็ฑปๅ
    public String stacking;              //ๅ?็งฏๆ?ทๅผ
    public String symbol;                //ๆ็บฟๆฒ็บฟ่ฟๆฅ็น็็ฑปๅ๏ผ"circle", "square", "diamond", "triangle","triangle-down"๏ผ้ป่ฎคๆฏ"circle"
    public String symbolStyle;
    public String zoomType;              //็ผฉๆพ็ฑปๅ AAChartZoomTypeX่กจ็คบๅฏๆฒฟ็ x ่ฝด่ฟ่กๆๅฟ็ผฉๆพ
    public Boolean pointHollow;           //ๆ็บฟๆ่ๆฒ็บฟ็่ฟๆฅ็นๆฏๅฆไธบ็ฉบๅฟ็
    public Boolean inverted;              //x ่ฝดๆฏๅฆ็ฟป่ฝฌ(ๅ็ด)
    public Boolean xAxisReversed;         //x ่ฝด็ฟป่ฝฌ
    public Boolean yAxisReversed;         //y ่ฝด็ฟป่ฝฌ
    public Boolean tooltipEnabled;      //ๆฏๅฆๆพ็คบๆตฎๅจๆ็คบๆก(้ป่ฎคๆพ็คบ)
    public String tooltipValueSuffix;  //ๆตฎๅจๆ็คบๆกๅไฝๅ็ผ
    public Boolean tooltipCrosshairs;     //ๆฏๅฆๆพ็คบๅๆ็บฟ(้ป่ฎคๆพ็คบ)
    public Boolean gradientColorEnable;   //ๆฏๅฆ่ฆไธบๆธๅ่ฒ
    public Boolean polar;                 //ๆฏๅฆๆๅๅพๅฝข(ๅไธบ้ท่พพๅพ)
    public Float marginLeft;
    public Float marginRight;
    public Boolean dataLabelEnabled;      //ๆฏๅฆๆพ็คบๆฐๆฎ
    public Boolean xAxisLabelsEnabled;    //x่ฝดๆฏๅฆๆพ็คบๆฐๆฎ
    public String[] categories;            //x่ฝดๆฏๅฆๆพ็คบๆฐๆฎ
    public Integer xAxisGridLineWidth;    //x่ฝด็ฝๆ?ผ็บฟ็ๅฎฝๅบฆ
    public Boolean xAxisVisible;        //x ่ฝดๆฏๅฆๆพ็คบ
    public Boolean yAxisVisible;        //y ่ฝดๆฏๅฆๆพ็คบ
    public Boolean yAxisLabelsEnabled;    //y่ฝดๆฏๅฆๆพ็คบๆฐๆฎ
    public String yAxisTitle;            //y่ฝดๆ?้ข
    public Float yAxisLineWidth;       //y ่ฝด่ฝด็บฟ็ๅฎฝๅบฆ

    public Integer yAxisGridLineWidth;    //y่ฝด็ฝๆ?ผ็บฟ็ๅฎฝๅบฆ
    public Object[] colorsTheme;           //ๅพ่กจไธป้ข้ข่ฒๆฐ็ป
    public Boolean legendEnabled;         //ๆฏๅฆๆพ็คบๅพไพ
    public String legendLayout;          //ๅพไพๆฐๆฎ้กน็ๅธๅฑใๅธๅฑ็ฑปๅ๏ผ "horizontal" ๆ "vertical" ๅณๆฐดๅนณๅธๅฑๅๅ็ดๅธๅฑ ้ป่ฎคๆฏ๏ผhorizontal.
    public String legendAlign;           //่ฎพๅฎๅพไพๅจๅพ่กจๅบไธญ็ๆฐดๅนณๅฏน้ฝๆนๅผ๏ผๅๆณๅผๆleft๏ผcenter ๅ rightใ
    public String legendVerticalAlign;   //่ฎพๅฎๅพไพๅจๅพ่กจๅบไธญ็ๅ็ดๅฏน้ฝๆนๅผ๏ผๅๆณๅผๆ top๏ผmiddle ๅ bottomใๅ็ดไฝ็ฝฎๅฏไปฅ้่ฟ y ้้กนๅ่ฟไธๆญฅ่ฎพๅฎใ
    public String backgroundColor;       //ๅพ่กจ่ๆฏ่ฒ
    public Boolean options3dEnable;       //ๆฏๅฆ3Dๅๅพๅฝข(ไปๅฏนๆกๅฝขๅพ,ๆฑ็ถๅพๆๆ)
    public Integer options3dAlphaInt;
    public Integer options3dBetaInt;
    public Integer options3dDepth;        //3Dๅพๅฝขๆทฑๅบฆ
    public Integer borderRadius;          //ๆฑ็ถๅพ้ฟๆกๅพๅคด้จๅ่งๅๅพ(ๅฏ็จไบ่ฎพ็ฝฎๅคด้จ็ๅฝข็ถ,ไปๅฏนๆกๅฝขๅพ,ๆฑ็ถๅพๆๆ)
    public Integer markerRadius;          //ๆ็บฟ่ฟๆฅ็น็ๅๅพ้ฟๅบฆ
    public SeriesElement[] series;
    public String titleColor;//ๆ?้ข้ข่ฒ
    public String subTitleColor;//ๅฏๆ?้ข้ข่ฒ
    public String axisColor;//x ่ฝดๅ y ่ฝดๆๅญ้ข่ฒ


    public ChartModel animationType(String animationType) {
        this.animationType = animationType;
        return this;
    }

    public ChartModel animationDuration(Integer animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public ChartModel title(String title) {
        this.title = title;
        return this;
    }

    public ChartModel subtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public ChartModel chartType(String chartType) {
        this.chartType = chartType;
        return this;
    }

    public ChartModel stacking(String stacking) {
        this.stacking = stacking;
        return this;
    }

    public ChartModel symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public ChartModel symbolStyle(String symbolStyle) {
        this.symbolStyle = symbolStyle;
        return this;
    }

    public ChartModel zoomType(String zoomType) {
        this.zoomType = zoomType;
        return this;
    }

    public ChartModel pointHollow(Boolean pointHollow) {
        this.pointHollow = pointHollow;
        return this;
    }

    public ChartModel inverted(Boolean inverted) {
        this.inverted = inverted;
        return this;
    }

    public ChartModel xAxisReversed(Boolean xAxisReversed) {
        this.xAxisReversed = xAxisReversed;
        return this;
    }

    public ChartModel yAxisReversed(Boolean yAxisReversed) {
        this.yAxisReversed = yAxisReversed;
        return this;
    }

    public ChartModel tooltipCrosshairs(Boolean tooltipCrosshairs) {
        this.tooltipCrosshairs = tooltipCrosshairs;
        return this;
    }

    public ChartModel gradientColorEnable(Boolean gradientColorEnable) {
        this.gradientColorEnable = gradientColorEnable;
        return this;
    }

    public ChartModel polar(Boolean polar) {
        this.polar = polar;
        return this;
    }

    public ChartModel dataLabelEnabled(Boolean dataLabelEnabled) {
        this.dataLabelEnabled = dataLabelEnabled;
        return this;
    }

    public ChartModel xAxisLabelsEnabled(Boolean xAxisLabelsEnabled) {
        this.xAxisLabelsEnabled = xAxisLabelsEnabled;
        return this;
    }

    public ChartModel categories(String[] categories) {
        this.categories = categories;
        return this;
    }

    public ChartModel xAxisGridLineWidth(Integer xAxisGridLineWidth) {
        this.xAxisGridLineWidth = xAxisGridLineWidth;
        return this;
    }

    public ChartModel yAxisGridLineWidth(Integer yAxisGridLineWidth) {
        this.yAxisGridLineWidth = yAxisGridLineWidth;
        return this;
    }

    public ChartModel yAxisLabelsEnabled(Boolean yAxisLabelsEnabled) {
        this.yAxisLabelsEnabled = yAxisLabelsEnabled;
        return this;
    }

    public ChartModel yAxisTitle(String yAxisTitle) {
        this.yAxisTitle = yAxisTitle;
        return this;
    }

    public ChartModel colorsTheme(Object[] colorsTheme) {
        this.colorsTheme = colorsTheme;
        return this;
    }

    public ChartModel legendEnabled(Boolean legendEnabled) {
        this.legendEnabled = legendEnabled;
        return this;
    }

    public ChartModel legendLayout(String legendLayout) {
        this.legendLayout = legendLayout;

        return this;
    }

    public ChartModel legendAlign(String legendAlign) {
        this.legendAlign = legendAlign;
        return this;
    }

    public ChartModel legendVerticalAlign(String legendVerticalAlign) {
        this.legendVerticalAlign = legendVerticalAlign;
        return this;
    }

    public ChartModel backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public ChartModel options3dEnable(Boolean options3dEnable) {
        this.options3dEnable = options3dEnable;
        return this;
    }

    public ChartModel options3dAlphaInt(Integer options3dAlphaInt) {
        this.options3dAlphaInt = options3dAlphaInt;
        return this;
    }

    public ChartModel options3dBetaInt(Integer options3dBetaInt) {
        this.options3dBetaInt = options3dBetaInt;
        return this;
    }

    public ChartModel options3dDepth(Integer options3dDepth) {
        this.options3dDepth = options3dDepth;
        return this;
    }

    public ChartModel borderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public ChartModel markerRadius(Integer markerRadius) {
        this.markerRadius = markerRadius;
        return this;
    }

    public ChartModel series(SeriesElement[] series) {
        this.series = series;
        return this;
    }


    // ๆ้?ๅฝๆฐ(ไบฆๅณๆฏๅๅงๅๅฝๆฐ)
    public ChartModel() {

//        this.animationType = ChartAnimationType.EaseInBack;
//        this.animationDuration = 800;//ไปฅๆฏซ็งไธบๅไฝ
//        this.chartType = ChartType.Column;
//        this.inverted = false;
//        this.stacking = AAChartStackingType.False;
//        //this.symbol = AAChartSymbolType.Square.rawValue//้ป่ฎค็ๆ็บฟ่ฟๆฅ็น็ฑปๅ
//        this.xAxisReversed = false;
//        this.yAxisReversed = false;
//        this.zoomType = AAChartZoomType.X;
//        this.pointHollow = false;//้ป่ฎคๆ็บฟๆ่ๆฒ็บฟ็่ฟๆฅ็นไธไธบ็ฉบ
//        this.colorsTheme = new String[]{"#b5282a","#e7a701","#50c18d","#fd4800","#f1c6c5"};
//        this.gradientColorEnable = false;
//        this.polar = false;
//        this.dataLabelEnabled = true;
//        this.options3dEnable = false;
//        this.crosshairs = true;
//        this.xAxisLabelsEnabled = true;
//        this.xAxisGridLineWidth = 0;
//        this.yAxisLabelsEnabled = true;
//        this.yAxisGridLineWidth = 1;
//        this.legendEnabled = true;
//        this.legendLayout = AAchartLegendlLayoutType.Horizontal;
//        this.legendAlign = AAChartLegendAlignType.Center;
//        this.legendVerticalAlign = AAChartLegendVerticalAlignType.Bottom;
//        this.borderRadius = 0;//ๆฑ็ถๅพ้ฟๆกๅพๅคด้จๅ่งๅๅพ(ๅฏ็จไบ่ฎพ็ฝฎๅคด้จ็ๅฝข็ถ,ไปๅฏนๆกๅฝขๅพ,ๆฑ็ถๅพๆๆ,่ฎพ็ฝฎไธบ1000ๆถ,ๆฑๅฝขๅพๆ่ๆกๅฝขๅพๅคด้จไธบๆฅๅฝข)
//        this.markerRadius = 5;//ๆ็บฟ่ฟๆฅ็น็ๅๅพ้ฟๅบฆ,่ฎพ็ฝฎ้ป่ฎคๅผไธบ0,่ฟๆ?ทๅฐฑ็ธๅฝไบไธๆพ็คบไบ

        this.animationType = ChartAnimationType.EaseInBack;
        this.animationDuration = 800;//ไปฅๆฏซ็งไธบๅไฝ
        this.pointHollow = false;
        this.inverted = false;
        this.stacking = ChartStackingType.False;
        this.xAxisReversed = false;
        this.yAxisReversed = false;
        //this.zoomType = ChartZoomType.XY;
        //this.colorsTheme = new String[]{"#b5282a","#e7a701","#50c18d","#fd4800","#f1c6c5"};
        this.colorsTheme = new String[]{"#CACEDC"};//้ป่ฎค็้ข่ฒๆฐ็ป(ๅฟ้กป่ฆๆทปๅ?้ป่ฎคๆฐ็ป,ๅฆๅๅฐฑไผๅบ้)

        this.gradientColorEnable = false;
        this.polar = false;
        this.options3dEnable = false;
        this.xAxisLabelsEnabled = false;
        this.xAxisGridLineWidth = 0;
        this.yAxisLabelsEnabled = false;
        this.yAxisGridLineWidth = 1;
        this.legendEnabled = false;
        this.legendLayout = "horizontal";
        this.legendAlign = "center";
        this.legendVerticalAlign = "bottom";
        this.backgroundColor = "#ffffff";
        this.borderRadius = 0;//ๆฑ็ถๅพ้ฟๆกๅพๅคด้จๅ่งๅๅพ(ๅฏ็จไบ่ฎพ็ฝฎๅคด้จ็ๅฝข็ถ,ไปๅฏนๆกๅฝขๅพ,ๆฑ็ถๅพๆๆ,่ฎพ็ฝฎไธบ1000ๆถ,ๆฑๅฝขๅพๆ่ๆกๅฝขๅพๅคด้จไธบๆฅๅฝข)
        this.markerRadius = 0;//ๆ็บฟ่ฟๆฅ็น็ๅๅพ้ฟๅบฆ,ๅฆๆๅผ่ฎพ็ฝฎไธบ0,่ฟๆ?ทๅฐฑ็ธๅฝไบไธๆพ็คบไบ
        this.yAxisVisible = false;
        this.xAxisVisible = false;
        this.tooltipEnabled = false;
        this.tooltipCrosshairs = false;
    }
}
