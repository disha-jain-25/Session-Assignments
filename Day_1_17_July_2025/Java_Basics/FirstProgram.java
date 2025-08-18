/*

 */

public class FirstProgram{
    public static void main(String[] args){

        System.out.println("Hello,World!");
    }
}
/* Explanation :

    ```
    public class FirstProgram {
    ```
        - `public`: Access modifier — this class is accessible from anywhere.
        - `class`: Keyword used to define a class.
        - `FirstProgram`: Name of the class. Must match the filename (`FirstProgram.java`).


    ```
        public static void main(String[] args) {
    ```
        - `public`: The method is accessible from outside the class (needed for JVM to call it).
        - `static`: This method belongs to the class, not a specific object.
        - `void`: This method does not return any value.
        - `main`: The entry point of any Java program. The JVM looks for this method to start execution.
        - `String[] args`: Parameter to accept command-line arguments (an array of Strings).

    ```
            System.out.println("Hello,World!");
    ```
        - `System`: A built-in Java class from the `java.lang` package.
        - `out`: A static member of `System`, represents the standard output stream (usually the console).
        - `println()`: Method to print text followed by a new line.
        - `"Hello,World!"`: The actual message being printed to the console.
 */