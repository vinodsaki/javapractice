class Assignment{
public static void main(String args[]){
int a=10;
/*if(a>=0){
System.out.println(a+"is positive");
}
else{
System.out.println(a+" is negative");
}*/
/*if(a%2==0){
System.out.println(a+" is a even number");
}
else{
System.out.println(a+" is not odd number");
}
}*/
char ch='m';
int age=30;
	if(ch=='m'){
	System.out.println("you are male");
		if(age>=21){
System.out.println("You are eligible for marriage. Age: " + age);
		}
		else{
		System.out.println("you are underage");
		}
		}
else{
	System.out.println("your are female");
	if(age>=18){
	System.out.println("You are eligible for marriage. Age: " + age);
	}
	else{
	System.out.println("your are under age");
	}
	}
}
}