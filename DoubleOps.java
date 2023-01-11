class DoubleOps {
    public static void main(String[] args) {
        System.out.print("The first argument provided was "+ args[0]+ "." + " The second argument provided was "+ args[1]+".");


        Integer.parseInt(args[0]);

        System.out.println(" The first arguments absolute vaule " + Math.abs(Integer.parseInt(args[0])));
        System.out.println("This is the first arguments absolute value, rounded to decimals " + Math.abs(Double.parseDouble(args[0])));
        System.out.println("The first argument will be raised to the power of the second argument " + Math.pow(Double.parseDouble(args[0]),Double.parseDouble(args[1])));
        System.out.println("This returns the square root of the first argument " + Math.sqrt(Integer.parseInt(args[0])));
        System.out.println("This is a random number " + Math.random());
    }
}