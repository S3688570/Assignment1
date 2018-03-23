package org.launchcode;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Driver driver = new Driver();

        //Load the social network
        Person[] nam = new Person[4];

        nam[0] = new Adult("John Smith", 23, "Working for IBM", "Image1", "Rachel and John");
        nam[1] = new Adult("Maggie Evans", 35, "Studying at RMIT");
        nam[2] = new Children("Alan Danny", 12);
        nam[3] = new Children("Mary Smith", 5, "Working for IBM", "Image1", "Rachel and John");

        for (int i = 0; i < nam.length; i++) {
            System.out.println(nam[i].toString());
            System.out.println();
        }


    }

}

//Only need documentation with code
//twitter java - style guide
//Only error catching so program does not crash (no data validation required)
//Dictionary - HashMap

//Add Person to network
//Select a person by name
//Display the profile of a person
//Update the profile information for a person
//Delete a selected person
//Connect 2 people in a meaningful way (e.g. friend, parent)
//Find out whether a person is a direct friend of another person
//Find out the name(s) of a person's children or the names of the parents
