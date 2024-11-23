public class SmartTv {
   boolean ligada = false;
   int canal = 1;
   int volume = 25;


   //Subir e descer Volume
   public void subirVolume(){
      volume++;
   }

   public void descerVolume(){
      volume--;
   }

   //Subir e descer e definir Canais

   public void definirCanal(int novoCanal){
      canal = novoCanal;
   }
   public void subirCanal(){
      canal++;
   }

   public void descerCanal(){
      canal--;
   }
   
   //Ligar e Desligar
   public void ligar(){
      ligada = true;
   }

   public void desligar(){
      ligada = false;
   }
}
