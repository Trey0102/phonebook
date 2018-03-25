package com.trey.entity;


public class PhoneBook {

    private String name;
    private String phone;
    private String email;

    public PhoneBook()
    {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook PhoneBook = (PhoneBook) o;
        if(name != null ? !name.equals(PhoneBook.name) : PhoneBook.name != null) return false;
        if(phone != null ? !phone.equals(PhoneBook.phone) : PhoneBook.phone != null) return false;
        return email != null ? email.equals(PhoneBook.email) : PhoneBook.email == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
