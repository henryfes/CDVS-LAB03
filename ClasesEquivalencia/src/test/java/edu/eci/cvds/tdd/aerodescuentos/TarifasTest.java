package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;


public class TarifasTest {
	private CalculadorDescuentos calcu = new CalculadorDescuentos();
	/**
	 * La prueba debe dar 200 ya que la tarifa es 200 y no tiene descuento
	 */
	@Test
	public void deberiaSerValidoSinDescuento() {
		Assert.assertEquals(200.0,(calcu.calculoTarifa(200,1,18)),0.0);
		Assert.assertEquals(200.0,(calcu.calculoTarifa(200,20,65)),0.0);
	}
	/**
	 * La prueba debe dar un descuento de 5% 
	 */
	@Test
	public void deberiaValidoDescuentoEdadMenor(){
		Assert.assertEquals(190.0,(calcu.calculoTarifa(200, 1, 1)),0.0);
	}
	/**
	 * la prueba  dar un descuento del 8% a la tarifa por la edad mayor a 65
	 */
	@Test
	public void deberiaSerValidoDescuentoEdadMayor() {
		Assert.assertEquals(184.0,(calcu.calculoTarifa(200,1,66)),0.0);
		Assert.assertEquals(200.0,(calcu.calculoTarifa(200,20,122)),0.0);
	}
	
	/**
	 * La prueba dar un descuento del 15% a la tarifa por mas de 20 dias de anticipación
	 */
	@Test
	public void deberiaSerValidoDescuentoDeDias() {
		Assert.assertEquals(170.0,(calcu.calculoTarifa(200,21,18)),0.0);
		Assert.assertEquals(170.0,(calcu.calculoTarifa(200,21,65)),0.0);
	}
	
	/**
	 * La prueba deberia dar un descuento del 20% a a la tarifa por la edad menor y mas de 20 dias de anticipación
	 */
	@Test
	public void deberiaSerValidaDescuentoEdadMenorYDias() {
		Assert.assertEquals(160.0,(calcu.calculoTarifa(200,21,1)),0.0);
		Assert.assertEquals(160.0,(calcu.calculoTarifa(200,30,17)),0.0);
	}
	
	/**
	 * La prueba deberia dar un descuento del 23% a la tarifa por la edad mayor y mas de 20 dias de anticipacion
	 */
	@Test
	public void deberiaSerValidoDescuentoEdadMayorYDias() {
		Assert.assertEquals(154.0,(calcu.calculoTarifa(200,21,122)),0.0);
		Assert.assertEquals(154.0,(calcu.calculoTarifa(200,31,66)),0.0);
	}
	
	/**
	 * La prueba deberia ser invalida por que la edad no se encuentra en los limites establecidos
	 */
	@Test
	public void deberiaSerInvalidoPorEdad() {
		Assert.assertNotEquals(0.0,(calcu.calculoTarifa(200,21,-1)),0.0);
		Assert.assertNotEquals(0.0,(calcu.calculoTarifa(200,31,0)),0.0);
		Assert.assertNotEquals(0.0,(calcu.calculoTarifa(200,21,123)),0.0);
	}
	
	/**
	 * La prueba deberia ser invalida porque la tarifa es igual o menor que cero 
	 */
	@Test
	public void deberiaSerInvalidoPorTarifa() {
		Assert.assertNotEquals(100.0,(calcu.calculoTarifa(-1,1,1)),0.0);
		Assert.assertNotEquals(100.0,(calcu.calculoTarifa(0,1,1)),0.0);
	}
	
	/**
	 * la prueba deberia ser invalida porque los dias son menores o iguales a cero
	 */
	@Test
	public void deberiaSerInvalidoPorDias() {
		Assert.assertNotEquals(0.0,(calcu.calculoTarifa(200,-1,1)),0.0);
		Assert.assertNotEquals(0.0,(calcu.calculoTarifa(200,0,1)),0.0);
	}
}
