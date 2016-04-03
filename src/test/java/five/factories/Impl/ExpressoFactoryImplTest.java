package five.factories.Impl;

import five.domain.Cappuccino;
import five.domain.Expresso;
import five.domain.Ingredients;
import five.domain.Size;
import five.factories.ExpressoFactory;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Rosie on 2016/04/03.
 */
public class ExpressoFactoryImplTest extends TestCase {

    private ExpressoFactory factory;
    @BeforeMethod
    public void setUp() throws Exception {
        factory = ExpressoFactoryImpl.getInstance();
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testMakeCappuccino() throws Exception {
        Expresso e1 = factory.makeCappuccino(Size.small, Ingredients.whipped_Cream,Ingredients.vanilla);
        Assert.assertEquals(e1.toString(),"This Cappuccino of Size = small, is made of whipped_Cream and a touch of vanilla");
    }
    @Test
    public void testMakeCappuccinoUpdate() throws Exception{
        Expresso e1 = factory.makeCappuccino(Size.small, Ingredients.whipped_Cream,Ingredients.vanilla);
        //Assert.assertEquals(e1.toString(),"This Cappuccino of Size = small, is made of whipped_Cream and a touch of vanilla");

        //Updated size
        Expresso newT = new Cappuccino(Size.medium, Ingredients.whipped_Cream,Ingredients.vanilla);
        e1.setSize(newT.getSize());
        Assert.assertEquals(newT.getSize(),e1.getSize());
        Assert.assertEquals(e1.toString(),"This Cappuccino of Size = medium, is made of whipped_Cream and a touch of vanilla");

    }

    @Test
    public void testMakeLatte() throws Exception {

        Expresso l1 = factory.makeLatte(Size.small, Ingredients.whipped_Cream,Ingredients.vanilla);
        Assert.assertEquals(l1.toString(),"This Latte of Size = small,is made of whipped_Cream and a touch of vanilla");
    }
}