public class HotelFilterCompBreakfast implements HotelFilterPredicate{

    @Override
    public boolean filterCriteria(Hotel hotel) {
        return hotel.isComplementaryBreakfast();
    }

    
    
}
