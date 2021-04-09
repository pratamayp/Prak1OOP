package id.ac.uns.vokasi.d3ti.innerinter;

public class Suhu implements TransformasiSuhu{

	@Override
	public double CelciustoFahrenheit(double celcius) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double CelciustoReamur(double celcius) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double FahrenheittoCelcius(double fahrenheit) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public double FahrenheittoReamur(double fahrenheit) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double ReamurtoCelcius(double reamur) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double ReamurtoFahrenheit(double reamur) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[]args) {
		Suhu object = new Suhu();
		
		System.out.println("Celcius ke Fahrenheit =" + object.CelciustoFahrenheit(90)); 
		System.out.println("Celcius ke Reamur =" + object.CelciustoReamur(90)); 
		System.out.println("Fahrenheit ke Celcius =" + object.FahrenheittoCelcius(90)); 
		System.out.println("Fahrenheit ke Reamur =" + object.FahrenheittoReamur(90)); 
		System.out.println("Reamur ke Celcius =" + object.ReamurtoCelcius(90)); 
		System.out.println("Reamur ke Fahrenheit =" + object.ReamurtoFahrenheit(80));
	}
	
}
