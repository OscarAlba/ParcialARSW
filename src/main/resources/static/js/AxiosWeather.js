/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function getWeather(city) {
    weather= {};
    axios.get("/weather/daily/"+ $("#inputShare").val())
            .then(function (response) {
                weather = response.data;
                console.log(weather);
                $("#name").text("Name : "+ weather.name);
                $("#time").text("Time of data calculation : "+ weather.dt);
                $("#pressure").text("Atmospheric pressure : "+ weather.main.pressure);
                $("#temp").text(" Temperature : "+ weather.main.temp);
                $("#humidity").text("Humidity, % : "+ weather.main.humidity +"%");
                    
    });
    
    
}