
public class HelloWorld {

	public static void main(String[] args) {
		int i;
		
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.append("H").append("i");
		System.out.println(" There");
		System.out.println("Oops!");
		
		i=0;
		while (i < args.length) {
			System.out.println(args[i]);
			i++;
		}
		
		for (int i1=0; i1 < args.length; i1++) {
			System.out.println(args[i1]);
		}

		ArgPrinter ap = new ArgPrinter().printargs(args);
		
		ap.printargs(args).printargs(args);
	}

}


class ArgPrinter {
	public ArgPrinter printargs(String[] args) {
		System.out.println("Inside printargs");
		for (int i1=0; i1 < args.length; i1++) {
			System.out.println(args[i1]);
		}
		return this;
	}
}
