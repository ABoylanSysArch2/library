package com.ABoylan
import grails.converters.*

class BookController {
static allowedMethods = [index:"GET",show:"GET"]

    def scaffold = Book

def index(Book book){

	render Book.list()as XML

}

def show(Book book){

	if (params.id && Book.exists(params.id)){

		render Book.findById(params.id) as XML

	}

	else{

		render Book.list() as XML

	}

}


	def advSearch(){

}

def advResults(){



def bookProps = Book.metaClass.properties*.title

def books = Book.withCriteria{

	"${params.queryType}"{

		params.each {field, value ->

			if (bookProps.grep(field) && value){

				ilike(field, value)

				}

			}

		}

	}

	[books:books]
}


}
