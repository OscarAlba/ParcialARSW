# ParcialARSW

heroku link: https://parcial-arsw.herokuapp.com/

La aplicacion es un RestAPI, el cual solo sirve como mediador debido a que no realiza ninguna acción con la informacion que
obtiene mediante la API(OpenWeather), y la envia a la vista del cliente mediante axios.


Si deseamos que otra API diferente nos entregue los resultados del clima solo debemos crear una nueva clase la cual implemente
los metodos de la clase ClimaPersistence y se le coloca la anotacion de que ahora esa clase sera un Service.

El diseño de la aplicacion se basa en MVC (Model,View, Controller) ahora no tenemos un modelo a seguir entonces se omite en este caso, el controlador esta compuesto por Servicios y Persistencia, la cual garantiza extensibilidad de la misma. Los servicios son los que el controlador va a prestar y la persistencia es la guia para que las distintas API's que se conecten deben seguir. Y la vista es la que el cliente ve y puede interactuar con ella, mediante javaScript se obtiene la información del controlador.

