public class Test_Cylinder {
   public static void main(String[] args) {
     Circle cir=new Circle(1.0,"Green");
        Cylinder cy=new Cylinder(2.0);
        

        System.out.println("***********Circle Details*******************");
        System.out.println(" Circle Details is "+cir.toString());
        System.out.println("Area:"+cir.getArea());


        System.out.println("**********Cylinder Details*****************");
        System.out.println("Cylinder Details is "+ cy.toString());
        System.out.println("Volume:"+cy.getVolume());
   } 
}
