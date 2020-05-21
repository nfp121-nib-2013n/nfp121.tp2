package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author Agatha Khairallah
 * @version 1.0
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        int fahrenheit = 0;
        double celsius = 0.0;
        
        // En utilisant foreach
        for (String fahrenheitTemperature : args) {
            fahrenheit = Integer.parseInt(fahrenheitTemperature);
            celsius = fahrenheitEnCelsius(fahrenheit);
            
            System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); 
        }   
        
        /*
         * // En utilisant une simple boucle for
         * for (int i = 0; i < args.length; i += 1) {
         *     fahrenheit = Integer.parseInt(args[i]);
         *     celsius = fahrenheitEnCelsius(fahrenheit);
         *     System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
         *  }
         */
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    
    /*
     * Un problème a lieu au niveau des entiers ayant
     * une grande valeur. En utilisant un float, la 
     * valeur n'est pas précise. Afin de résoudre ce problème,
     * on peut utiliser le double.
     * Prenons un exemple pour montrer la différence: 
     * "2000000000°F -> 214748368.0°C" (En utilisant le float)
     * "2000000000°F -> 1111111093.3°C" (En utilisant le double)
     */
    public static double fahrenheitEnCelsius(int f) {
        double celsiusTemperature = (((double)5)/((double)9))*(f - 32);
        celsiusTemperature = ((long)(celsiusTemperature * 10))/10.0;
        
        return celsiusTemperature;
    }

}
