package test2.shopping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class Operations {
   HashMap<String,Items> map=new HashMap<String,Items>();
   static int id=100;  
   public void addToCart(String cat , String name , int qnt , float price) {
    	  ++id;   
	   map.put(String.valueOf(id),new Items(name,qnt,price,cat));
    	   System.out.println("Item added to cart successfully with id : "+id);
     }
     public void removeFromCart(String id) {
    	   map.remove(id);
     }
     public void view() {
    	 for(Map.Entry<String,Items>en:map.entrySet())
  	        {
               System.out.println("Id : "+en.getKey()+" "+en.getValue().toString());  		 
  	        }
  	   }
      public void totalBill() {
    	  double bill=0;
    	  for(Map.Entry<String,Items>en:map.entrySet())
	        {
             System.out.println(en.getKey()+" "+en.getValue().getName()+" "+en.getValue().getQuantity()+" "+en.getValue().getPrice());
               bill=bill+(en.getValue().getQuantity()*en.getValue().getPrice()); 
	        }
    	  System.out.println("Total Bill is : "+bill);
      }
      public void BillByCat() {
    	  HashMap<String,Items> temp= map.entrySet().stream().sorted((i1, i2)-> i1.getValue().getCat().compareTo(i2.getValue().getCat()))
          .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
            Set<String>set=new HashSet<String>();
            for(Map.Entry<String,Items> en: temp.entrySet())
         {
            	set.add(en.getValue().getCat());
         }
            //System.out.println(set.size());
           for(String s : set)
           {
        	   double bill=0;
        	   for(Map.Entry<String,Items> en : map.entrySet())
        	   {
        		    if(en.getValue().getCat().equalsIgnoreCase(s))
        		    {
        		       bill=bill+(en.getValue().getQuantity()*en.getValue().getPrice());
        		       System.out.println(en.getKey()+" "+en.getValue().toString());
        		    }
        	   }
        	   System.out.println("Total bill of "+s+" is : "+bill);
               System.out.println("\n");
           }
      }
  }
