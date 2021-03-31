package prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private LendingItem item;
	private ItemType type;
	
	CheckoutRecordEntry(LendingItem item, LocalDate chDate, LocalDate dueDate, ItemType type ) {
		this.item=item;
		this.checkoutDate=chDate;
		this.dueDate=dueDate;
		this.type=type;
	}
	
	public LocalDate getCheckoutDate() {
		return this.checkoutDate;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
		
	}
	
	public ItemType getLendingItemType() {
		return type;
	}
	
	public LendingItem getLendingItem() {
		return this.item;
	}
	
	
	
}
