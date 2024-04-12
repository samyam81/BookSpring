package com.read.readbook.model;

import org.springframework.stereotype.Component;

@Component
public class Library {

//     create table Library(
//     Name VARCHAR(50),
//     TotalCapacity INT,
//     Location VARCHAR(50),
//     LibraryID INT Primary key
// );

    private String name;
    private int totalcapacity;
    private String location;
    private int LibraryID;

    @Override
    public String toString() {
        return "Library [name=" + name + ", totalcapacity=" + totalcapacity + ", location=" + location + ", LibraryID="
                + LibraryID + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalcapacity() {
        return totalcapacity;
    }

    public void setTotalcapacity(int totalcapacity) {
        this.totalcapacity = totalcapacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLibraryID() {
        return LibraryID;
    }

    public void setLibraryID(int libraryID) {
        LibraryID = libraryID;
    }

    
}
