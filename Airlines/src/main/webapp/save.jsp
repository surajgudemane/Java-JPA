<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Page</title>
</head>
<body>
	<form action="/save" method="post" style="text-align: center;">
            <h3 style="color: orangered;">Save Your Airlines Details here</h3>
             <div>
                  Airline Name  
                  <input type="text" name = "airlineName">  
             </div>
             <div>
                  Country  
                  <input type="text" name = "country">  
             </div>
             <div>
                  Travels  
                  <input type="text" placeholder="From" name = "from">  
             </div>
             <div>
                       
                  <input type="text" placeholder="To" name = "to">  
             </div>
             <div>
                  Poilet  
                  <input type="text" name = "poilet">  
             </div>  
             <div>
                  <label>Total Passangers</label>  
                  <input type="number" name = "passangers">
             </div> 
             <div>
                  Total Crew  
                  <input type="number" name = "crew">  
             </div>
           
            <h4 style="color: orange;">Ticket Price</h4>
             <div>
                  Business  
                  <input type="number" name = "businessTicket">  
             </div>
             <div>
                  Premium Economy  
                  <input type="number" name = "premiumEconomyTicket">  
             </div>
             <div>
                  Economy  
                  <input type="number" name = "economy">  
             </div>
             <div>
                  First Class  
                  <input type="number" name = "firstClassTicket">  
             </div>
             <div>
                  <button type="submit">Submit/Save</button>  
            
                  <button type="submit">Reset</button>  
             </div>
        
        </form>
</body>
</html>