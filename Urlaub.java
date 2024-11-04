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
    public void printUrlaub()
    {
        System.out.println("Ort Name: " + ort + " Preis: " + preis + "Euro Allinclusive: "  + allInc);
    }
}