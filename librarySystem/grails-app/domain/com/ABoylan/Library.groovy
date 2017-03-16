package com.ABoylan

class Library {

String buildingName
String address
String openingHours
String location
int studySpaces

    static constraints = {

	buildingName blank:false, nullable:false
	address blank:false, nullable:false
	openingHours blank:false, nullable:false
	location blank:false, nullable:false
	studySpaces blank:false, nullable:false, max:100
    }
}
