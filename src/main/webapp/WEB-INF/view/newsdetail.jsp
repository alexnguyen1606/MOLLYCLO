<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
    <head>
        <title> Example </title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">  
        <script type="text/javascript" src="static/vendor/bootstrap.js"></script>
         <script type="text/javascript" src="1.js"></script>
        <link rel="stylesheet" href="static/vendor/bootstrap.css">
        <link rel="stylesheet" href="static/vendor/font-awesome.css">
         <link rel="stylesheet" href="static/css/1.css">
         <link href="https://fonts.googleapis.com/css?family=Big+Shoulders+Text:100,300,400,500,600,700,800,900&display=swap&subset=vietnamese" rel="stylesheet"> 
         <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    </head>
<body>
    <div class="header">
		<nav class="navbar  navbar-light bg-faded navbar-fixed-top  ">
			<div class="container">
		<button class="navbar-toggler hidden-sm-up float-xs-right"  type="button" data-toggle="collapse" 
		data-target="#collapsibleNavId">				
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="logo"><a href="#"><img src="images/logo.png"  alt="Logo Molly"></a></div>
		
		<div class="collapse  navbar-toggleable-sm " id="collapsibleNavId" >
			<ul class="navbar-nav nav  ">
				<div class="float-xs-left">
						<li class="nav-item dropdown">
								<a class="nav-link dropdown-toggle" href="#" id="dropdownId" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
									Shop
								</a>
								<div class="dropdown-menu boxdropdown " aria-labelledby="dropdownId">
									<a class="dropdown-item" href="#">Action 1</a>
									<a class="dropdown-item" href="#">Action 2</a>
								</div>
							</li>
						<li class="nav-item">
							<a class="nav-link" href="/">COLLECTION</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="#">SOCIAL</a>
						</li>
						<li class="nav-item"><a href="" class=""><i class="fa fa-search" aria-hidden="true"></i></a></li>
				</div>
				<div class="float-xs-right">
				<li class="nav-item">
						<a href="" class=""><i class="fa fa-user"></i></a>
				</li>					
				<li class="nav-item">
					<a class="nav-link" href="#">Contact</a>
				</li>
				<li class="nav-item">
						<a class="nav-link" href="#">About us</a>
				</li>
				<li class="nav-item">
						<a href="" class="" ><i class="fa fa-shopping-bag"></i></a>
				</li>
			</div>
			</ul>
		</div>
	</div><!--end container-->
	</nav>
    </div><!--end header-->
    <div class="body">
        <div class="title_">
            <h1 >Group Member Shout Out (2018)</h1>
            <div class="grid">
                         <img src="images/A7200019.jpg" alt="">
            </div><!--end grid-->
            <hr class="mt-3 mb-3">
            <div class="container _comment">
                    <div class="comments "> 
                            <h5>2 comment</h5>
                             <div class="comment ">
                             <h6>mong sốp restock quần đinh ạ hjhj</h6>
                             <h6>an khang 24/08/2019</h6>
                             </div>

                             <div class="comment ">
                                    <h6>mong sốp restock quần đinh ạ hjhj</h6>
                                    <h6>an khang 24/08/2019</h6>
                                    </div>
                         </div> <!--end comment-->
            </div>
            <hr class="mt-3 mb-3" >
            <div class="container _comment">
                <h4>Leave a comment</h4>
                 <form action="">
                     <div class="leavecomment">
                     <div class="grid_half_item">
                         <label for="commentAuthor">Name</label>
                        <input type="text" class="" id="commentAuthor">
                     </div>
                     <div class="grid_half_item">
                         <label for="commentEmail">Email</label>
                            <input type="text" class="" id="commentEmail">
                    </div>
                    </div> <!--end leavecomment-->
                     <div class="grid_item">
                        <label for="commentBody">Message</label>
                        <textarea name=""   id="commentBody"></textarea>
                     </div>
                     <button class="btn" type="submit">POST COMMENT</button>
                 </form>             
            </div><!--end leavecomment-->
            
            </div>
    </div>
</div> 
</div><!--end body-->
    <div class="footer ">
        <div class="info">
        <div class="left">
            <p >@Date ,MOLLYCLO</p>
        </div>
        <div class="right">
            <div class="mulicon">
                    <a href=""><i class="fa fa-facebook"></i></a>		
                    <a href=""><i class="fa fa-instagram"></i></a>
            </div>
            <div class="formsub">
                <form action="">
                        <input class="" type="email" placeholder="Email address">
                        <button class="btn" type="submit">SUBCRIBE</button>
                </form>
            </div>
        </div>
    </div><!--end info-->
    </div><!--end footer-->
</body>
</html>