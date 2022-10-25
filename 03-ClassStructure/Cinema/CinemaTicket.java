public class CinemaTicket {
    static String cinema_name;
    String film_title;
    int row;
    int seat;
    double price;
    
    public void displayData(){
        System.out.println("Cinema name: " + cinema_name + "\nFilm title: " + film_title + "\nRow: " + row + "\nSeat: " + seat + "\nPrice: " + String.valueOf(price) + "$");
    }
    
    public CinemaTicket(String film_title, int row, int seat){
        if (row <= 2) {
            this.price = 10.00;
        } else {
            this.price = 25.00;
        }
        this.film_title = film_title;
        this.row = row;
        this.seat = seat;
    }
    
    public static void main(String[] args){
        
        CinemaTicket ticket1 = new CinemaTicket("Pulp fiction", 2, 13);
        CinemaTicket ticket2 = new CinemaTicket("Fast and Furious", 6, 4);
        
        cinema_name = "Cinema City";

        ticket1.displayData();
        System.out.println("\n----------------------------\n");
        ticket2.displayData();
        System.out.println("\n----------------------------\n");
    }
}