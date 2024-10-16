import org.apache.commons.math3.stat.regression.SimpleRegression;

import java.util.List;

public class LinearRegressionModel {
    private SimpleRegression regression;

    public LinearRegressionModel() {
        regression = new SimpleRegression();
    }

    public LinearRegressionModel(List<Double> xValues, List<Double> yValues) {
        regression = new SimpleRegression();
        for (int i = 0; i < xValues.size(); i++) {
            regression.addData(xValues.get(i), yValues.get(i));
        }
    }

    public double predict(double x) {
        return regression.predict(x);
    }

    public double getSlope() {
        return regression.getSlope();
    }

    public double getIntercept() {
        return regression.getIntercept();
    }

    public double getR2Score() {
        return regression.getRSquare();
    }
}

