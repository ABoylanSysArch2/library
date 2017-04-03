package com.ABoylan

class Library {

String buildingName
String address
String openingHours
String location
String studySpaces
static hasMany=[librarians:Librarian, books:Book]//one to many relationships for a library can have many librarians, a library can have many books, a library can have many students

String toString() {

return buildingName

}

    static constraints = {

	buildingName blank:false, nullable:false
	address blank:false, nullable:false
	openingHours blank:false, nullable:false
	location blank:false, nullable:false
	studySpaces blank:false, nullable:false
    }
}
