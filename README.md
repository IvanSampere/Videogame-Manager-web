# GestorVideojuego
Exercise of creating a videogame manager
This personal project (and the first project) has the function to add diferents part into a 
invented game. You can add characters, habilities, three types of items, zones and misions.
The first page is a login page, where you can login a register a user. All of the components 
are saved into a h2 database. In "imports.sql" you have a few examples to imports to the database.
This exercise is based in Java, with the framework Spring; and use HTML5 for the templates and few 
thing in CSS3





To send a email when is registered a person in the web uncomment the lines in the gestor controller:


    //    SimpleMailMessage message = new SimpleMailMessage();


    //		message.setTo(user.getEmail());


    //		message.setSubject("Test email");


    //		message.setText("Congratulations, you succesfully registered!!.");


    //		mailsender.send(message);




And change a properties on the file aplication.properties in the resources:


    spring.mail.username= PUT A REAL EMAIL
  
  
    spring.mail.password= PUT A REAL PASSWORD 
