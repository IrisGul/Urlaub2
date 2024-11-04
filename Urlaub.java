public class Urlaub
{
    private String ort;
    private int preis;
    private boolean allInc;
    
    public Urlaub(String ort, int preis, boolean allInc)
    {
       setOrt(ort);
       setPreis(preis);
       setAllInc(allInc);
    }
    public Urlaub(String ort, boolean allInc)
    {
        setOrt(ort);
        setPreis(2000);
        setAllInc(allInc);
    }
    public Urlaub(boolean allInc)
    {
        setOrt("Dubai");
        setPreis(2000);
        setAllInc(allInc);
    }
    public Urlaub()
    {
        setOrt("Dubai");
        setPreis(2000);
        setAllInc(true);
    }
    public void setOrt( String ort)
    {
        this.ort=ort;
    }
    public void setPreis(int preis)
    {
        this.preis=preis;
    }
    public void setAllInc( boolean allInc)
    {
        this.allInc=allInc;
    }
    public String getOrt()
    {
        return ort;
    }
    public int getPreis()
    {
        return preis;
    }
    public boolean getAllInc()
    {
        return allInc;
    }
    /* 
     * if abfrage statt allInc schreibe " all inc oder keine Verpflegung"
     */
    public void printUrlaub()
    {
        if( allInc==true)
        {
           System.out.println("Orname: " + ort + " Preis: " + preis + " Euro all Inclusive " );
        }
        else
        {
            System.out.println("Ortname: " + ort + " Preis: " + preis + " Euro keine Verpflegung ");

        }
    }
}