// Ex_8_MovieWebService_JSON_Servlet_DAO.js JavasScript code

function getMovieData() {
	var urlString = "http://localhost:8080/First_WebApp_Examples/movieService_JSON";   
    
    var request = new XMLHttpRequest();                    
    request.onreadystatechange = requestListener;     
    request.open("GET", urlString, true);                  
    request.send();                                       

    function requestListener() {
    	
        if (request.readyState === 4  && request.status === 200) {
                
            console.log("The Servlet returned the following JSON text: " + request.responseText);
            showMovieList(request.responseText);
        }
    }
}

// --- This function parses the JSON text and shows the data on the web page.
function showMovieList(jsonText) {

    var jsonObj = JSON.parse(jsonText);   // Here we create a JavaScript object based on the JSON text.
    var movieArray = jsonObj.movies;
    console.log(movieArray);
          
    var outputText = "";
    for(var i = 0; i < movieArray.length; i++) {
     	outputText = outputText + movieArray[i].name +  ", " + 
    		movieArray[i].director + " (" + movieArray[i].year + ")<br />";
    }
    
    document.getElementById("pOutput").innerHTML = outputText;
}

// Call the function getMovieData() when the page is loaded.
(function run() {
	getMovieData();
})();

// End