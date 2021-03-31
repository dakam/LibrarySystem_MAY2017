package prob2;

public class CD extends LendingItem{
	private String productId;
	private String title;
	private String company;
	
	CD(String productId, String title, String company) {
		this.productId=productId;
		this.title=title;
		this.company=company;			
	}
	

	@Override

	public String toString() {
		
		String str = "productId= "+productId+" title= "+title+" company= "+company;
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this==obj) {
			return true;
		}
		else if(this.getClass().getName() != obj.getClass().getName()) {
			return false;
		}
		else
		{
			CD cd = (CD) obj;
			if(productId.equals(cd.productId) && title.equals(cd.title) && company.equals(cd.company) ) {
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
	}
}

