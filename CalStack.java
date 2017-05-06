
public class CalStack {
	public class CalNode{
		protected String item;
		protected CalNode last;
		
		public CalNode(String item,CalNode last){
			this.item=item;
			this.last=last;
		}
		public String getItem(){
			return item;
		}
		public CalNode getLast(){
			return last;
		}
	}
	
	CalNode first;
	int size;
	
	public CalStack(){
		this.first=null;
		this.size=0;
	}
	
	public String top(){
		return this.first.getItem();
	}
	
	public void pop(){
		try{
			this.first=first.getLast();
		}catch(NullPointerException e){
		}		
	}
	public void push(String item){
	    CalNode topNode= new CalNode(item,this.first);
	    this.first=topNode;
	}
	public boolean isEmpty(){
		return (first==null)? true:false;
	}


}
