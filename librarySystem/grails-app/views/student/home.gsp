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
		
				<h3>Book Reviews</h3>

		<p>Click on the link below to view or create a review for one of our books.</p>

			<button type="button" class="btn btn-success">
				<g:link controller="bookReview" action="create">Book Reviews</g:link>
			</button>
		</div>
		
		<div class="first">
		
				<h3>Book Details</h3>

		<p>Click on the link below to view details of every book within the library system.</p>

			<button type="button" class="btn btn-success">
				<g:link controller="book" action="index">Book Details</g:link>
			</button>
		</div>

		<div class="second">
		
				
		
				<h3>Book Search (This doesn't work)</h3>

		<p>Click on the link below to search for specific books within out database</p>

			<button type="button" class="btn btn-success">
				<g:link controller="book" action="advSearch">Book Search</g:link>
			</button>
		</div>

		<div class="first">

				<h3>Book XML Search</h3>

		<p>Click on the link below to see a list of all of the books in our database.</p>

			<button type="button" class="btn btn-success">
				<g:link controller="book" action="show">Book List</g:link>
			</button>

		</div>

</div>


</div>
</body>
</html>
