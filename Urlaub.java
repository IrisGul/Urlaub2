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
    //Die Preis soll von 500 Euro bis 3000 Euro sein
    public void setPreis(int preis)
    {
       if((preis>=500) && (preis<=3000))
       {
           this.preis=preis;
       }
       else
       {
         System.out.println("Fehler meldung! Preis soll zwieschen 500€ und 3000€ muss sein.");
         this.preis=2000;
       }
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
     * if abfrage statt allInc false or true schreibe -->" all inc OR keine Verpflegung"
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