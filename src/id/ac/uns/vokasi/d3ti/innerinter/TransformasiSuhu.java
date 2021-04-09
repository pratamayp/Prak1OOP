package id.ac.uns.vokasi.d3ti.innerinter;

public interface TransformasiSuhu {
	final int FAHRENHEIT=32;
	
	public abstract double CelciustoFahrenheit(double celcius);
	public abstract double CelciustoReamur(double celcius);
	
	public abstract double FahrenheittoCelcius(double fahrenheit);
	public abstract double FahrenheittoReamur(double fahrenheit);
	
	public abstract double ReamurtoCelcius(double reamur);
	public abstract double ReamurtoFahrenheit(double reamur);
}
