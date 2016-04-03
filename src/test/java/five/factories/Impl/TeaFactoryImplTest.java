package five.factories.Impl;

import five.domain.*;
import five.factories.Impl.TeaFactoryImpl;

import five.factories.TeaFactory;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Rosie on 2016/04/03.
 */
public class TeaFactoryImplTest extends TestCase {
        private TeaFactory factory;

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {
        factory = TeaFactoryImpl.getInstance();
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {

    }

    @org.testng.annotations.Test
    public void testMakeGreenTea() throws Exception {
        Tea t1 = factory.makeGreenTea(Size.small, Ingredients.jasmine);
        //Assert.assertEquals(t1.getSize(),"small");
        //Assert.assertEquals(t1.getBaseIngredients(),"jasmine");
        Assert.assertEquals(t1.toString(),"GreenTea {size = small, ingredients = jasmine}");
    }

    @Test
    public void testMakeGreenTeaUpdate() throws Exception{
        Tea t1 = factory.makeGreenTea(Size.small, Ingredients.jasmine);
        Assert.assertEquals(t1.toString(),"GreenTea {size = small, ingredients = jasmine}");

        //Updated size
        Tea newT = new GreenTea(Size.large,Ingredients.jasmine);
        //Assert.assertEquals(newT.getSize(),t1.getSize());
        t1.setSize(newT.getSize());
        Assert.assertEquals(newT.getSize(),t1.getSize());

    }

    @org.testng.annotations.Test
    public void testMakeRedTea() throws Exception {
        Tea t2 = factory.makeRedTea(Size.medium, Ingredients.jasmine);
        //Assert.assertEquals(t1.getSize(),"small");
        //Assert.assertEquals(t1.getBaseIngredients(),"jasmine");
        Assert.assertEquals(t2.toString(),"RedTea {Size = medium, Ingredients = jasmine}");
    }
    @Test
    public void testMakeRedTeaUpdate() throws Exception{
        Tea t2 = factory.makeRedTea(Size.medium, Ingredients.jasmine);
        Assert.assertEquals(t2.toString(),"RedTea {size = small, Ingredients = jasmine}");

        //Updated size
        Tea newT = new RedTea(Size.large,Ingredients.jasmine);
        //Assert.assertEquals(newT.getSize(),t2.getSize());
        t2.setSize(newT.getSize());
        Assert.assertEquals(newT.getSize(),t2.getSize());
    }

    @org.testng.annotations.Test
    public void testMakeTeaLatte() throws Exception {

    }
}