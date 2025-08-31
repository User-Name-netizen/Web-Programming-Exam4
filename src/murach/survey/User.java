package murach.survey;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String heardFrom;
    private String wantsUpdates;
    private String emailOK;
    private String contactVia;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dateOfBirth = "";
        heardFrom = "";
        wantsUpdates = "";
        emailOK = "";
        contactVia = "";
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return String return the heardFrom
     */
    public String getHeardFrom() {
        return heardFrom;
    }

    /**
     * @param heardFrom the heardFrom to set
     */
    public void setHeardFrom(String heardFrom) {
        this.heardFrom = heardFrom;
    }

    /**
     * @return String return the wantsUpdates
     */
    public String getWantsUpdates() {
        return wantsUpdates;
    }

    /**
     * @param wantsUpdates the wantsUpdates to set
     */
    public void setWantsUpdates(String wantsUpdates) {
        this.wantsUpdates = wantsUpdates;
    }

    /**
     * @return String return the emailOK
     */
    public String getEmailOK() {
        return emailOK;
    }

    /**
     * @param emailOK the emailOK to set
     */
    public void setEmailOK(String emailOK) {
        this.emailOK = emailOK;
    }

    /**
     * @return String return the contactVia
     */
    public String getContactVia() {
        return contactVia;
    }

    /**
     * @param contactVia the contactVia to set
     */
    public void setContactVia(String contactVia) {
        this.contactVia = contactVia;
    }

}