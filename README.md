
# Bookstore Web App 

CRUD Bookstore web app that uses Servlets + JDBC + MySQL + JSP.     
Based off of this tutorial: https://www.codejava.net/coding/jsp-servlet-jdbc-mysql-create-read-update-delete-crud-example


# Problems with tutorial

    1. Old MySQL Maven dependancy (says 5.1 instead of 8.0)
    2. URLs wouldn't work because path was /Bookstore/new instead of just /new

# Improvements 

    1. Fixed Problems
    2. Added a "Hardcover" button
    3. Removed Title as a unique key, so multiple books of the same title can be added.
        a. Now a book is considered "unique" by its title, author, AND hardcover book status. 
    4. Prevented empty strings to be input for author and title fields.
        a. Created a custom error message to handle empty string exception. 
## Roadmap

- Create a login screen
- Store usernames & salted passwords into a new MySQL table
- Create a new web page to "buy" books with fake currency
- Force atomic transactions
- Host web app on AWS


