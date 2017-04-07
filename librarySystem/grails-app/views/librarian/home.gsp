<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to SHU Library</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    

    <div id="content" role="main">

	<div class="row">


		<div class="second">
		
				<h3>Librarian Enrolment</h3>

		<p>Click on the link below to view or make changes to the librarians that appear in our database.</p>

			<button type="button" class="btn btn-success">
				<g:link controller="librarian" action="create">Librarians</g:link>
			</button>
		</div>
		
		<div class="first">
		
				<h3>Course Management</h3>

		<p>Click on the link below to view or make changes to the courses that appear in our database.</p>

			<button type="button" class="btn btn-success">
				<g:link controller="course" action="create">Courses</g:link>
			</button>
		</div>

		<div class="second">
		
				<h3>Student Enrolment</h3>

		<p>Click on the link below to view or make changes to the students that appear in our database.</p>

			<button type="button" class="btn btn-success">
				<g:link controller="student" action="create">Students</g:link>
			</button>
		</div>

		

		<div class="second">
		
				<h3>Book Managment</h3>

		<p>Click on the link below to view or make changes to the books that appear in our database.</p>

			<button type="button" class="btn btn-success">
				<g:link controller="book" action="create">Books</g:link>
			</button>
		</div>

				<div class="first">
		
				<h3>Student Search</h3>

		<p>Click on the link below to search for specific students within out database</p>

			<button type="button" class="btn btn-success">
				<g:link controller="student" action="advSearch">Student Search</g:link>
			</button>
		</div>

				
		</div>

	</div>
	</div>
</body>
</html>	
