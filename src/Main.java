public class Main {

    public static void main(String[] args) {
        String[] name = new String[3];
        name[0] = "Валера";
        name[1] = "Алежа";
        name[2] = "Саня";


        for (String u : name) {


            switch (u) {
                case "Валера":
                    System.out.println("Доброе утро " + u  );
                    break;
                case "Алежа":
                    System.out.println("Добрый день " + u );
                    break;
                case "Саня":
                    System.out.println("Добрый вечер " + u );
                    break;
            }
        }
    }
}






