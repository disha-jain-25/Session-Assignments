**1. Java Installation ->**



&nbsp;	\* Install JDK (Java Development Kit) from \[Oracle](https://www.oracle.com/java/technologies/javase-downloads.html)

&nbsp;	\* Set environment variable `JAVA\_HOME` and update `PATH`.



**2. JDK vs JRE**



&nbsp;	| **Term**    | **Meaning**                  | **Use**                                                               |

&nbsp;	| ------- | ------------------------ | ----------------------------------------------------------------- |

&nbsp;	| \*\*JDK\*\* | Java Development Kit     | Includes compiler (`javac`), JRE, tools to build \& run Java apps. |	

&nbsp;	| \*\*JRE\*\* | Java Runtime Environment | Includes JVM \& libraries to only \*\*run\*\* Java apps, not compile.  |



**3. IDE**



&nbsp;	\* IDE (Integrated Development Environment) helps you write, debug, and run code easily.

&nbsp;	\* Examples: Eclipse, IntelliJ IDEA, VS Code.



**4. Hello World Example**



&nbsp;	```

&nbsp;		public class HelloWorld {

&nbsp;   			public static void main(String\[] args) {

&nbsp;       			System.out.println("Hello, World!");

&nbsp;   			}

&nbsp;		}

&nbsp;	```



**5. Primitive Types**



&nbsp;	**Java has 8 primitive types:**



&nbsp;		\* `byte`, `short`, `int`, `long` → integers

&nbsp;		\* `float`, `double` → decimals

&nbsp;		\* `char` → single character

&nbsp;		\* `boolean` → true/false



&nbsp;		- Example:



&nbsp;			```

&nbsp;				int age = 25;

&nbsp;				double price = 99.99;

&nbsp;				char grade = 'A';

&nbsp;				boolean isJavaFun = true;

&nbsp;			```



**6. Type Casting** 



&nbsp;	Used to convert one data type into another.

&nbsp;	

&nbsp;	- Implicit (Widening):



&nbsp;		```

&nbsp;			int a = 10;

&nbsp;			double b = a; // int to double automatically

&nbsp;		```



&nbsp;	- Explicit (Narrowing):



&nbsp;		```

&nbsp;			double x = 9.7;

&nbsp;			int y = (int) x; // forcefully converts to int (y = 9)

&nbsp;		```



**7. Variables**



&nbsp;	\* Used to store data.

&nbsp;	\* Must declare a type.



&nbsp;	- Example:



&nbsp;		```

&nbsp;			String name = "Disha";

&nbsp;			int marks = 90;

&nbsp;		```



**8. Constants** 



&nbsp;	\* Use `final` keyword to make a value unchangeable.



&nbsp;	- Example:



&nbsp;		```

&nbsp;			final double PI = 3.14159;

&nbsp;		```

