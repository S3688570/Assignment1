package org.launchcode;

import java.util.Scanner;

public class AddProfiles extends Array {
    private String personCat;
    private String newName;
    private int newAge = 0;
    private String newStatus;
    private String newImage;
    private String newFriends;
    private String newChildren;


    //Construct default AddProfile object
    public AddProfiles() {

    }

    //Add profile to arrayList
    public void addProfile() {
        Scanner input = new Scanner(System.in);
        boolean isString;

        //Input the person's name
        System.out.println("What is the person's name: ");
        newName = input.nextLine();
        while (!newName.matches("[a-zA-Z]+")) {
            System.out.println("Woops that's not a name!! Please try again: ");
            newName = input.nextLine();
        }

        //Input the person's age
        boolean isNumber;
        //int newAge = input.nextInt();
        do {
            System.out.println("What is the person's age: ");
            //   newAge = input.nextInt();
            if (input.hasNextInt()) {
                newAge = input.nextInt();
                isNumber = true;
            } else {
                System.out.println("Woops that is not a number. Try again: ");
                isNumber = false;
                input.next();
            }
        } while (!(isNumber));

        //Determine if person is adult or dependent (child)
        if (newAge > 16) {
            personCat = "adult";
        } else {
            personCat = "child";
        }

        //Input the person's status
        System.out.println("What is the person's status: ");
        newStatus = input.next();
        while (!newStatus.matches("[a-zA-Z]+")) {
            System.out.println("Woops that's not a status!! Please try again: ");
            newStatus = input.next();
        }

        //Input an image name
        System.out.println("Is there an image name: ");
        newImage = input.next();
        while (!newImage.matches("[a-zA-Z]+")) {
            System.out.println("Woops that's not a image name!! Please try again: ");
            newImage = input.next();
        }

        //Input the person's friend's first name
        System.out.println("What are the names of this person's friends: ");
        newFriends = input.next();
        while (!newFriends.matches("[a-zA-Z]+")) {
            System.out.println("Woops that's not a friend's name!! Please try again: ");
            newFriends = input.next();
        }

        //Input the person's child(ren)'s first name
        System.out.println("What are the first names of this person's children: ");
        newChildren = input.next();
        while (!newChildren.matches("[a-zA-Z]+")) {
            System.out.println("Woops that's not a child's name!! Please try again: ");
            newChildren = input.next();
        }

        //Determine whether person is an adult or child based on age
        if (personCat.equals("adult")) {
            nam.add(new Adult(newName, newAge, newStatus, newImage, newFriends, newChildren));
        } else {
            nam.add(new Children(newName, newAge, newStatus, newImage, newFriends));
        }

        //Print new profile
        for (int i=0; i<nam.size(); i++) {
            if (newName.equalsIgnoreCase(nam.get(i).getName()))
                System.out.println(nam.get(i));
            System.out.println();
        }
    }

}



