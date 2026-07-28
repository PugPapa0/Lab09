// PARTNER NAME: Travis Becker
// PARTNER NAME:
// CS111 SECTION #: 9
// DATE:

public class Main
{
	public static void main(String[] args)
	{
		// Sample values
		double mpg = 25.0;
		double avgMilesDriven = 1000.0;

		double natGasConsumption = 50.0;
		double natGasEF = 0.12061;

		double monthlyElectricityConsumption = 900.0;
		double electricityEF = 0.709;

		double fuelOilConsumption = 40.0;
		double fuelOilEF = 22.61;

		double propaneConsumption = 30.0;
		double propaneEF = 12.43;

		System.out.println("Vehicle Emissions: "
				+ calcVehicleEmissions(mpg, avgMilesDriven));

		System.out.println("Natural Gas Emissions: "
				+ calcNaturalGasEmissions(natGasConsumption, natGasEF));

		System.out.println("Electricity Emissions: "
				+ calcElectricityEmissions(monthlyElectricityConsumption, electricityEF));

		System.out.println("Fuel Oil Emissions: "
				+ calcFuelOilEmissions(fuelOilConsumption, fuelOilEF));

		System.out.println("Propane Emissions: "
				+ calcPropaneEmissions(propaneConsumption, propaneEF));
	}

	/**
	 * Calculates annual vehicle CO2 emissions.
	 *
	 * Preconditions:
	 * mpg > 0
	 * avgMilesDriven >= 0
	 *
	 * Postconditions:
	 * Returns annual vehicle emissions rounded to the nearest whole number.
	 *
	 * @param mpg average miles per gallon
	 * @param avgMilesDriven average miles driven annually
	 * @return annual vehicle emissions
	 */
	public static int calcVehicleEmissions(double mpg, double avgMilesDriven)
	{
		double poundsCO2PerGallon = 19.6;
		double nonCO2Ratio = 100.0 / 98.65;

		double emissions = (1 / mpg) * avgMilesDriven
				* poundsCO2PerGallon * nonCO2Ratio;

		return (int)Math.round(emissions);
	}

	/**
	 * Calculates annual natural gas emissions.
	 *
	 * @param natGasConsumption monthly natural gas consumption
	 * @param natGasEF natural gas emission factor
	 * @return annual emissions
	 */
	public static int calcNaturalGasEmissions(double natGasConsumption,
	                                          double natGasEF)
	{
		double emissions = natGasConsumption * 12 * natGasEF / 1000;
		return (int)Math.round(emissions);
	}

	/**
	 * Calculates annual fuel oil emissions.
	 *
	 * @param fuelOilConsumption monthly fuel oil consumption
	 * @param emissionFactorPerGallon emission factor
	 * @return annual emissions
	 */
	public static int calcFuelOilEmissions(double fuelOilConsumption,
	                                       double emissionFactorPerGallon)
	{
		double emissions = fuelOilConsumption * 12
				* emissionFactorPerGallon;

		return (int)Math.round(emissions);
	}

	/**
	 * Calculates annual propane emissions.
	 *
	 * @param monthlyPropaneConsumption monthly propane consumption
	 * @param propaneEF propane emission factor
	 * @return annual emissions
	 */
	public static int calcPropaneEmissions(double monthlyPropaneConsumption,
	                                       double propaneEF)
	{
		double emissions = monthlyPropaneConsumption * 12 * propaneEF;
		return (int)Math.round(emissions);
	}

	/**
	 * Calculates annual electricity emissions.
	 *
	 * @param monthlyElectricityConsumption monthly electricity usage
	 * @param electricityEF electricity emission factor
	 * @return annual emissions
	 */
	public static int calcElectricityEmissions(double monthlyElectricityConsumption,
	                                           double electricityEF)
	{
		double emissions = monthlyElectricityConsumption * 12
				* electricityEF / 1000;

		return (int)Math.round(emissions);
	}
}