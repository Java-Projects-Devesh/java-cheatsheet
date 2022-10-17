package JavaAdvanced.AbstractClassAndInterface;

//-------------------------------------------------------------------------------

//ShippingService : I am going to provide shipping service to my clients. Need to find some shipping companies
interface ShippingService {
    void ship();
}
//ShippingService : Hi DHL, let's make a contract. I will use you as one of the shipping services for my clients.
class DHL implements ShippingService {
    @Override
    public void ship() {     //DHL : Sure Happy to give you DHL shipping services
        System.out.println("DHL is shipping.");
    }
}

//ShippingService : Hi FEDEX, let's make a contract. I will use you as one of the shipping services for my clients.
class FEDEX implements ShippingService {
    @Override
    public void ship() {  //FEDEX : Sure Happy to give you FEDEX shipping services
        System.out.println("Fedex is shipping"); }
}
//---------------------------------------------------------------------------------

//I am going to provide air-ticket booking service to my clients. Need to find some travel agencies
interface TicketBookingService {
    void bookTicket();
}

//ShippingService : Hi Expedia, let's make a contract. I will use you as one air-ticket services for my clients.
class Expedia implements TicketBookingService {
    @Override
    public void bookTicket() { //Expedia : Sure Happy to give you Expedia air-ticket services
        System.out.println("EXpedia is booking tickets.");
    }
}

//ShippingService : Hi Cheapoair, let's make a contract. I will use you as air-ticket services for my clients.
class Cheapoair implements TicketBookingService { //Cheapoair : Sure Happy to give you Expedia air-ticket services
    @Override
    public void bookTicket() {  //
        System.out.println("Cheapoair is booking tickets.");
    }
}
//---------------------------------------------------------------------------------
class IAmBusiness { //Hi I am a business who needs shipping and ticket booking services
    public void shipStuff(ShippingService shippingService) { //ShippingService : Hi client use me to ship stuff.
        shippingService.ship();
    }
    public void bookTicket(TicketBookingService ticketBookingService){ // TicketBookingService : Hi client use me to book tickets
        ticketBookingService.bookTicket();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        IAmBusiness business = new IAmBusiness(); // I am business and ready to ship and book tickets

        ShippingService dhlService = new DHL(); // ShippingService : Awesome here you go. Use DHL
        business.shipStuff(dhlService);   // Business : Hey not happy with DHL

        ShippingService fedexService = new FEDEX(); // ShippingService : No problem. Please use fedex
        business.shipStuff(fedexService);

        TicketBookingService expediaTravelAgency = new Expedia(); // TicketBookingService : Hi client please use expedia
        business.bookTicket(expediaTravelAgency); // Business : Not happy with expedia

        TicketBookingService cheapoairTravelService = new Cheapoair(); // TicketBookingService : No problem. Please use Cheapoair
        business.bookTicket(cheapoairTravelService);
    }
}
