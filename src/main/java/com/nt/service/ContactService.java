package com.nt.service;

import java.util.List;

import com.nt.model.Contact;

public interface ContactService {
	
	public void save(Contact c);
	public void update(Contact c);
	public void delete(Integer contactId);
	public void delete(Integer[] contactIds);
	
	public Contact findbyId(Integer contactId);
	
	
	
	 /**
     * This method returns all User Contact (user who is logged in).
     * @param userId
     * @return 
     */
    public List findUserContact(Integer userId);
    /**
     * The method search contact for user(userId) based on given free-text-criteria (txt)
     * @param userId User who is logged in
     * @param txt criteria used to search - free text search criteria
     * @return 
     */
    public List findUserContact(Integer userId, String txt); 

}
