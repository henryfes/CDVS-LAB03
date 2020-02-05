package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;


public class TarifasTest {
	private CalculadorDescuentos calcu = new CalculadorDescuentos();
	
	@Test
	public void deberiaSerValidoSinDescuento() {
		Assert.assertEquals(200.0,(calcu.calculoTarifa(200,1,18)),0.0);
		Assert.assertEquals(200.0,(calcu.calculoTarifa(200,20,65)),0.0);
	}
	
	@Test
	public void deberiaValidoDescuentoEdadMenor(){
		Assert.assertEquals(190.0,(calcu.calculoTarifa(200, 20,17)),0.0);
		Assert.assertEquals(190.0,(calcu.calculoTarifa(200, 1, 1)),0.0);
	}
	
	@Test
	public void deberiaSerValidoDescuentoEdadMayor() {
		Assert.assertEquals(184.0,(calcu.calculoTarifa(200,1,66)),0.0);
		Assert.assertEquals(184.0,(calcu.calculoTarifa(200,20,122)),0.0);
	}
	
	@Test
	public void deberiaSerValidoDescuentoDeDias() {
		Assert.assertEquals(170.0,(calcu.calculoTarifa(200,21,18)),0.0);
		Assert.assertEquals(170.0,(calcu.calculoTarifa(200,21,65)),0.0);
	}
	
	@Test
	public void deberiaSerValidoDescuentoEdadMenorYDias() {
		Assert.assertEquals(160.0,(calcu.calculoTarifa(200,21,1)),0.0);
		Assert.assertEquals(160.0,(calcu.calculoTarifa(200,30,17)),0.0);
	}
	
	@Test
	public void deberiaSerValidoDescuentoEdadMeyorYDias() {
		Assert.assertEquals(154.0,(calcu.calculoTarifa(200,21,122)),0.0);
		Assert.assertEquals(154.0,(calcu.calculoTarifa(200,31,66)),0.0);
	}
	
	@Test
	public void deberiaSerInvalidoPorEdad() {
		Assert.assertEquals(154.0,(calcu.calculoTarifa(200,21,-1)),0.0);
		Assert.assertEquals(154.0,(calcu.calculoTarifa(200,31,0)),0.0);
		Assert.assertEquals(154.0,(calcu.calculoTarifa(200,21,123)),0.0);
	}
	
	@Test
	public void deberiaSerInvalidoPorTarifa() {
		Assert.assertEquals(154.0,(calcu.calculoTarifa(-1,1,1)),0.0);
		Assert.assertEquals(0.0,(calcu.calculoTarifa(0,1,1)),0.0);
	}
	
	@Test
	public void deberiaSerInvalidoPorDias() {
		Assert.assertEquals(154.0,(calcu.calculoTarifa(200,-1,1)),0.0);
		Assert.assertEquals(0.0,(calcu.calculoTarifa(200,0,1)),0.0);
	}
}
