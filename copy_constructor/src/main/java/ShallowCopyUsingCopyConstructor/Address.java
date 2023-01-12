package ShallowCopyUsingCopyConstructor;

public class Address {

	int pin;
	String city;
	
	Address(){
		super();
	}
	Address(int pin, String city){
		this.pin=pin;
		this.city=city;
	}
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return "pin : "+pin+" "+"city : "+city;
	}
	
}
