public class Car {
   private String make = "Tesla";   //fields and state/attributes
   private String model = "Model X";
   private String color = "Gray";
   private int doors = 2;
   private boolean convertible = true;

   public String getMake() { // coding our getters to use since fields are set to private
      return make;
   }

   public String getModel() {
      return model;
   }

   public String getColor() {
      return color;
   }

   public int getDoors() {
      return doors;
   }

   public boolean isConvertible() {
      return convertible;
   }


   public void setMake(String make) {
      if(make === null) make = "Unknown";
      String lowercase = make.toLowerCase();

      switch(lowercase){
         case "holden", "porche", "telsa" -> this.make = make; //validation for 3 manufacturers
         default -> {
            this.make = "Unsupported";
         }
      }

   }

   public void setModel(String model) {
      this.model = model;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public void setDoors(int doors) {
      this.doors = doors;
   }

   public void setConvertible(boolean convertible) {
      this.convertible = convertible;
   }






   public void describeCar() {  //Class method
       System.out.println(doors + "-Door" +
               color + " " +
               make  +  " " +
               model + "  " +
               (convertible ? "convertible": ""));
   }

}
