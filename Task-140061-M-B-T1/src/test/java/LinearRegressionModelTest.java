import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LinearRegressionModelTest {

    private LinearRegressionModel model;

    @BeforeEach
    public void setUp() {
        // Initialize the model with sample data
        List<Double> xValues = new ArrayList<>();
        List<Double> yValues = new ArrayList<>();

        xValues.add(1.0);
        xValues.add(3.0);
        xValues.add(5.0);
        xValues.add(7.0);

        yValues.add(2.0);
        yValues.add(5.0);
        yValues.add(8.0);
        yValues.add(11.0);

        model = new LinearRegressionModel(xValues, yValues);
    }

    @Test
    public void testModelPrediction() {
        double x = 6.0;
        double expectedPrediction = 9.5;  // Updated expected value
        double actualPrediction = model.predict(x);

        // Debugging print statements
//        System.out.println("Slope: " + model.getSlope());
//        System.out.println("Intercept: " + model.getIntercept());
//        System.out.println("Prediction for x = 6.0: " + actualPrediction);

        Assertions.assertEquals(expectedPrediction, actualPrediction, 0.01);
    }

    @Test
    public void testModelCoefficients() {
        double expectedSlope = 1.5;
        double expectedIntercept = 0.5;
        Assertions.assertEquals(expectedSlope, model.getSlope(), 0.01);
        Assertions.assertEquals(expectedIntercept, model.getIntercept(), 0.01);
    }

    @Test
    public void testModelR2Score() {
        double expectedR2 = 1.0;  // Adjust based on actual fit
        Assertions.assertEquals(expectedR2, model.getR2Score(), 0.01);
    }
}
