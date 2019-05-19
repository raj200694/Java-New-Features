package com.krupa;
//nadaf from xworkz
public class AnonymousClassExample {
	public static void main(String[] args) {
		/*Message anonmsg =  new Message(){
			public void send(String msg) {
				System.out.println(msg);
			}
		};
		
		anonmsg.send("Hello This is Xworkz from anonymous class");
		System.out.println("---------------------------------------------------");*/
		
		Message lamdamsg = msg1-> {return msg1;};
		lamdamsg.send("Hello Xworkz from lamda");
	}
}

@FunctionalInterface
interface Message {
	String send(String msg);
}

/*class MessageImpl implements Message {

	@Override
	public void send(String msg) {
		System.out.println("This is in Message Impl");
		System.out.println(msg);
	}

}*/
