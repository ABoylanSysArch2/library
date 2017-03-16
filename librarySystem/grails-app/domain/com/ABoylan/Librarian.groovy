package com.ABoylan

class Librarian {

String name
String email
String office
String username
String password
int telephone
String library //One library to many librarians, many librarians to one library

    static constraints = {

	name blank:false, nullable:false
	email blank:false, nullable:false, email:true
	office blank:false, nullable:false
	username blank:false, nullable:false, unique:true
	password blank:false, nullable:false
	telephone blank:false, nullable:false, min:11
	library blank:false, nullable:false
    }
}
