package com.charter.enterprise.csg.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charter.enterprise.csg.exception.RemoteException;
import com.charter.enterprise.csg.model.prefcomm.Email;
import com.charter.enterprise.csg.model.prefcomm.Phone;
import com.charter.enterprise.csg.model.prefcomm.User;
import com.charter.enterprise.csg.repository.PrefcommRepository;
import com.charter.enterprise.csg.service.PrefcommService;
import com.charter.enterprise.prefcomm.v1.Contact;
import com.charter.enterprise.prefcomm.v1.ContactData;
import com.charter.enterprise.prefcomm.v1.ContactInfo;
import com.charter.enterprise.prefcomm.v1.PreferenceAccountInfo;

@Service
public class PrefcommServiceImpl implements PrefcommService {

	@Autowired
	private PrefcommRepository repository;
	
	@Override
	public User getUser(String accountID, String billingSystemID) throws RemoteException {
		
		PreferenceAccountInfo accountInfo = repository.getUser(accountID, billingSystemID);
		
		User user = new User();
		
		List<ContactInfo> contactInfoList = accountInfo.getContactInfoList();
		Iterator<ContactInfo> contactInfoItr = contactInfoList.iterator();
		
		while(contactInfoItr.hasNext()) {
			
			ContactInfo contactInfo = contactInfoItr.next();
			Contact contact = contactInfo.getContact();
			user.setUserName(contact.getUserName());
			user.setAccountID(Long.toString(contact.getPreferenceAccount().getAccountId()));
			user.setAccountNumber(contact.getPreferenceAccount().getAccountNumber());
			
			List<ContactData> contactDataList = contactInfo.getContactDatas();
			Iterator<ContactData> contactDataItr = contactDataList.iterator();
			int counter = 1;
			while(contactDataItr.hasNext()) {
				ContactData contactData = contactDataItr.next();
				
				String contactValue = contactData.getContactValue();
				boolean isValid = contactData.getContactValid() == "Y" ? true : false;
				String invalidReason = contactData.getInvalidReason();
				if(counter > 3) {
					Email email = new Email();
					email.setEmail(contactValue);
					email.setInvalidReason(invalidReason);
					email.setValid(isValid);
					if(counter == 1) user.setEmail1(email);
					if(counter == 2) user.setEmail2(email);
					if(counter == 3) user.setEmail3(email);
				} else {
					Phone phone = new Phone();
					phone.setPhoneNumber(contactValue);
					phone.setInvalidReason(invalidReason);
					phone.setValid(isValid);
					if(counter == 4) user.setPhone1(phone);
					if(counter == 5) user.setPhone2(phone);
					if(counter == 6) user.setPhone3(phone);
				}
			}
		}
		return user;
	}

}
