public class HotelFilterRating3  implements HotelFilterPredicate{

    @Override
    public boolean filterCriteria(Hotel hotel) {
        return hotel.getRatingOutof5() >= 3;
    }
    
}
