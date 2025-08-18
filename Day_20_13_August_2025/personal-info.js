// Personal Info Collector

// Using const because the name value should not be reassigned after being collected
const name = prompt("Enter your name:");

// Using let because age might be updated or modified later if needed
let age = prompt("Enter your age:");

// Using const because email should stay the same once provided
const email = prompt("Enter your email:");

// Logging values and their types
console.log("Name:", name, "| Type:", typeof name);
console.log("Age:", age, "| Type:", typeof age);
console.log("Email:", email, "| Type:", typeof email);

/*
Why I used let, const, or var:
1. const → Used for variables that should not change (name, email).
2. let   → Used for variables that could change or be reassigned in the future (age).
3. var   → Not used because it has function scope and can lead to unexpected issues due to hoisting; 
           modern JavaScript prefers let/const for better scope control.
*/
