# LAB REPORT 2 - SERVERS AND BUGS   

## PART 1 
**My Code :**
![alt text](https://i.ibb.co/SffN9Nc/Screenshot-2023-01-27-002137.jpg)

**First ScreenShot**
![alt text](https://i.ibb.co/PDKbFtj/Screenshot-2023-01-26-224229.jpg)     
  - The method `public String handleRequest(URI url)` is being called
  - The argument for the method is "url", which is the current url (http://localhost:4444/add-message?s=I%20am%20Hello%20Kitty)
  - The relevant value including  `String[] element` (shared inside method)and ` String holder`(shared inside class)
  -  a blank string is being added to index 0 of **element** and "I am hello kitty" is being added to index 1 of **element**    
  -  The index 1 of **element**("I am hello kitty") and a new line character is being added to **holder** 
  -  **holder** is being returned for this method
   
**Second ScreenShot**
![alt text]( https://i.ibb.co/3y60TsL/Screenshot-2023-01-26-224309.jpg )
  - The method `public String handleRequest(URI url)` is being called
  - The argument for the method is "url", which is the current url (http://localhost:4444/add-message?s=Strawberry)
  - The relevant value including  `String[] element` (shared by class)and ` String holder`(shared inside method)
  - a blank string is being added to index 0 of **element** and "Strawberry" is being added to index 1 of **element**       
  -  The index 1 of **element**("Strawberry") and a new line character is being added to **holder** 
  -  **holder** is being returned for this method    
  
 
## PART 2 

 **Failure Inducing Input**
 ```
@Test
public void testAverageWithoutLowest(){
double[] test5 = {1,1,2,2,2};
double result3=ArrayExamples.averageWithoutLowest(test5);
assertEquals(2,result3,0.001 );
}
```
     
**Input Does Not Induce Failure**
 ```
@Test
public void testAverageWithoutLowest(){
double[] test2 = {0,5,5,5};
double result=ArrayExamples.averageWithoutLowest(test2);
assertEquals(5,result,0.001 );
}

```
    
**The Bug**
  - BEFORE
  ```
   static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - 1);
  }
  ```
  - AFTER
  ```
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    int countLowest=0;
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
      if(num == lowest) {countLowest+=1;}
    }
    return sum / (arr.length - countLowest);
  }
  ```
**THE FIX**
    -The fix takes in account of when there are more than one lowest number appear in array
    -A new variable is created to track the number of times the lowest number appear to make sure the sum is dividing the correct number of elements
    
   
## PART 3
  In week 2 and week 3, I learned about the components of a URL which I uses in daily life but didn't have much knowledge about. I also learned how to build a self-made server using Java. I knew how to read in a URL to manipulate the words that are displayed on the website. One other cool thing I learned is how to fork a repository to my own and push changes on my own clone version of the repository.  :smiley:
    
 

