  

# Lab 09 - Parameters + Passing

# Create a Carbon Footprint Calculation Program

_Learning Objectives: demonstrate an understanding of how to design flexible, maintainable, reusable static methods. Demonstrate effective use of industry-standard code documentation._ 


**Lab Prompt:**

You are moving up in the world! Your internship with the U.S. Citizenship and Immigration Services was completed successfully and you were able to add skills to your resume, as a result, you have moved on to work on a research project as a java developer intern!

You have begun working at the Environmental Research Center (E.R.C.) in San Diego, California. Your P.I. would like your help designing a carbon footprint calculator, one that would be modular and allow you to reuse the code, luckily you have been studying diligently and now possess the skills necessary to make this program using static methods and parameter passing, nice!


*On Documentation: _An important need in research is effective communication and as such, it's necessary that programs you design be well documented as many researchers will be utilizing the tools you built but do not speak "robot" according to your co-worker. Many of the old software they are using have been developed without this in mind and are therefore extremely difficult to understand and use, but you are here to change that, bringing your previous knowledge and experience in the industry to the table._ 

Your assignment has been laid out as follows:


# Lab Instructions Part I

Choose **one** of the following Carbon emission formulas to calculate within a method:

- Avg. Emissions for a typical vehicle (C9) 
- Avg. Monthly natural gas emissions (C17)
- Avg. Fuel Oil emissions (C33)
- Avg. Propane emissions (C41)
- Avg. Electricity emissions (C24)

_Hint: (C9) means that on the Assumptions Tab of this [spreadsheet](https://docs.google.com/spreadsheets/d/1HM1v-rC1S57BBItPz-kC8m48ekaSc3nk/edit#gid=1391153493), you can find the formula for this calculation by selecting the cell at column C, row 9, then referring to the formula bar near the top of the page._

Pass `double` values as parameters into your method for the calculations, **round** the results to the nearest whole number, and make the return type of your method `int` so the result is truncated to drop the decimal places.

For now, **choose one of the following methods** to implement. In Part II of the lab, you will implement all the remaining  methods.
Note that you _**must**_ use these exact  method headers to pass the tests:

    public static int calcVehicleEmissions(double mpg, double avgMilesDriven)

    public static int calcNaturalGasEmissions(double natGasConsumption, double natGasEF)

    public static int calcFuelOilEmissions(double fuelOilConsumption, double emissionFactorPerGallon)

    public static int calcPropaneEmissions(double monthlyPropaneConsumption, double propaneEF)

    public static int calcElectricityEmissions(double monthlyElectricityConsumption, double electricityEF)



Please refer to the [spreadsheet](https://docs.google.com/spreadsheets/d/1HM1v-rC1S57BBItPz-kC8m48ekaSc3nk/edit#gid=1391153493) (Assumptions Tab) for the formulas for calculation, and refer to the modules for documenting your methods. 

After selecting which method to build, **be sure the method header in your code exactly matches one of the method headers listed above**, then call your new method in the calculation section of main, using proper convention.


Print out the calculation of your method to verify the result for yourself. 


# Lab Instructions Part II

**Create all the remaining methods** and practice calling each one, pass in values of your choosing or use the values on the spreadsheet.

Once you finish implementing all the methods, **run the tests**.

