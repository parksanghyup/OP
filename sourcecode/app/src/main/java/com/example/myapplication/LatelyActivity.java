package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.DefaultAxisValueFormatter;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class LatelyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lately);

        LineChart lineChart = (LineChart) findViewById(R.id.chart2);
        BarChart barChart = (BarChart)findViewById(R.id.chart);

        List<BarEntry> entries1 = new ArrayList<>();
        entries1.add(new BarEntry(0f, 800));
        entries1.add(new BarEntry(1f, 1100));
        entries1.add(new BarEntry(2f, 600));
        entries1.add(new BarEntry(3f, 900));
        entries1.add(new BarEntry(4f, 1400));
        entries1.add(new BarEntry(5f, 400));
        entries1.add(new BarEntry(6f, 300));
        BarDataSet set = new BarDataSet(entries1, "");

        BarData data1 = new BarData(set);
        data1.setBarWidth(0.9f); // set custom bar width
        barChart.setData(data1);
        barChart.setFitBars(true); // make the x-axis fit exactly all bars
        barChart.invalidate(); // refresh

        ArrayList<Entry> entries2 = new ArrayList<>();
        entries2.add(new Entry(1, 26));
        entries2.add(new Entry(2, 40));
        entries2.add(new Entry(3, 47));
        entries2.add(new Entry(4, 32));
        entries2.add(new Entry(5, 54));

        ArrayList<Entry> entries3 = new ArrayList<>();
        entries3.add(new Entry(1, 0));
        entries3.add(new Entry(2, 60));
        entries3.add(new Entry(3, 50));
        entries3.add(new Entry(4, 60));
        entries3.add(new Entry(5, 60));

        ArrayList xVals = new ArrayList();

        xVals.add("4/25");
        xVals.add("4/26");
        xVals.add("4/27");
        xVals.add("4/28");
        xVals.add("4/29");
        xVals.add("4/30");
        xVals.add("5/1");

        LineDataSet lineDataSet1 = new LineDataSet(entries2, "푸시업");
        LineDataSet lineDataSet2 = new LineDataSet(entries3, "스쿼트");
        lineDataSet1.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineDataSet2.setAxisDependency(YAxis.AxisDependency.LEFT);
        // use the interface ILineDataSet
        List<ILineDataSet> dataSets = new ArrayList<ILineDataSet>();
        dataSets.add(lineDataSet1);
        dataSets.add(lineDataSet2);

        LineData data2 = new LineData(dataSets);
        lineChart.setData(data2);
        lineChart.invalidate(); // refresh

        XAxis xAxis1 = lineChart.getXAxis();
        xAxis1.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis1.setDrawGridLines(true);
        xAxis1.setGranularity(1f);
        xAxis1.setGranularityEnabled(true);
        final String xVal1[]={"4/25","4/26","4/27","4/28","4/29"};
        xAxis1.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return xVal1[(int) value-1]; // xVal is a string array
            }

        });

        lineDataSet1.setColors(ColorTemplate.rgb("#00ff80"));
        lineDataSet2.setColors(ColorTemplate.rgb("#80ffff"));

        XAxis xAxis = barChart.getXAxis();
        xAxis.setGranularity(1f);
        xAxis.setGranularityEnabled(true);
        xAxis.setCenterAxisLabels(true);
        xAxis.setDrawGridLines(false);
        xAxis.setAxisMaximum(6);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setValueFormatter(new IndexAxisValueFormatter(xVals));
    }

    public void onbuttontomain(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

}
