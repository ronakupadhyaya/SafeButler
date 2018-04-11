<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" import="java.util.*" import="data.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	ArrayList<User> users = null;
	User user = null;
	Integer count = 0;
	if(session.getAttribute("count") == null) {
		session.setAttribute("count", count);
		System.out.println("Here1");
	}
	else {
		count = (Integer) session.getAttribute("count");
		System.out.println("Here2");
	}
	System.out.println("count: " + count);
	if(request.getAttribute("users") != null) {
		users = (ArrayList<User>) request.getAttribute("users");
		if(users.size() == 0) {
			if(count == 0) {
				System.out.println("count == 0");
				user = new User();
				user.setName("Ronak Upadhyaya");
				user.setEmail("rdupadhy@usc.edu");
				user.setAddress("3131 S Hoover St");
				user.setHouseOrCondo("House");
				user.setYearBuilt("2017");
				user.setSquareFootage("1222");
				user.setRoofType("Asphalt/ fiberglass shingles");
				user.setConstruction("Concrete");
				user.setStories("1");
				user.setSwimmingPool("No");
				user.setFixtures("Just the basics");
				user.setDiscounts("Recent home purchase");
				
				count++;
				session.setAttribute("count", count);
			}
			else if(count == 1) {
				user = new User();
				user.setName("Tom Smith");
				user.setEmail("tomsmith@usc.edu");
				user.setAddress("3771 McClintock Ave");
				user.setHouseOrCondo("Condo");
				user.setYearBuilt("2016");
				user.setSquareFootage("1522");
				user.setRoofType("Asphalt/ fiberglass shingles");
				user.setConstruction("Concrete");
				user.setStories("2");
				user.setSwimmingPool("Yes");
				user.setFixtures("Just the basics");
				user.setDiscounts("None");
				
				count++;
				session.setAttribute("count", count);
			}
			else if(count == 2) {
				user = new User();
				user.setName("William Cooper");
				user.setEmail("wcooper@usc.edu");
				user.setAddress("350 De Neve Dr");
				user.setHouseOrCondo("Condo");
				user.setYearBuilt("2017");
				user.setSquareFootage("1000");
				user.setRoofType("Asphalt/ fiberglass shingles");
				user.setConstruction("Concrete");
				user.setStories("1");
				user.setSwimmingPool("No");
				user.setFixtures("Just the basics");
				user.setDiscounts("None");
				
				count = 0;
				session.setAttribute("count", count);
			}
		}
		else {
			user = users.get(0);	
		}
	}
	else {
		if(count == 0) {
			System.out.println("count == 0");
			user = new User();
			user.setName("Ronak Upadhyaya");
			user.setEmail("rdupadhy@usc.edu");
			user.setAddress("3131 S Hoover St");
			user.setHouseOrCondo("House");
			user.setYearBuilt("2017");
			user.setSquareFootage("1222");
			user.setRoofType("Asphalt/ fiberglass shingles");
			user.setConstruction("Concrete");
			user.setStories("1");
			user.setSwimmingPool("No");
			user.setFixtures("Just the basics");
			user.setDiscounts("Recent home purchase");
			
			count++;
			session.setAttribute("count", count);
		}
		else if(count == 1) {
			user = new User();
			user.setName("Tom Smith");
			user.setEmail("tomsmith@usc.edu");
			user.setAddress("3771 McClintock Ave");
			user.setHouseOrCondo("Condo");
			user.setYearBuilt("2016");
			user.setSquareFootage("1522");
			user.setRoofType("Asphalt/ fiberglass shingles");
			user.setConstruction("Concrete");
			user.setStories("2");
			user.setSwimmingPool("Yes");
			user.setFixtures("Just the basics");
			user.setDiscounts("None");
			
			count++;
			session.setAttribute("count", count);
		}
		else if(count == 2) {
			user = new User();
			user.setName("William Cooper");
			user.setEmail("wcooper@usc.edu");
			user.setAddress("350 De Neve Dr");
			user.setHouseOrCondo("Condo");
			user.setYearBuilt("2017");
			user.setSquareFootage("1000");
			user.setRoofType("Asphalt/ fiberglass shingles");
			user.setConstruction("Concrete");
			user.setStories("1");
			user.setSwimmingPool("No");
			user.setFixtures("Just the basics");
			user.setDiscounts("None");
			
			count = 0;
			session.setAttribute("count", count);
		}
	}
