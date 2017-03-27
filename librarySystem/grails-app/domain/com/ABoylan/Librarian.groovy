package com.ABoylan

class Librarian {

String name
String email
String office
String username
String password
int telephone
Library library// this is now an object of type domain class Library

    static constraints = {

	name blank:false, nullable:false
	email blank:false, nullable:false, email:true
	office blank:false, nullable:false
	username blank:false, nullable:false, unique:true
	password blank:false, nullable:false
	telephone blank:false, nullable:false
	library blank:false, nullable:false
    }
}
