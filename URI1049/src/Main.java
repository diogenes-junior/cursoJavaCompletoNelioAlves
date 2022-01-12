import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1, str2, str3, result="";
		
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		str3 = sc.nextLine();
		
		if(str1.equals("vertebrado")) {
			if(str2.equals("ave")) {
				if(str3.equals("carnivoro")) {
					result = "aguia";
				}
				else if(str3.equals("onivoro")) {
					result = "pomba";					
				}				
			}
			else if(str2.equals("mamifero")) {
				if(str3.equals("onivoro")) {
					result = "homem";
				}
				else if(str3.equals("herbivoro")) {
					result = "vaca";					
				}				
			}
		}
		if(str1.equals("invertebrado")) {
			if(str2.equals("inseto")) {
				if(str3.equals("hematofago")) {
					result = "pulga";
				}
				else if(str3.equals("herbivoro")) {
					result = "lagarta";					
				}								
			}
			else if(str2.equals("anelideo")) {
				if(str3.equals("hematofago")) {
					result = "sanguessuga";
				}
				else if(str3.equals("onivoro")) {
					result = "minhoca";					
				}				
			}			
		}
			
			
		
		System.out.println(result);	
			
		sc.close();
	}

}
