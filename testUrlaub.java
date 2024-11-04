import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testUrlaub
{  // 500 bis 3000 
   @Test // soll mit 2000 vergleichen es ist bei default (2000) weil 450 zu wenig
   public void testBillig()
   {
       Urlaub baden;
       baden=new Urlaub("Baden", 450, false);
       assertEquals(baden.getPreis(),2000);
   }
   @Test// 650 ist ok ist nicht wenig nicht viel also mit sich selbst vergleichen
   public void testOk()
   {
       Urlaub rom;
       rom=new Urlaub("Rom",650, true);
       assertEquals(rom.getPreis(),650);
   }
   @Test
   public void testTeuer()
   {
       Urlaub malasiya;
       malasiya=new Urlaub("Malasiya", 5000, true);
       assertEquals(malasiya.getPreis(),2000);
   }
}
