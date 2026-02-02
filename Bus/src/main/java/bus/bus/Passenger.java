/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus.bus;

/**
 *
 * @author User
 */
public class Passenger {

    String ticketType;

    Passenger(String ticketType){
        this.ticketType = ticketType;
    }

    String board(){
        return "I board the bus.";
    }

    String identity(){
        return "I am the passenger." + " I pay "+ ticketType + " fee. " + board() ;
    }
}
