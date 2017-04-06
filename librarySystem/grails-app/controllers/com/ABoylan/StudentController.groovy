package com.ABoylan

class StudentController {

    def scaffold = Student

	def studentlogin(){

}//new code if studentlogin doesn't work then delete this!!!

	def validate(){

		def user = Student.findByUsername(params.username)

		if (user && user.password == params.password){

			session.user = user

			render view:'home'
	
	}

		else{

			flash.message = "invalid username and password."

			render view:'studentlogin'

		}

	}

def logout = {

	session.user = null

	redirect(uri:'/')

	}
		


	
	def search(){
}

def results(String name){

	def students=Student.where{

		name=~name

	}.list()

return [students:students,

	term:params.name,

	totalStudents:Student.count()]

}

def advSearch(){

}

def advResults(){



def studentProps = Student.metaClass.properties*.name

def students = Student.withCriteria{

	"${params.queryType}"{

		params.each {field, value ->

			if (studentProps.grep(field) && value){

				ilike(field, value)

				}

			}

		}

	}

	[students:students]
}
}	
