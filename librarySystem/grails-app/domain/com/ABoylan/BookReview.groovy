package com.ABoylan

class BookReview {

Book book //this will link to the book class
Date dateCreated
Student student //this will link to the student class
String review

    static constraints = {
	
	book blank:false, nullable:false
	dateCreated blank:false, nullable:false
	student blank:false, nullable:false
	review blank:false, nullable:false
    }
}
