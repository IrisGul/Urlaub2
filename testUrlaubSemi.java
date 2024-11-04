
public class testUrlaubSemi
{
    public void testBillig()
    {
        Urlaub baden;
        baden=new Urlaub("Baden", 350, false);
        //Fehler
        System.out.println(baden.getPreis());
        //2000
    }
    public void testOk()
    {
        Urlaub wien;
        wien=new Urlaub("Wien", 800, true);
        System.out.println(wien.getPreis());
    }
    public void testTeuer()
    {
        Urlaub dubai;
        dubai=new Urlaub("Dubai", 3000, true);
        System.out.println(dubai.getPreis());
    }
}
