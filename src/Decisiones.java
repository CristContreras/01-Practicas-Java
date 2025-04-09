public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan=true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if(fechaDeLanzamiento>=2022){
            System.out.println("Peliculas más populares");
        }else{
            System.out.println("Peliculas Retro que aun valen la pena ver");
        }
        //control + barra (/)  para comentar
        if(incluidoEnElPlan || tipoPlan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        }else{
            System.out.println("Película no disponible para su plan actual");
        }
    }
}
