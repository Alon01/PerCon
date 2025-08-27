package org.her.service;

import org.her.model.Contacts;
import org.her.model.ContactsDAO;

public class AgendService {

    private final ContactsDAO contactsDAO;

    public AgendService() {
        this.contactsDAO = new ContactsDAO();
    }

    public boolean agregarContacto(String fName, String lName, String pNumber) {
        Contacts contacto = new Contacts(fName, lName, pNumber);
        return contactsDAO.newContact(contacto);
    }

}
