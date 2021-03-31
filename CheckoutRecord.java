package prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> entries;
	
	CheckoutRecord() {
		entries = new ArrayList<CheckoutRecordEntry>();	
	}
	
	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return entries;
	}
	
	public void addCheckoutEntry(CheckoutRecordEntry centry) {
		entries.add(centry);
	}
	
	
}
