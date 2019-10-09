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
                 <link rel="stylesheet" href="static/css/checkout.css">
                 <link href="https://fonts.googleapis.com/css?family=Big+Shoulders+Text:100,300,400,500,600,700,800,900&display=swap&subset=vietnamese" rel="stylesheet"> 
                 <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
            </head>
<body>
       
 <div class="body">
<div class="container">
    <div class="row">
        <div class="col-sm-7 left">
            <a href=""><h2>MOLLYCLO</h2></a>
            <ul class="list-inline">
              <li class="list-inline-item ">
                <a class="u-link-v5 g-color-main" href="/">Giỏ Hàng</a>
                <i class="fa fa-angle-right g-ml-7"></i>
              </li>
              <li class="list-inline-item g-color-primary ">
                <span>Thanh toán đơn hàng</span>
              </li>
            </ul>
            <h6>Thông tin giao hàng</h6>
            <p class="mt-1" >Bạn đã có tải khoản?<a href="">Đăng Nhập</a></p>
            <form action="">
                <div class="long-field">
                <input type="text" class="form-control long" placeholder="Họ và tên">
                </div>              
                <div class="inline">
                <div class="medium-field ">
                <input type="text" class="form-control medium " placeholder="Email">
                </div>
                <div class="short-field ">
                <input type="text" class="form-control short" placeholder="Số điện thoại">
                </div>   
            </div>
                <div class="long-field">
                <input type="text" class="form-control long" placeholder="Địa chỉ">
                </div>
            <h6 class="mt-1 mb-1">Phương thức vận chuyển</h6>
            <div class="form-check form-control" >
              <input class="form-check-input " type="radio" name="TransportMethod" id="exampleRadios1" value="option1" checked>
              <label class="form-check-label" for="exampleRadios1">
                Giao Hàng tận nơi
              </label>
              
              <span>50.000đ</span>
            
            </div>
            <h6 class="mb-1">Phương thức thanh toán</h6>
            <div class="form-check form-control" >
              <input class="form-check-input " type="radio" name="ModeOfPayment" id="Radios1" value="option1" checked>
              <label class="form-check-label" for="exampleRadios1">
               CODE - POWER BY GIAOHANGTIETKIEM
              </label>
            </div>
            <div class="notify">
              MOLLYCLO sẽ liên hệ với bạn qua điện thoại để xác nhận và gửi hàng sau khi bạn đặt hàng thành công trên website.
Nếu quá 3 ngày chưa thấy shop gọi nghĩa là sản phẩm đã hết hàng.
            </div>
            <button type="submit" class="btn  mt-2 finish  ">Hoàn tất đơn hàng</button>
          </form>
            </div> <!--end left-->
      
        <div class="col-sm-5 right">
          <table class="table">
            <tbody>
              <tr>
                <td><img src="images/727_n_large.jpg" alt=""></td>
                <td>DEEP GREY GANG SKINNY JEAN<p>36</p></td>
                <td>2,100,000₫ </td>
              </tr>
            </tbody>
          </table>
          <hr>
          <form action="" class="mb-1">
            <div>
            <input type="text" class="form-control" placeholder="Mã giảm giá">
            <button type="submit" class="btn mt-1 float-xs-right">Sử dụng</button>
          </div>
          </form>
          <div class="mt-1">
          <table class="table ">
            <tbody>
              <tr>
                <td>Tạm tính</td>
                <td class="">2.100.000đ</td>
              </tr>
              <tr>
                  <td>Phí vận chuyển</td>
                  <td>50.000đ</td>
              </tr>
            </tbody>
            <tfoot>
              <tr>
                <td>Tổng cộng</td>
                <td>2.100.000đ</td>
              </tr>
            </tfoot>
          </table>
        </div>
        </div> <!--end right-->
        </div><!--end row-->
    </div> <!--end container-->
</div> <!--end body-->
 
 
</body>
</html>