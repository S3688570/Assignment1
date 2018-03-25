package org.launchcode;

public class Children extends Person {

    //List instance variables
    String parents;

    //Construct default Children object
    public Children() {
    }

    //Construct second Children object with specified parameters
    public Children(String lastName, String firstName, int age, String status, String image, String friends, String parents) {
        super(lastName, firstName, age, status, image, friends);
        this.parents = parents;
    }

    //Construct third Children object with specified parameters
    public Children(String lastName, String firstName, int age, String status, String image, String friends) {
        super(lastName, firstName, age, status, image, friends);
        this.parents = null;
    }

    //Construct fourth Children object with specified parameters
    public Children(String lastName, String firstName, int age, String status, String image) {
        super(lastName, firstName, age, status, image, null);
        this.parents = null;
    }

    //Construct fourth Children object with specified parameters
    public Children(String lastName, String firstName, int age, String status) {
        super(lastName, firstName, age, status, null, null);
        this.parents = null;
    }

    //Construct fifth Children object with specified parameters
    public Children(String lastName, String firstName, int age) {
        super(lastName, firstName, age, null, null, null);
        this.parents = null;
    }

    //Return parent(s) name(s)
    public String getParents() {
        return parents;
    }

    //Set parent(s) name(s)
    public void setParents(String parents) {
        this.parents = parents;
    }

    //Return a string listing all elements in Children object
    public String toString() {
        return "Last Name:" + getLastName() + "\nFirst Name: " + getFirstName() + "\nAge: " + getAge() + "\nStatus: " + getStatus() + "\nImage: " + getImage() + "\nFriends: " + getFriends() + "\nParents: " + parents;
    }

}

