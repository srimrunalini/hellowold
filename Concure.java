package treading;


 class Concure implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=5;i>0;i--){  
		    try{Thread.sleep(793);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println("thread"+Thread.currentThread()+":"+i);  
		  }  
		
		System.out.println("thread"+Thread.currentThread()+":exciting"); 
	}
 
 
 public static void main(String args[]) {
	 Concure t1=new Concure();
	 Concure t2=new Concure();
	 Concure t3= new Concure();
	 
	 t1.run();
	 t2.run();
	 t3.run();
 }
}