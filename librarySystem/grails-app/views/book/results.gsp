<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SHU Library - Simple Book Search</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

	<div class="row">

		<h1>SHU Library Book Search System</h1>

	<h3> Search Results</h3>

	<p>

		Search ${totalBooks} records

		for items matching <em>${term}</em>

		Found <strong>${books.size()}</strong>books.

	</p>

	<ul>

		<g:each var="books" in="${books}">

		<li><g:link controller="book" action="show"

	id="${book.id}">${book.title}</g:link></li>

		</g:each>

		</ul>

	<button type="button" class="btn btn-success">

		<g:link action='search'>Search Again</g:link>

	</button>

	</div>

</body>

</html>
