package com.xworkz.equalmethod;

public class Plate {
	
	public String type;
	public int price;
	public String color;
	public String material;
	public String shape; 
	public boolean disposable;
	
	
	public Plate()
	{
		System.out.println("Running in Plate");
		
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals in:"+this);
		System.out.println("equals in:"+obj);
		
		
		if(obj != null && obj instanceof  Plate)
		{
			
			Plate next=(Plate)obj;/// || or operator
			if(this.type.equals(next.type)  &&
					this.shape.equals(next.shape)||
					this.material.equals(next.material))
			{
				return true;
			}
			
			return false;
			
		}
		
		return false;
		
		
		
}		

	
	@Override
	public String toString() {
		
		return "Plate-Tpe: " +this.type+ " Price: " 
		+this.price+" Color: "+this.color+  " Material : "
				+this.material+ 
		" Shape : "+shape+ "Disposable: " +disposable;
	}
			
	


}
