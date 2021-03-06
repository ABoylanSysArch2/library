package com.library

class LibrarySystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

def loginToggle = {

	out << "<div style='margin: 15px 0 40px;'>"
	if(request.getSession(false) && session.user){
	out << "<span style='float:left;margin-left:15px'>"
	//out << "Welcome ${session.user.name}." //outputs the users actual name as defined in the domain class
	out << "</span><span style='float:right;margin-right:15px'>"
	out << "<a href='${createLink(controller:'librarian',action:'logout')}'>"
	out << "Logout</a></span>"
 } else{
	out << "<span style='float:right;margin-right:10px'>"
	out << "<a href='${createLink(controller:'librarian',action:'login')}'>"
	out << "Login </a></span>"
	}
	out << "</div><br/>"
	}


def studentloginToggle = {

	out << "<div style='margin: 15px 0 40px;'>"
	if(request.getSession(false) && session.user){
	out << "<span style='float:left;margin-left:15px'>"
	out << "Welcome ${session.user.name}." //outputs the users actual name as defined in the domain class
	out << "</span><span style='float:right;margin-right:15px'>"
	out << "<a href='${createLink(controller:'student',action:'logout')}'>"
	out << " </a></span>"
 } else{
	out << "<span style='float:right;margin-right:10px'>"
	out << "<a href='${createLink(controller:'student',action:'studentlogin')}'>"
	out << "Student Login </a></span>"
	}
	out << "</div><br/>"
	}

}
