/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus.bus;

/**
 *
 * @author jamer
 */
public class Engine {

    String fuelType;

    Engine(String fuelType){
        this.fuelType = fuelType;
    }

    String startEngine(){
        return "I have started and I am ready to accelerate.";
    }

    String identity(){
        return "I am the Engine. " + fuelType +" is my fuel type. " + startEngine();
    }
}
