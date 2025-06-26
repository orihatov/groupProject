public class Elevator {
    
    private double whatHeight;
;

    public double getHeight() {
        return whatHeight;
    }

    public boolean isAtTop() { 
        return whatHeight >= 100;
    }
    public boolean isAtBottom() {
         return whatHeight <= 0;
    }
    public void moveUp() {
        System.out.println("Moving up");
       
    }
    public void moveDown() {
        System.out.println("Moving down");
    }
    public void setHeight(double height) {
        if (height < 0 || height > 100) {
            System.out.println("Height must be between 0 and 100");
        }
        else{
            System.out.println("Setting height to " + height);
        }
    }





}
