/*********************************************
 * Sample solution Activity 4.9.2
 *********************************************/
 public class ZooKeeperRunner
 {
   public static void main(String[] args)
   {
    
    ArrayList<Animal> zoo = new ArrayList<Animal>();
    
    Deer d = new Deer();
    zoo.add(d);
    Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
    zoo.add(e);
    Giraffe gi = new Giraffe("leaves", false, 25.0);
    zoo.add(gi);
    Gorilla go = new Gorilla();
    zoo.add(go);
    Hippo hi = new Hippo();
    zoo.add(hi);
    Lion l = new Lion();
    zoo.add(l);
    Monkey m = new Monkey();
    zoo.add(m);
    Owl o = new Owl();
    zoo.add(o);
    Penguin pe = new Penguin();
    zoo.add(pe);
    Tiger t = new Tiger("meat", true, 17.0);
    
    for (Animal animal : zoo)
    {
      animal.speak();
    }
    
   }
 }