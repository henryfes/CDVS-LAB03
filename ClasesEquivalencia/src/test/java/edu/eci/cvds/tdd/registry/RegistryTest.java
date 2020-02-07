package edu.eci.cvds.tdd.registry;


import org.junit.Assert;
import org.junit.Test;



public class RegistryTest {
	public RegistryTest(){
		super();
	}

    private Registry registry = new Registry();
    
    /**
     * La prueba reciber valores validos y la persona puede votar
     */
    @Test 
    public void deberiaSerValido() {
    	Person prueba = new Person("Henry",154616,25,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    /**
     * La prueba debe dar que la persona es militar(el militar no puede votar)
     */
    @Test
    public void Militar() {
    	Person prueba = new Person("Henry",154616,25,Gender.MALE,true,true);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.MILITAR, result);
    }
    
    /**
     * La prueba debe dar que la persona es menor de edad y por lo tanto no puede votar
     */
    @Test
    public void MenorEdad() {
    	Person prueba = new Person("Henry",154616,15,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    /**
     * La prueba debe dar que la edad es invalida porque en este caso es 500
     */
    @Test
    public void edadInvalida() {
    	Person prueba = new Person("Henry",154616,500,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    /**
     * La prueba debe dar que el la edad no es validad porque tiene 123 años
     */
    @Test
    public void RangoEdadMayorNoAceptada() {
    	Person prueba = new Person("Henryfe",1546163,123,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    /**
     * La prueba debe debe dar valido ya que su edad es 122 que es la maxima aceptada
     */
    @Test
    public void RangoEdadMayorAceptada() {
    	Person prueba = new Person("Verbo",3506163,122,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    /**
     * La prueba debe debe dar valido ya que su edad es 121 
     */
    @Test
    public void RangoEdadMayorAceptadaAnterior() {
    	Person prueba = new Person("Yeison",65461343,121,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    /**
     * La prueba debe dar que la persona es menor de edad porque es 1
     */
    @Test
    public void RangoEdadPositiva() {
    	Person prueba = new Person("Yesid",55461343,1,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    /**
     * La prueba debe que la edad es invalida ya que es de 0
     */
    @Test
    public void edadZero() {
    	Person prueba = new Person("Manuel",45461343,0,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    /**
     * La prueba debe dar edad invalida porque es -1
     */
    @Test
    public void RangoEdadNegativa() {
    	Person prueba = new Person("Sebastian",25461343,-1,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    /**
     * la prueba debe dar que esta muerto porque es falso el parametro
     */
    @Test
    public void isNotAlive() {
    	Person prueba = new Person("Einstein",154616,25,Gender.MALE,false,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.DEAD, result);
    }

    // TODO Complete with more test cases
}