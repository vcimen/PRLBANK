package gmibank.pojos;

public class CustomerObject {
   private int id;
   private String firstName;
   private String lastName;
   private String middleInitial;

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setZelleEnrolled(boolean zelleEnrolled) {
        this.zelleEnrolled = zelleEnrolled;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(CountryObject country) {
        this.country = country;
    }

    private String mobilePhoneNumber;
   private String phoneNumber;
   private String zipCode;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getSsn() {
        return ssn;
    }

    public String getCreateDate() {
        return createDate;
    }

    public boolean isZelleEnrolled() {
        return zelleEnrolled;
    }

    public String getState() {
        return state;
    }

    public CountryObject getCountry() {
        return country;
    }
    private String address;
   private String city;
   private String ssn;
   private String createDate;
   private boolean zelleEnrolled;
   private String state;
   private CountryObject country;

}
