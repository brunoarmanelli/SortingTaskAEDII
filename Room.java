class Room {
    int roomID; // Key
    int hostID;
    String roomType;
    String country;
    String city;
    String neighborhood;
    int reviews;
    double overallSatisfaction;
    int accommodates;    
    double bedrooms;
    double price;
    String propertyType;

    public Room () {

    }

    public Room (String line) {
        parseLine(line);
    }

    public void parseLine(String line) {

        String[] tempData = line.split("	");
        int i = 0;
        
        this.roomID = Integer.parseInt(tempData[i++]);
        this.hostID = Integer.parseInt(tempData[i++]);
        this.roomType = tempData[i++];
        this.country = tempData[i++];
        this.city = tempData[i++];
        this.neighborhood = tempData[i++];
        this.reviews = Integer.parseInt(tempData[i++]);
        this.overallSatisfaction = Double.parseDouble(tempData[i++]);
        this.accommodates = Integer.parseInt(tempData[i++]);  
        this.bedrooms = Double.parseDouble(tempData[i++]);
        this.price = Double.parseDouble(tempData[i++]);
        this.propertyType = tempData[i++];
    }

    public void print() {
        System.out.println("--------- ROOM DATA ---------");
        System.out.println("Room ID: " + roomID);
        System.out.println("Host ID: " + hostID);
        System.out.println("Room Type: " + roomType);
        System.out.println("Country: " + country);
        System.out.println("City: " + city);
        System.out.println("Neighborhood: " + neighborhood);
        System.out.println("Reviews: " + reviews);
        System.out.println("Overall Satisfaction: " + overallSatisfaction);
        System.out.println("Accommodates: " + accommodates);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Price: " + price);
        System.out.println("Property Type: " + propertyType);
        System.out.println("--------- ROOM DATA ---------");
    }

    public String dataInLine() {
        String dataLine = "";

        dataLine += roomID + "\t";
        dataLine += hostID + "\t";
        dataLine += roomType + "\t";
        dataLine += country + "\t";
        dataLine += city + "\t";
        dataLine += neighborhood + "\t";
        dataLine += reviews + "\t";
        dataLine += overallSatisfaction + "\t";
        dataLine += accommodates + "\t";
        dataLine += bedrooms + "\t";
        dataLine += price + "\t";
        dataLine += propertyType + "\t";

        return dataLine;
    }
}