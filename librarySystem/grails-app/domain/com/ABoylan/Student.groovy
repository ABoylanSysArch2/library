package com.ABoylan

class Student {

String name
String email
String username
String password
String studentId
static hasOne=[course:Course] // creates the one to one relationship with Course one student has one course
static hasMany=[books:Book, bookreviews:BookReview]//one to many relationships one student can have many books, one student can have many book reviews


    static constraints = {

	name blank:false, nullable:false
	email blank:false, nullable:false
	username blank:false, nullable:false, unique:true
	password blank:false, nullable:false
	studentId blank:false, nullable:false
	course blank:false, nullable:false
    }
}
