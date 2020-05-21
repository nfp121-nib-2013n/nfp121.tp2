package question2;


/**
 * Classe-test FahrenheitCelsiusTest.
 *
 * @author  (votre nom)
 * @version (un num�ro de version ou une date)
 *
 * Les classes-test sont document�es ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont bas�es sur le document � 2002 Robert A. Ballance intitul�
 * �JUnit: Unit Testing Framework�.
 *
 * Les objets Test (et TestSuite) sont associ�s aux classes � tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le m�me paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque m�thode Test � ex�cuter.  Il peut y avoir
 * plus d'une m�thode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ d�couvrira automatiquement (par introspection) les m�thodes
 * Test de votre classe Test et g�n�rera la TestSuite cons�quente.
 * Chaque appel d'une m�thode Test sera pr�c�d� d'un appel de setUp(),
 * qui r�alise les engagements, et suivi d'un appel � tearDown(), qui les
 * d�truit.
 */
public class FahrenheitCelsiusTest extends junit.framework.TestCase
{
    // D�finissez ici les variables d'instance n�cessaires � vos engagements;
    // Vous pouvez �galement les saisir automatiquement du pr�sentoir
    // � l'aide du menu contextuel "Pr�sentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du pr�sentoir (les objets sans constructeur, comme int, float, etc.).

    /**
     * Constructeur de la classe-test FahrenheitCelsiusTest
     */
    public FahrenheitCelsiusTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * M�thode appel�e avant chaque appel de m�thode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements

    }

    /**
     * Supprime les engagements
     *
     * M�thode appel�e apr�s chaque appel de m�thode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        //Lib�rez ici les ressources engag�es par setUp()
    }

    /**
     * Il ne vous reste plus qu'� d�finir une ou plusieurs m�thodes de test.
     * Ces m�thodes doivent v�rifier les r�sultats attendus � l'aide d'assertions
     * assertTrue(<boolean>).
     * Par convention, leurs noms devraient d�buter par "test".
     * Vous pouvez �baucher le corps gr�ce au menu contextuel "Enregistrer une m�thode de test".
     */
    public void test_fahrenheitEnCelsius() {
        assertEquals("    38 �F -> 3.3 �C ? ", 3.3, question2.FahrenheitCelsius.fahrenheitEnCelsius(38), 0.1);
        assertEquals("  163 �F -> 72.7 �C ? ", 72.7, question2.FahrenheitCelsius.fahrenheitEnCelsius(163), 0.1);
        assertEquals(" 305 �F -> 151.6 �C ?", 151.6, question2.FahrenheitCelsius.fahrenheitEnCelsius(305), 0.1);
        assertEquals("   418 �F -> 214.4 �C ?", 214.4, question2.FahrenheitCelsius.fahrenheitEnCelsius(418), 0.1);
    }
    
    // Un test pour les entiers n�gatifs
    public void test_fahrenheitEnCelsiusNegatif() {
        assertEquals("    -8 �F -> -22.2 �C ? ", -22.2, question2.FahrenheitCelsius.fahrenheitEnCelsius(-8), 0.1);
        assertEquals("    -91 �F -> -68.3 �C ? ", -68.3, question2.FahrenheitCelsius.fahrenheitEnCelsius(-91), 0.1);
    }
    
    // Un test pour les grands entiers  
    public void test_fahrenheitEnCelsiusEntier() {
        assertEquals("    2055349852 �F -> 1141861011.1 �C ? ", 1141861011.1, question2.FahrenheitCelsius.fahrenheitEnCelsius(2055349852), 0.1);
        assertEquals("    2143879068 �F -> 1191043908.8 �C ? ", 1191043908.8, question2.FahrenheitCelsius.fahrenheitEnCelsius(2143879068), 0.1);
    }
    
    // Un test pour s'assurer que le signe de la temp�rature est correcte
    public void test_fahrenheitEnCelsiusSigne() {
        assertTrue("La temp�rature en �C  de 32 �F est z�ro ? ", question2.FahrenheitCelsius.fahrenheitEnCelsius(32) == 0);
        assertTrue("La temp�rature en �C  de 3 �F est n�gative ? ", question2.FahrenheitCelsius.fahrenheitEnCelsius(3) < 0 );
        assertTrue("La temp�rature en �C  de 70 �F est positive ? ", question2.FahrenheitCelsius.fahrenheitEnCelsius(70) > 0 );
    }
}
