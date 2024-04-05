import java.util.ArrayList;
import java.util.List;

class Hotel {

    String hotelName;
    long pricePerNight;
    int discountPercent;
    double ratingOutof5;
    boolean seaView;
    boolean swimmingPool;
    boolean petsAllowed;
    boolean complementaryBreakfast;
    boolean complementaryDinner;

    public Hotel(String hotelName, long pricePerNight, int discountPercent, double ratingOutof5,
        boolean seaView, boolean swimmingPool, boolean petsAllowed, boolean complementaryBreakfast,
        boolean complementaryDinner
    ) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.discountPercent = discountPercent;
        this.ratingOutof5 = ratingOutof5;
        this.seaView = seaView; 
        this.swimmingPool = swimmingPool;
        this.petsAllowed = petsAllowed;
        this.complementaryBreakfast = complementaryBreakfast;
        this.complementaryDinner = complementaryDinner;
    }

    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public long getPricePerNight() {
        return pricePerNight;
    }
    public void setPricePerNight(long pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
    public int getDiscountPercent() {
        return discountPercent;
    }
    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }
    public double getRatingOutof5() {
        return ratingOutof5;
    }
    public void setRatingOutof5(double ratingOutof5) {
        this.ratingOutof5 = ratingOutof5;
    }
    public boolean isSeaView() {
        return seaView;
    }
    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }
    public boolean isSwimmingPool() {
        return swimmingPool;
    }
    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }
    public boolean isPetsAllowed() {
        return petsAllowed;
    }
    public void setPetsAllowed(boolean petsAllowed) {
        this.petsAllowed = petsAllowed;
    }
    public boolean isComplementaryBreakfast() {
        return complementaryBreakfast;
    }
    public void setComplementaryBreakfast(boolean complementaryBreakfast) {
        this.complementaryBreakfast = complementaryBreakfast;
    }
    public boolean isComplementaryDinner() {
        return complementaryDinner;
    }
    public void setComplementaryDinner(boolean complementaryDinner) {
        this.complementaryDinner = complementaryDinner;
    }

    @Override
    public String toString() {
        return "Hotel [hotelName=" + hotelName + ", pricePerNight=" + pricePerNight + ", discountPercent="
                + discountPercent + ", ratingOutof5=" + ratingOutof5 + ", seaView=" + seaView + ", swimmingPool="
                + swimmingPool + ", petsAllowed=" + petsAllowed + ", complementaryBreakfast=" + complementaryBreakfast
                + ", complementaryDinner=" + complementaryDinner + "]";
    }

    public static List<Hotel> basicFilterRating(List<Hotel> hotels) {
        List<Hotel> newList = new ArrayList<>();
        for(Hotel hotel : hotels) {
            if(hotel.ratingOutof5>=3.0) {
                newList.add(hotel);
            }
        }
        return newList;
    }

    public static List<Hotel> basicFilterPets(List<Hotel> hotels) {
        List<Hotel> newList = new ArrayList<>();
        for(Hotel hotel : hotels) {
            if(hotel.isPetsAllowed()) {
                newList.add(hotel);
            }
        }
        return newList;
    }

    
    
}