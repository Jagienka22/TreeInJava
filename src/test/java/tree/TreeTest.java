package tree;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by aga on 13.04.18.
 */
@Test
public class TreeTest {
    public void sumaPustegoDrzewaRownaSieZero(){
        Assert.assertEquals(new Tree(0).sum(), 0);
    }

    public void sumaDrzewaNieposiadajacegoPodrzewJestRownaJegoWartosci(){
        Assert.assertEquals(new Tree(2).sum(),2);
    }

    public void sumaDrzewaPosiadajacegoJednoPodrzewoJestRownaSumieKorzeniaITegoPodrdzewa(){
        Assert.assertEquals(new Tree(2, new Tree(5)).sum(), 7);
    }

    public void sumaDrzewaPosiadajacegoDwaPodrzewa(){
        Assert.assertEquals(new Tree(2, new Tree(5), new Tree(7)).sum(), 14);
    }

    public void sumaDużegoDrzewa(){
        Assert.assertEquals(new Tree(5, new Tree(3, new Tree(2), new Tree(5)), new Tree(7, new Tree(1), new Tree(0, new Tree(2), new Tree(8, new Tree(5))))).sum(), 38);
    }

    public void sredniaPustegoDrzewa(){
        Assert.assertEquals(new Tree(0).average(), 0.0);
    }

    public void sredniaDrzewaBezDzieci(){
        Assert.assertEquals(new Tree(2).average(), 2.0);
    }

    public void sredniaDrzewaZJednymDzieckiem(){
        Assert.assertEquals(new Tree(1, new Tree(7)).average(), 4.0);
    }


    public void sredniaDrzewaZDwomaDziecmi(){
        Assert.assertEquals(new Tree(2, new Tree(7), new Tree(3)).average(), 4.0);
    }

    public void sredniaDuzegoDrzewa(){
        Assert.assertEquals(new Tree(5, new Tree(3, new Tree(2), new Tree(5)), new Tree(7, new Tree(1), new Tree(0, new Tree(2), new Tree(8, new Tree(5))))).average(), 3.8);
    }


    public void medianaPustegoDrzewa(){
        Assert.assertEquals(new Tree(0).median(), 0.0);
    }

    public void medianaDrzewaBezDzieci(){
        Assert.assertEquals(new Tree(2).median(), 2.0);
    }

    public void medianaDrzewaZJednymPoddrzewem(){
        Assert.assertEquals(new Tree(2, new Tree(4)).median(), 3.0);
    }

    public void medianaDrzewaZDwomaPoddrzewami(){
        Assert.assertEquals(new Tree(2, new Tree(4), new Tree(7)).median(), 4.0);
    }

    public void medianaDuzegoDrzewa(){
        Assert.assertEquals(new Tree(5, new Tree(3, new Tree(2), new Tree(5)), new Tree(7, new Tree(1), new Tree(0, new Tree(2), new Tree(8, new Tree(5))))).median(), 4.0);
    }

}