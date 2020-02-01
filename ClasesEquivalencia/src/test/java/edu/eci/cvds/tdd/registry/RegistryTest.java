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
    public void isNotAlive() {
    	Person prueba = new Person("Henry",154616,25,Gender.MALE,false,false);
    	 RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.DEAD, result);
    }

    // TODO Complete with more test cases
}