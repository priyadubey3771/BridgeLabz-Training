package com.workshoponjava8features.smartcitytransportandservicemanagementsystem;

class BusService implements TransportService {

    private String route;
    private double fare;
    private String departure;

    public BusService(String route, double fare, String departure) 
    {
        this.route = route;
        this.fare = fare;
        this.departure = departure;
    }

    public String getServiceName() 
    { 
    	return "Bus";
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
