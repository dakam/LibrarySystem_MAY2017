package prob2;

import java.util.*;

/* Code by  Damian Kato - Time check 31/03/2021 14:59
 * 
 */

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		
		int mlen = members.length;
		
		for(int i=0; i<mlen;i++) {
			LibraryMember memb = members[i];
			
			CheckoutRecord checkout= memb.getCheckoutRecord();
			if(checkout !=null) {
				
				List<CheckoutRecordEntry> checkoutentries = checkout.getCheckoutEntryList();
				
				for(CheckoutRecordEntry rentry : checkoutentries) {
					
					LendingItem litem = rentry.getLendingItem();
					if(litem !=null) {
						
						if(item.equals(litem)) {
							phoneNums.add(memb.getPhone());
							break;
						}
					}
					
				}
				
				
				
				
			}
			
		}
		
		
		
		
		
		Collections.sort(phoneNums);
		return phoneNums;
	}
}
