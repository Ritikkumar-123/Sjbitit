package basic.mca.dsa;

package dsaproject.mca.dsa;

import java.util.Objects;

public class Product {
	int prdid=40;
	String prdName="Chandan";
	double prdprice=1200;
	
	public Product(String prdName, double prdprice, int prdid) {
		super();
		this.prdid=prdid;
		this.prdName = prdName;
		this.prdprice = prdprice;
	}
	

	@Override
	public String toString() {
		return "Product [prdName=" + prdName + ", prdprice=" + prdprice + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(prdName, prdprice);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(prdName, other.prdName)
				&& Double.doubleToLongBits(prdprice) == Double.doubleToLongBits(other.prdprice);
	}


		
		
		
	
	}
