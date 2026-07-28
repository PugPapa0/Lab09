import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestMain {

    private void testUsingReflection(String methodName, double p1, double p2, int result)
    {
        Class clazz = null;
        try
        {
            clazz = Class.forName("Main");
        } catch (ClassNotFoundException e)
        {
            fail("Main class not found.");
        }

        Method method = null;
        try
        {
            method = clazz.getDeclaredMethod(methodName, double.class, double.class);
        } catch (NoSuchMethodException e)
        {
            fail("Method '" + methodName + "' with two double parameters not found.");
        }

        try
        {
            assertEquals(result, method.invoke(null, new Object[] {p1, p2}));
        } catch (IllegalAccessException e)
        {
            fail(e.getMessage());
        } catch (InvocationTargetException e)
        {
            fail(e.getMessage());
        }
    }

    @Test
    public void testCalcNaturalGasEmissions1()
    {
        // Average Natural Gas Emissions: 7,892 lbs of CO2e given 5500.0 for natGasConsumption and 119.58 for natGasEF
        testUsingReflection("calcNaturalGasEmissions", 5500.0, 119.58, 7892);
    }

    @Test
    public void testCalcNaturalGasEmissions2()
    {
        // Average Natural Gas Emissions: 7,892 lbs of CO2e given 5500.0 for natGasConsumption and 119.58 for natGasEF
        testUsingReflection("calcNaturalGasEmissions", 4500.3, 229.33, 12385);
    }

    @Test
    public void testCalcElectricityEmissions1()
    {
        // Average Electricity Emissions: 14,020 lbs of CO2e given that monthlyElectricityConsumption is 943.3333333333 and totalEF is 1238.5157
        testUsingReflection("calcElectricityEmissions", 943.3333333333, 1238.5157, 14020);
    }

    public void testCalcElectricityEmissions2()
    {
        // Average Electricity Emissions: 41,290 lbs of CO2e given that monthlyElectricityConsumption is 657.3242562 and totalEF is 5234.578
        testUsingReflection("calcElectricityEmissions", 657.3242562, 5234.578, 41290);
    }

    @Test
    public void testCalcFuelOilEmissions1()
    {
        // Average Fuel Oil Emissions: 12,460 lbs of CO2e given 45.9166666667 monthly fuel consumption and 22.6131018643 gallons
        testUsingReflection("calcFuelOilEmissions",45.9166666667, 22.6131018643, 12460);
    }

    @Test
    public void testCalcFuelOilEmissions2()
    {
        // Average Fuel Oil Emissions: 23,358 lbs of CO2e given 63.476532 monthly fuel consumption and 30.664643 gallons
        testUsingReflection("calcFuelOilEmissions", 63.476532, 30.664643, 23358);
    }

    @Test
    public void testCalcVehicleEmissions1()
    {
        // Average Car Emissions: 10,484 lbs of CO2e given 21.6 mpg and 11,398 average miles driven
        testUsingReflection("calcVehicleEmissions", 21.6, 11398.0, 10484);
    }

    @Test
    public void testCalcVehicleEmissions2()
    {
        // Average Car Emissions: 9,312 lbs of CO2e given 33.2 mpg and 15,560.7 average miles driven
        testUsingReflection("calcVehicleEmissions", 33.2, 15560.7, 9312);
    }

    @Test
    public void testCalcPropaneEmissions1()
    {
        //Average Propane Emissions: 5,766 lbs of CO2e given that monthlyPropaneConsumption is 38.6666666667 and propaneEF is 12.4260044804
        testUsingReflection("calcPropaneEmissions", 38.6666666667, 12.4260044804, 5766);
    }

    @Test
    public void testCalcPropaneEmissions2()
    {
        // Average Propane Emissions: 2,304 lbs of CO2e given that monthlyPropaneConsumption is 24.43456654 and propaneEF is 7.8585833
        testUsingReflection("calcPropaneEmissions", 24.43456654, 7.8585833, 2304);
    }
}