%>
   <head>
   <link href="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.css" rel="stylesheet" />
   <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.js"></script>
      
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>SafeButler | Better insurance at your fingertips</title>
      <link rel="stylesheet" type="text/css" href="css/home.css">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   	  
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <!-- <link rel="stylesheet" href="/resources/demos/style.css"> -->
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  /* $( function() {
    $( "#dialog" ).dialog();
  } ); */
 
  </script>
   	  <script>
   	  function showOptions() {
   		window.location.replace("http://localhost:8080/SafeButler/options.html");
   	  }
   	  </script>
   </head>
   <body>
      <div id="DIV_1">
         <div id="ORIGINAL_DIV_3">
            <div id="ORIGINAL_DIV_4">
               <div id="ORIGINAL_DIV_5">
                  <div id="ORIGINAL_DIV_6">
                     <a><img id="ORIGINAL_SAFEBUTLER" src="images/safebutler.png"></a>
                     <div id="ORIGINAL_DIV_9">
                        <!-- <a href="/individuals" id="ORIGINAL_A_10">For You &amp; Family</a><a href="/business" id="ORIGINAL_A_11">For Business</a><a href="/brokers" id="ORIGINAL_A_12">For Agents</a> -->
                     </div>
                     <div id="ORIGINAL_DIV_13">
                        <a href="tel:18556722788" id="ORIGINAL_A_19">1-213-713-3494</a><a href="/auth/login" id="ORIGINAL_A_20"><span id="ORIGINAL_SPAN_21">Talk With a Guide</span></a>
                     </div>
                  </div>
               </div>
            </div>
         </div>
         <div id="DIV_2">
            <div id="DIV_20">
               <div id="SEARCH">
                  <a>
                  <img src="images/search.png" />
                  </a>
               </div>
               <ol id="OL_21">
                  <li id="LI_98">
                     <div id="DIV_99">
                        <a href="/resources/new-jersey/credentialing/" id="A_100"></a>
                        <div id="DIV_101">
                           Dashboard
                          <script>
                           sweetAlert(
                        		   {
                        		     title: "A new quote has arrived",
                        		     text: "",
                        		     type: "warning",   
                        		     showCancelButton: true,   
                        		     confirmButtonColor: "#00BCB0",
                        		     confirmButtonText: "Start Quote"
                        		   }
                        		 );
                           </script>
                        </div>
                     </div>
                  </li>
                  <li id="LI_102">
                     <div id="DIV_103">
                        <a href="/resources/new-jersey/member-grievances/" id="A_104"></a>
                        <div id="DIV_105">
                           Clients
                        </div>
                     </div>
                  </li>
                  <li id="LI_106">
                     <div id="DIV_107">
                        <a href="/resources/new-jersey/provider-inquiries-and-disputes/" id="A_108"></a>
                        <div id="DIV_109">
                           Claims
                        </div>
                     </div>
                  </li>
                  <li id="LI_110">
                     <div id="DIV_111">
                        <a href="/resources/new-jersey/fraud-waste-and-abuse-fwa/" id="A_112"></a>
                        <div id="DIV_113">
                           Payments
                        </div>
                     </div>
                  </li>
                  <li id="LI_110">
                     <div id="DIV_111">
                        <div id="DIV_113">
                        </div>
                     </div>
                  </li>
                  <li id="LI_114">
                     <div id="DIV_115">
                        <a href="/resources/new-jersey/forms/" id="A_116"></a>
                        <div id="DIV_117">
                           Resources
                        </div>
                     </div>
                  </li>
                  <li id="LI_118">
                     <div id="DIV_119">
                        <a href="/resources/new-jersey/appendix/" id="A_120"></a>
                        <div id="DIV_121">
                           Support
                        </div>
                     </div>
                  </li>
               </ol>
            </div>
         </div>
         <div id="DIV_122">
            <div class="MAIN_FLEX_CONTAINER">
               <div class="USER_HEADER">
                  <div class="USER_NAME">
                     <%= user.getName() %>
                  </div>
                  <div class="USER_EMAIL">
                     <%= user.getEmail() %>
                  </div>
                 <!--  <div id="dialog" title="Basic dialog">
  					<p>A new quote has arrived.</p>
				 </div> -->
               </div>
               <div class="USER_MAIN">
                  <div class="USER_CARD">
                     <div class="card">
                        <img class="card-img-top" id="CARD_IMAGE" src="https://www.dmastairlifts.co.uk/wp-content/uploads/2016/11/profile-placeholder-1.png" />
                        <div class="card-body">
                           <p class="card-text">
                              Homeowner Insurance 
                           </p>
                        </div>
                     </div>
                  </div>
                  <div class="INSURANCE_BACKGROUND_MAIN">
                     <div class="INSURANCE_BACKGROUND_COLUMN">
                        <div>
                           <div class="DATA" style="padding-top: 10px;">
                              Home Address
                           </div>
                           <div class="RESULT">
                              <%= user.getAddress() %>
                           </div>
                        </div>
                        <div>
                           <div class="DATA">
                              House or Condo
                           </div>
                           <div class="RESULT">
                              <%= user.getHouseOrCondo() %>
                           </div>
                        </div>
                        <div>
                           <div class="DATA">
                              Year Built
                           </div>
                           <div class="RESULT">
                              <%= user.getYearBuilt() %>
                           </div>
                        </div>
                        <div>
                           <div class="DATA">
                              Square Footage (sq ft)
                           </div>
                           <div class="RESULT">
                              <%= user.getSquareFootage() %>         					
                           </div>
                        </div>
                        <div>
                           <div class="DATA">
                              Roof Type
                           </div>
                           <div class="RESULT">
                              <%= user.getRoofType() %>
                           </div>
                        </div>
                     </div>
                     <div class="INSURANCE_BACKGROUND_COLUMN">
                        <div>
                           <div class="DATA" style="padding-top: 10px;">
                              Construction Type of Home
                           </div>
                           <div class="RESULT">
                              <%= user.getConstruction() %>
                           </div>
                        </div>
                        <div>
                           <div class="DATA">
                              Stories
                           </div>
                           <div class="RESULT">
                              <%= user.getStories() %>
                           </div>
                        </div>
                        <div>
                           <div class="DATA">
                              Swimming Pool
                           </div>
                           <div class="RESULT">
                              <%= user.getSwimmingPool() %>
                           </div>
                        </div>
                        <div>
                           <div class="DATA">
                              Home's fixtures & furnishes
                           </div>
                           <div class="RESULT">
                              <%= user.getFixtures() %>
                           </div>
                        </div>
                        <div>
                           <div class="DATA">
                              Special Discounts
                           </div>
                           <div class="RESULT">
                              <%= user.getDiscounts() %>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
               <div id="QUOTE">
                  <button id="QUOTE_BUTTON" onclick="showOptions()">
                  Offer Quote
                  </button>
               </div>
            </div>
         </div>
      </div>
   </body>
</html>