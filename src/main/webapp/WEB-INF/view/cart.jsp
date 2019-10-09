<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
        <head>
                <title> Example </title>

                <meta name="viewport" content="width=device-width, initial-scale=1">  
                <script type="text/javascript" src="static/vendor/bootstrap.js"></script>
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
                 <script type="text/javascript" src="static/1.js"></script>
                <link rel="stylesheet" href="static/vendor/bootstrap.css">
                <link rel="stylesheet" href="static/vendor/font-awesome.css">
                 <link rel="stylesheet" href="static/css/cart.css">
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
            <div class="col-sm-12">
                <div class="tbl">
                <h5>Giỏ hàng</h5>
                <table class="table table-stripped table-hover mt-2">
                    <thead>
                        <th></th>
                        <th>Tên sản phẩm</th>
                        <th>Số lượng</th>
                        <th>Giá tiền</th>
                        <th></th>
                    </thead>
                    <tr>
                        <td>
                            <a href=""><img src="images/3_master.jpg" alt=""></a>
                        </td>
                        <td><strong><a href="">DEEP GREY GANG SKINNY JEAN</a></strong><p>36</p></td>
                        <td>1</td>
                        <td>700,000₫</td>
                        <td><a href="" onclick="return confirm('Bạn có muỗn xóa không')">Xóa</a></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td><strong> Tổng cộng:</strong></td>
                        <td><p id="total">21000d</p></td>
                        <td> <button id="update" class="btn ">Cập nhật</button></td>
                    </tr>
                </table>
            </div><!--end tbl-->
            <div class="form ">
                <form action="/">
                <div class="left float-xs-left">
                   <label for="note">Ghi Chú</label> 
                   <textarea name="" id="note" ></textarea>
                </div>
                <div class="right float-xs-right">
                   
                    <button type="submit"  class="btn btn-primary">Thanh Toán</button>
                </div>
            </form>
            
            </div>
            </div><!-- end col-sm-10 -->
        </div><!--end row-->
    </div><!--end container-->
 </div><!--end body-->
 <div class="footer navbar-fixed-bottom">
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
    <script>
        $(document).ready(function(){
            $('#update').click(function(){
                var total=100000;
                $('#total').text(total);
                console.log(total);
            });
        });
    </script>       
</body>
</html>