# Exploratory testing
### _Goals: Booking a Hotel_

#### Scenarios

##### 1.- Verify the hotel search

In this scenario, the main functionality of a hotel reservation is verified, which is the search for a hotel to reserve. The search process, filters, autocompletes, search criteria, dates and the expected result are taken into account.

Observations:


- Sometimes when performing the search, the result was a 404 page and even a “server IP address could not be found”. It is suggested to mitigate this behavior (reviewing the services involved) to mitigate said intermittencies. It does not allow me to continue with the process.

![image1](https://user-images.githubusercontent.com/1209284/123964989-06eb6c80-d982-11eb-8dcc-9886f1cddb6f.png)
- The search field "Destination" has an irregular behavior, since it does not perform certain searches that contain the name typed in said field. 

![image2](https://user-images.githubusercontent.com/1209284/123964992-07840300-d982-11eb-9ed7-71f78c4694c7.png)
![image3](https://user-images.githubusercontent.com/1209284/123964996-08b53000-d982-11eb-89eb-72fdcff5d2b7.png)
- When searching, many of the results are displayed with broken photo links. It is suggested to verify the services where these images are stored and place them on a bucket of the company so as not to have problems with their availability.
- It is observed that some information is not complete when the search is carried out.

![image4](https://user-images.githubusercontent.com/1209284/123965000-08b53000-d982-11eb-96e8-c57e5cbb6c00.png)
- It is observed that on the “check out date” you can enter dates prior to the current one and by typing the “check in date”, you can perform a search with expired dates and still get results. This generates confusion and unreliability in the client when searching and knowing the availability of said hotels.

![image5](https://user-images.githubusercontent.com/1209284/123965004-094dc680-d982-11eb-9e78-65dc9eddee78.png)
![image6](https://user-images.githubusercontent.com/1209284/123965008-0a7ef380-d982-11eb-82a9-20ab9232518c.png)

In general, in this first scenario, it is very important since it is the input that the user has to be able to make a hotel reservation. If it is not possible to generate trust in this first search, it is possible that the user does not trust in making the reservation, since there are many inconsistencies in the search results and the way to perform the search, so, in my opinion, it should be Invest in a solution where we can mitigate and prioritize this functionality to reduce the risk that the user does not trust the application to make their reservation.


##### 2.- Verify the hotel reservation
In this scenario, the main functionality is basically the booking process. You can verify the payment process, availability of dates, offers, discounts, etc.

Observations:
- I’m not able test this part, an issue is showing up.

![image7](https://user-images.githubusercontent.com/1209284/123965010-0a7ef380-d982-11eb-86ef-f625eb68b8de.png)
![image8](https://user-images.githubusercontent.com/1209284/123965011-0b178a00-d982-11eb-9488-7e8d18c34480.png)
- The website is not behaving in the correct way, as it does not allow me to advance in the booking process. 
- It is observed that some GET method is returning a 307 code that means it is doing a temporary redirection, since this code status should be mitigated with a correct exception handling, this means that getting a 404 should be managed in a way that the client may understand what is happening.

##### 3.- Confirm that hotel was successfully booked
In this scenario, the functionality to be tested is the proof of the reservation made. It is to be able to verify if I have all the correct information of the reservation made.

Observations:
- In this scenario I’m not able to test it, due to the error that I mentioned before.
- In this case, I used the credentials to check if the user has a reservation done and try to see the information and behavior of this.

![image9](https://user-images.githubusercontent.com/1209284/123965017-0b178a00-d982-11eb-99dd-7a5afb1bce5f.png)
- I’m able to check the invoice, and everything seems to be in order with some reservation that was made before
- I noticed that when I tried to click on the hotel from the invoice page and user page, nothing happened

To conclude, given the exploratory tests carried out, there are many functionalities which must be dealt with as soon as possible to provide a solution to users interested in using the application.

I can say that the application is very unstable, since on certain occasions I was able to carry out searches but on many others not, making it impossible for me to review the other two scenarios that are part of the hotel reservation process.

We need to be able to report the findings in order to start solving them. Define with the business,  which would be the ones with the greatest impact and be able to carry out an action plan to mitigate the errors presented in the hotel booking process.





