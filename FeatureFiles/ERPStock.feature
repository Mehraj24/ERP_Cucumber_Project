@tag
Feature:
Validate customer and supplier modules
@supplier
Scenario Outline:
validate supplier with multiple set of data
Given Launch Browser
When Launch Url 
When Wait for Username with "xpath" and "//input[@id='username']"
When Enter username with "xpath" and "//input[@id='username']" and "admin"
When Enter password with "xpath" and "//input[@id='password']" and "master"
When Click login button with "id" and "btnsubmit"
When wait for logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When Wait for Supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When Click Supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When Wait for Add icon with "xpath" and "(//span[@data-caption='Add'])[1]"
When Click Add icon button with "xpath" and "(//span[@data-caption='Add'])[1]"
When Wait for Supplier Number with "name" and "x_Supplier_Number"
When Capture Supplier Number with "name" and "x_Supplier_Number"
When Enter in "<SupplierName>" with "id" and "x_Supplier_Name" 
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//*[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']" 
When click add button with "id" and "btnAction"
When Wait for Confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When Click confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When Wait for alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When Click Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When Verify Supplier Number
When click logout with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When Close Browser
Examples:
|SupplierName|address|city|country|cperson|pnumber|mail|mnumber|note|
|selenim9|	srnagar1|	Hyderabad|	India|	Qedge31|6547895412|test@gmail.com|6321456987|New Supplier Adding|
|selenim8|	srnagar71|	Hyderabad|	India|	Qedge351|6547895412|test@gmail.com|6321456987|New Supplier Adding|
|selenim7|	srnagar132|	Hyderabad|	India|	Qedge361|6547895412|test@gmail.com|6321456987|New Supplier Adding|
|selenim6|	srnagar51|	Hyderabad|	India|	Qedge371|6547895412|test@gmail.com|6321456987|New Supplier Adding|
|selenim5|	srnagar51|	Hyderabad|	India|	Qedge317|6547895412|test@gmail.com|6321456987|New Supplier Adding|
@Customer
Scenario Outline:
validate supplier with multiple set of data
Given Launch Browser
When Launch Url 
When Wait for Username with "xpath" and "//input[@id='username']"
When Enter username with "xpath" and "//input[@id='username']" and "admin"
When Enter password with "xpath" and "//input[@id='password']" and "master"
When Click login button with "id" and "btnsubmit"
When wait for logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When Wait for Customer link with "xpath" and "(//a[contains(text(),'Customers')])[2]"
When Click customer link with "xpath" and "(//a[contains(text(),'Customers')])[2]"
When Wait for Add icon with "xpath" and "(//span[@data-caption='Add'])[1]"
When Click Add icon button with "xpath" and "(//span[@data-caption='Add'])[1]"
When Wait for customer Number with "name" and "x_Customer_Number"
When Capture Customer Number with "name" and "x_Customer_Number"
When Enter in "<CustomerName>" with "name" and "x_Customer_Name" 
When Enter in "<address>" with "xpath" and "//textarea[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//input[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//input[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//input[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//input[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//input[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//input[@id='x_Mobile_Number']" 
When Enter in "<note>" with "xpath" and "//input[@id='x_Notes']" 
When click add button with "id" and "btnAction"
When Wait for Confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When Click confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When Wait for alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When Click Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When Verify Customer Number
When click logout with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When Close Browser
Examples:
|CustomerName|address|city|country|cperson|pnumber|mail|mnumber|note|
|Akhil9|	Ameerpet1|	Hyderabad|	India|	Qedge1|6547895412|test@gmail.com|6321456987|New Customer Adding|
|Akhil8|	Ameerpet6|	Hyderabad|	India|	Qedge18|6547895412|test@gmail.com|6321456987|New Customer Adding|
|Akhil6|	Ameerpet15|	Hyderabad|	India|	Qedge15|6547895412|test@gmail.com|6321456987|New Customer Adding|
|Akhil7|	Ameerpet187|	Hyderabad|	India|	Qedge156|6547895412|test@gmail.com|6321456987|New Customer Adding|
|Akhil153|	Ameerpet156|	Hyderabad|	India|	Qedge1567|6547895412|test@gmail.com|6321456987|New Customer Adding|