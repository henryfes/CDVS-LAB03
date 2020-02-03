package edu.eci.cvds.tdd.registry;


import org.junit.Assert;
import org.junit.Test;



public class RegistryTest {
	public RegistryTest(){
		super();
	}

    private Registry registry = new Registry();

    @Test
    public void Bien() {
    	Person prueba = new Person("Henry",154616,25,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void Militar() {
    	Person prueba = new Person("Henry",154616,25,Gender.MALE,true,true);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.MILITAR, result);
    }
    
    @Test
    public void MenorEdad() {
    	Person prueba = new Person("Henry",154616,15,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void edadInvalida() {
    	Person prueba = new Person("Henry",154616,500,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void Rango() {
    	Person prueba = new Person("Henry",1546163,123,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void RangoEdadMayorAceptada() {
    	Person prueba = new Person("Verbo",3506163,122,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void RangoEdadMayorAceptadaAnterior() {
    	Person prueba = new Person("Yeison",65461343,121,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void RangoEdadPositiva() {
    	Person prueba = new Person("Yesid",55461343,1,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void edadZero() {
    	Person prueba = new Person("Manuel",45461343,0,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void RangoEdadNegativa() {
    	Person prueba = new Person("Sebastian",25461343,-1,Gender.MALE,true,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    
    @Test
    public void isNotAlive() {
    	Person prueba = new Person("Henry",154616,25,Gender.MALE,false,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.DEAD, result);
    }

    // TODO Complete with more test cases
}