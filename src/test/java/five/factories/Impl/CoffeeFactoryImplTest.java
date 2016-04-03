package five.factories.Impl;

import five.domain.Coffee;
import five.domain.Ingredients;
import five.domain.Size;
import five.factories.CoffeeFactory;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Rosie on 2016/04/03.
 */
public class CoffeeFactoryImplTest extends TestCase {

    private CoffeeFactory factory;

    @BeforeMethod
    public void setUp() throws Exception {
        factory = CoffeeFactoryImpl.getInstance();

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testMakeExpresso() throws Exception {
        Coffee cof1 = factory.makeExpresso(Size.small, Ingredients.sugar);
        Assert.assertEquals(cof1.toString(),"This Expresso of size small,is made of sugar");

    }

    @Test
    public void testMakeDecaf() throws Exception {
        Coffee cof2 = factory.makeDecaf(Size.small, Ingredients.vanilla);
        Assert.assertEquals(cof2.toString(),"This Expresso Decaf of size small,is made of vanilla");

    }
}