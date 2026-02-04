package com.workshoponjava8features.smartcitytransportandservicemanagementsystem;

class MetroService implements TransportService {

    private String route;
    private double fare;
    private String departure;

    public MetroService(String route, double fare, String departure) 
    {
        this.route = route;
        this.fare = fare;
        this.departure = departure;
    }

    public String getServiceName() 
    { 
    	return "Metro"; 
    }
    public double getFare() 
    { 
    	return fare; 
    }
    public String getRoute() 
    { 
    	return route; 
    }
    public String getDepartureTime() 
    { 
    	return departure; 
    }
}
