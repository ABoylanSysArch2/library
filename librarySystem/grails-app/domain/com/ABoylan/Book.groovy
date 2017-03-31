package com.ABoylan

class Book {

String title
String subject
String author
String isbn
Date dateBorrowed
Date returnDate
Boolean overdue
Library library //an instance of the library class
Student student //an instance of the student class (not sure if this is needed as there can be books not being borrowed)
static hasMany=[bookreviews:BookReview]// one to many relationship  one book can have many reviews


    static constraints = {
	
	title blank:false, nullable:false
	subject blank:false, nullable:false
	author blank:false, nullable:false
	isbn blank:false, nullable:false
	dateBorrowed blank:false, nullable:false
	returnDate blank:false, nullable:false
	
	
    }
}
