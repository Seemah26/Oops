package com.bridgelabz.addressbook.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.addressbook.interfacedata.AddressBookInterface;
import com.bridgelabz.addressbook.model.AdressBookModel;
import com.google.gson.Gson;

public class AddressBookImpl implements AddressBookInterface {
    JSONArray jsonArray;
    List<AdressBookModel> addressdetails = new ArrayList<>();

    JSONObject jobject = new JSONObject();

    public void fileRead() throws FileNotFoundException, IOException, ParseException {
        JSONParser parser = new JSONParser();
        {
            try {
                jsonArray = (JSONArray) parser.parse(new FileReader(
                        "C:\\KAVYA\\bridgelabz\\src\\com\\bridgelabz\\addressbook\\model\\address.json"));

                for (Object obj : jsonArray) {
                    AdressBookModel addressdetail = new AdressBookModel();

                    jobject = (JSONObject) obj;
                    String firstname = (String) jobject.get("firstName");
                    String lastname = (String) jobject.get("lastName");
                    String city = (String) jobject.get("city");
                    String address = (String) jobject.get("address");
                    String state = (String) jobject.get("state");
                    Long phonenumber = (Long) jobject.get("phonenumber");
                    Long zipcode = ((Long) jobject.get("zipCode"));

                    addressdetail.setFirstName(firstname);
                    addressdetail.setLastName(lastname);
                    addressdetail.setCity(city);
                    addressdetail.setAddress(address);
                    addressdetail.setState(state);
                    addressdetail.setPhonenumber(phonenumber);
                    addressdetail.setZipcode(zipcode);

                    addressdetails.add(addressdetail);
                }
                System.out.println(addressdetails.toString());
            }

            catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void addPerson(String firstname, String lastname, Long zipcode, Long phonenumber, String city, String state,
            String address) {
        AdressBookModel addressdetail = new AdressBookModel();
        addressdetail.setFirstName(firstname);
        addressdetail.setLastName(lastname);
        addressdetail.setCity(city);
        addressdetail.setAddress(address);
        addressdetail.setState(state);
        addressdetail.setPhonenumber(phonenumber);
        addressdetail.setZipcode(zipcode);

        addressdetails.add(addressdetail);
        addressdetails.forEach(persondetails -> System.out.println(persondetails.toString()));

    }

    public void writeFile() {
        Gson gson = new Gson();
        String json = gson.toJson(addressdetails);
        System.out.println(json);
        System.out.println(addressdetails);

        try (FileWriter file = new FileWriter(
                "C:\\KAVYA\\bridgelabz\\src\\com\\bridgelabz\\addressbook\\model\\address.json")) {
            file.write(json);
            System.out.println("SuccessFully copied to JSON  Object to File......");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removePerson() {
        // fileRead();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter which elements to be removed :");
        String removeele = sc.nextLine();
        addressdetails.removeIf(inventory -> inventory.getFirstName().equals(removeele));
        writeFile();
        System.out.println("SuccessFully Removed the Elements From The List");
    }

    public void sortByLastName() {
        addressdetails.sort((AdressBookModel s1, AdressBookModel s2) -> s1.getLastName().compareTo(s2.getLastName()));
        addressdetails.forEach((s) -> System.out.println(s));
    }

    public void sortByZipCode() {
        addressdetails.sort((AdressBookModel s1, AdressBookModel s2) -> s1.getZipcode().compareTo(s2.getZipcode()));
        addressdetails.forEach((s) -> System.out.println(s));

    }

}