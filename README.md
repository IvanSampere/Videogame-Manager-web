# GestorVideojuego
Exercise of creating a videogame manager

To send a email when is registered a person in the web uncomment the lines in the gestor controller:


//    SimpleMailMessage message = new SimpleMailMessage();
//		message.setTo(user.getEmail());
//		message.setSubject("Test email");
//		message.setText("Congratulations, you succesfully registered!!.");
//		mailsender.send(message);


And change a properties on the file aplication.properties in the resources:


spring.mail.username=<PUT A REAL EMAIL>
spring.mail.password=<PUT A REAL PASSWORD>
