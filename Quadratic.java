class Quadratic {
    public static void main(String [] args) {
      double a = Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[1]);
      double c = Double.parseDouble(args[2]);
      double d = (-b + Math.sqrt(b*b + -4*a*c))/2*a;
      double e = (-b - Math.sqrt(b*b + -4*a*c))/2*a;
  
      System.out.println("The first answer is " + d );
      System.out.println("The second answer is "+ e);
    }}