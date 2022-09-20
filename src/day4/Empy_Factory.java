package assign.day4;

public class Empy_Factory {
	public Employee getPlan(String s)
    {
        if(s.equalsIgnoreCase("permanent")){
         return new Permanent();
      } else if(s.equalsIgnoreCase("contractual")){
         return new Contractual();
      } 
      return null;
    }
}
