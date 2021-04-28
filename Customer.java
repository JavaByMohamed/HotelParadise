package hotelmanagement2;

import java.io.Serializable;

public class Customer implements Serializable {

    private String firstName;
    private String lastName;
    private String ssn;
    private String bankInfo;
    private String email;
    private String phone;
    private int roomNumber;
    private int packageId;
    private int totalpersons;
    private int hmdays;
    

    public Customer(String firstName, String lastName, String ssn, String email, String phone, String bankInfo, int roomNumber, int packageId, int totalpersons, int hmdays) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.bankInfo = bankInfo;
        this.email = email;
        this.phone = phone;
        this.roomNumber= roomNumber;
        this.packageId = packageId; 
        this.totalpersons = totalpersons;
        this.hmdays = hmdays;
        
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public int getTotalpersons() {
        return totalpersons;
    }

    public void setTotalpersons(int totalpersons) {
        this.totalpersons = totalpersons;
    }

    public int getHmdays() {
        return hmdays;
    }

    public void setHmdays(int hmdays) {
        this.hmdays = hmdays;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(String bankInfo) {
        this.bankInfo = bankInfo;
    }
    
    @Override
    public String toString() {
        return "\n" + "firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + ", bankInfo=" + bankInfo + ", email=" + email + ", phone=" + phone + ", roomNumber=" + roomNumber + ", packageId=" + packageId + ", totalpersons=" + totalpersons + ", how many days=" + hmdays + "\n";
    }

}
