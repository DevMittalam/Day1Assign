package map.all;

public class Song {
    private String a[];
    private int front,rear,size,count;
    public Song(int size)
    {
    	this.size=size;
    	this.front=0;
    	this.rear=-1;
    	this.a=new String[this.size];
    	this.count=0;
    }
    public void enqueue(String s)
    {
    	if(this.count==size)
    	{
    		System.out.println("Size is Full");
    		return ;
    	}
    	else {
    		rear=(rear+1)%size;
    		a[rear]=s;
    		count++;
    		System.out.println(s+" added to Playlist");
    	}
    }
    public void dequeue()
    {
    	if(this.count==0)
    	{
    		System.out.println("Size is Empty");
    		return;
    	}
    	else
    	{
    		String song=a[front];
    		front=(front+1)%size;
    		count--;
    		System.out.println(song+" deleted from queue");
    	}
    }
    public String front() {
    	return a[front];
    }
    public String rear() {
    	return a[rear];
    }
    public int count()
    {
    	return count;
    }
}
