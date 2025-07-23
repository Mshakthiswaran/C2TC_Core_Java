package EntityClassAssignment2;

public class Product {
	private String	watch;
	private String 	Laptop;
	private String	Cellphone;
	private String	EarPods;
	public String getWatch() {
		return watch;
	}
	public void setWatch(String watch) {
		this.watch = watch;
	}
	public String getLaptop() {
		return Laptop;
	}
	public void setLaptop(String laptop) {
		Laptop = laptop;
	}
	public String getCellphone() {
		return Cellphone;
	}
	public void setCellphone(String cellphone) {
		Cellphone = cellphone;
	}
	public String getEarPods() {
		return EarPods;
	}
	public void setEarPods(String earPods) {
		EarPods = earPods;
	}
	@Override
	public String toString() {
		return "Product [watch=" + watch + ", Laptop=" + Laptop + ", Cellphone=" + Cellphone + ", EarPods=" + EarPods
				+ "]";
	}
	
	
}
