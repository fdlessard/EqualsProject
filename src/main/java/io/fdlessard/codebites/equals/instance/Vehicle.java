package io.fdlessard.codebites.equals.instance;

import java.io.Serializable;

public class Vehicle implements Serializable{

     private String vehicleIdentificationNumber;

     private String manufacturer;

     private String color;

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (!(o instanceof Vehicle)) return false;

          Vehicle vehicle = (Vehicle) o;

          if (vehicleIdentificationNumber != null ? !vehicleIdentificationNumber.equals(vehicle.vehicleIdentificationNumber) : vehicle.vehicleIdentificationNumber != null)
               return false;
          if (manufacturer != null ? !manufacturer.equals(vehicle.manufacturer) : vehicle.manufacturer != null)
               return false;
          return color != null ? color.equals(vehicle.color) : vehicle.color == null;
     }

     @Override
     public int hashCode() {
          int result = vehicleIdentificationNumber != null ? vehicleIdentificationNumber.hashCode() : 0;
          result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
          result = 31 * result + (color != null ? color.hashCode() : 0);
          return result;
     }
}
