package com.ABoylan

class BookReview {

Book book //this will link to the book class
Date dateMade 
Student student //this will link to the student class
String review

String toString() {

return review

}

    static constraints = {

	book blank:false, nullable:false
	dateMade blank:false, nullable:false
	student blank:false, nullable:false
	review blank:false, nullable:false, maxSize:5000, widget:'textarea'
	
    }
}
