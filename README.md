# ParcialARSW

heroku link: https://parcial-arsw.herokuapp.com/

La aplicacion es un RestAPI, el cual solo sirve como mediador debido a que no realiza ninguna acción con la informacion que
obtiene mediante la API(OpenWeather), y la envia a la vista del cliente mediante axios.


Si deseamos que otra API diferente nos entregue los resultados del clima solo debemos crear una nueva clase la cual implemente
los metodos de la clase ClimaPersistence y se le coloca la anotacion de que ahora esa clase sera un Service.
