# api-hospital
creacion api para la gestion de citas de pacientes

Las tablas e crean automaticamnete una vez se arranca el proyecto

poblar información tablas especialidades y tipo usuarios,
esto se encuentran en la coleccion de postman, 
el archivo se llama api-hospital.postman_collection.json y se encuentra en el directorio principal
para cargar la colleccion se debe abrir postman y en la pestaña file/import/ se importa el archivo
los endopoins para poblar las tablas son:
guardar especialidades y guardar tipos usuario.
ya despues de esto se puede registrar usuario y agendar citas asi como consultar cita por id.

para ver la documentacion de los servicios se incorporo swagger 3,
lo que se debe hacer es correr el servicio y abrir el siguiente link: http://localhost:8081/swagger-ui.html

