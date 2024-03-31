public class EDOutput1 {
    public static void main(String [] args) {
        boolean data = false;
        try {
            while (data) {
                if (data) {
                    System.out.println("If blocks run");
                } else {
                    System.exit(0);
                }
            }
        }
        finally{
                System.out.println("finally blocks run");
            }

        }

}
