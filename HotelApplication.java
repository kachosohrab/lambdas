import java.util.ArrayList;
import java.util.List;

class HotelApplication {

    public static void main(String[] args) {
        List<Hotel> hotels = new ArrayList<>();
        getAllHotels(hotels);
        //filter hotels here
        List<Hotel> filteredHotels = basicFilter(hotels);
        printHotels(filteredHotels);
    }

    static List<Hotel> basicFilter(List<Hotel> hotels) {
        return Hotel.basicFilterRating(hotels);
    }

    static void printHotels(List<Hotel> hotels) {
        System.out.println("The filtered hotels are:");
        int count = 0;
        for(Hotel hotel : hotels) {
            System.out.println(count++ + " = " +hotel);
        }
        System.out.println("===========================================================");
    }

    static void getAllHotels(List<Hotel> hotels) {
        hotels.add(new Hotel("Bombay Retreat", 10000, 0, 4.0, true, true, true, true, true));
        hotels.add(new Hotel("Kerala Resort", 7000, 5, 4.5, true, true, true, true, true));
        hotels.add(new Hotel("Vizag Garden", 5000, 0, 3.9, false, true, false, true, false));
        hotels.add(new Hotel("Ladakh Suites", 6500, 25, 3.9, true, false, true, false, true));
        hotels.add(new Hotel("Purple Pune", 4320, 0, 3.5, false, false, true, true, true));
        hotels.add(new Hotel("Grand Apple", 4000, 10, 4.9, true, true, true, false, false));
        hotels.add(new Hotel("Goa Garden", 9500, 0, 4.9, true, true, true, true, false));
        hotels.add(new Hotel("Shillong Haven", 5600, 0, 3.7, false, true, true, true, true));
        hotels.add(new Hotel("Pune Trails", 2000, 20, 3.2, false, false, false, false, false));
        hotels.add(new Hotel("Dharamshala Daisies", 1500, 0, 4, true, true, true, true, true));    
        hotels.add(new Hotel("Delhi Lodge", 100, 0, 2.1, false, false, false, false, false));
    }


}