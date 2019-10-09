<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
        <head>
                <title> Example </title>

                <meta name="viewport" content="width=device-width, initial-scale=1">  
                <script type="text/javascript" src="static/vendor/bootstrap.js"></script>
                 <script type="text/javascript" src="static/1.js"></script>
                <link rel="stylesheet" href="static/vendor/bootstrap.css">
                <link rel="stylesheet" href="vendor/font-awesome.css">
                 <link rel="stylesheet" href="css/category.css">
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
    <div class="container">
        <div class="row">
            <div class="col-sm-2 category">
                <ul class="nav nav-category">
                    <li><a href="" class="all" >ALL CATEGORIES</a></li>
                    <li><a href="">TEE</a></li>
                    <li><a href="">TOPWEAR</a></li>
                    <li><a href="">BOTTOMS</a></li>
                </ul>
            </div>
            <div class="col-sm-8 content">
                <div class="grid">
                   <a href="">
                    <div class="block soldout" style="">
                            <img class="img" src="images/item3_large.jpg" alt="">
                            <h4>Captain striped t-shirt</h4>
                            <p><strike>500,000đ</strike></p>
                            <div class="soldout"><p>Sold out</p></div>
                    </div>
                  
                   </a>
                   <a href="">
                    <div class="block">
                            <img src="images/307_o_large.jpg" alt="">
                            <h4>Name</h4>
                            <p>Prices</p>
                    </div>
                   </a>
                   <a href="">
                    <div class="block">
                            <img src="images/itemef16_large.jpg" alt="">
                            <h4>Name</h4>
                            <p>Prices  </p>
                    </div>
                   </a>
                   <a href="">
                    <div class="block">
                            <img src="images/itemlarge.jpg" alt="">
                            <h4>Name</h4>
                            <p>Prices</p>
                    </div>
                   </a>
                   <a href="">
                    <div class="block">
                            <img src="images/307_o_large.jpg" alt="">
                            <h4>Name</h4>
                            <p>Prices</p>
                    </div>
                   </a>
                   <a href="">
                    <div class="block">
                            <img src="images/itemef16_large.jpg" alt="">
                            <h4>Name</h4>
                            <p>Prices</p>
                    </div>
                   </a>
                   <a href="">
                    <div class="block">
                            <img src="images/itemlarge.jpg" alt="">
                            <h4>Name</h4>
                            <p>Prices</p>
                    </div>
                   </a>
                   
                </div><!--end grid-->   
            </div><!--end content-->
            <div class="col-sm-2 sort">
                <ul class="nav nav-category">
                    <li ><a class="sort_">Sort</a></li>
                    <li><a href="">Featured</a></li>
                    <li><a href="">Best Selling</a></li>
                    <li><a href="">Alphabetically, A-Z</a></li>
                    <li><a href="">Price, low to high</a></li>
                    <li><a href="">Price, high to lows</a></li>
                </ul>
            </div>
        </div>
    </div>
 </div><!--end body-->
 <div class="fixed">
 <div class="footer">
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
    </div><!--end footer-->   
</div> <!--end fixed-->             
</body>
</html>