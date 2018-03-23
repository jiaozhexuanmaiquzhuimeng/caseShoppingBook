<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页 - 顺带捎</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link href='http://fonts.useso.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Dancing+Script:400,700' rel='stylesheet' type='text/css'>
<script src="js/jquery.easydropdown.js"></script>
<script src="js/responsiveslides.min.js"></script>
<script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
</script>
<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
		    <script type="text/javascript">
			    $(document).ready(function () {
			        $('#horizontalTab').easyResponsiveTabs({
			            type: 'default', //Types: default, vertical, accordion           
			            width: 'auto', //auto or any width like 600px
			            fit: true   // 100% fit in a container
			        });
			    });
</script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
				});
			});
		</script>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
body,td,th {
	font-family: "Open Sans", sans-serif;
}
a:link {
	color: #fff;
	text-transform: uppercase;
	text-decoration: none;
}
</style>
</head>
<body>
    <!-- header-section-starts -->
	<div class="header">
		<div class="top-header">
			<div class="container">
				<div class="logo">
				  <p><a href="index.html"><img src="images/shundaishao.png" width="49" height="18"></a></p>
				</div>
				<div class="login-section">
					<ul>
						<li><a href="xueshengshaodai/index-dl.html">登录</a>  </li> |
						<li><a href="xueshengshaodai/zhucebiao.html">注册</a> &nbsp;</li>
					</ul>
			  </div>
				<!-- start search-->
<div class="search-box">
					    <div id="sb-search" class="sb-search">
							<form>
								<input class="sb-search-input" placeholder="请输入..." type="search" name="search" id="search">
								<input class="sb-search-submit" type="submit" value="">
								<span class="sb-icon-search"> </span>
							</form>
						</div>
  </div>
					<!-- search-scripts -->
					<script src="js/classie.js"></script>
					<script src="js/uisearch.js"></script>
						<script>
							new UISearch( document.getElementById( 'sb-search' ) );
						</script>
					<!-- //search-scripts -->
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="bottom-header">
			<div class="container">
				<div class="logo">
			    <a href="index.html">
					<h1>WELCOME</h1></a>
		    </div>
				<div class="header_bottom_right">
				<!-- start h_menu4 -->
					<div class="h_menu4">
					<a class="toggleMenu" href="">=</a>
					<ul class="nav">
						<li class="active"><a href="index.html">首页</a></li>
						<li><a href="products.html" >订餐</a>
							
						</li>
						<li><a href="wddd.html"> 我的订单</a>
						
						</li>
						<li><a href="xueshengshaodai/index-dl-zysdy.html">捎带员登录</a>
							
		    </li>
					    <li><a href="contact.html">联系我们</a></li>
						</ul>
						<script type="text/javascript" src="js/nav.js"></script>
				</div>
				<!-- end h_menu4 -->
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
	<!-- header-section-ends -->
	<!-- content-section-starts -->
	<div class="content">
		<div class="container">
		  <div class="watch-and-buy">
			  <div class="select">
					<h2>watch & Buy</h2>
			</div>
				<div class="preview">
					<img src="images/a4.png" alt="" />
					<i class="bag"></i>
			</div>
				<div class="preview">
					<img src="images/a5.png" alt="" />
					<i class="bag"></i>
			</div>
				<div class="preview span_66">
					<img src="images/a6.png" alt="" />
					<i class="bag"></i>
</div>
				<div class="clearfix"></div>
	      </div>
		  <div class="biseller-info">
		    <h3 class="new-models">美食推荐</h3>
		    <ul id="flexiselDemo3">
		      <li>
		        <div class="biseller-column"> <img src="ima/2.jpg" alt="" class="veiw-img">
		          <div class="biseller-name">
		            <h4>大杂烩</h4>
		            <p>￥8.00</p>
	              </div>
		          <button class="add2cart"> <i class="white-cart1"></i> <span>| 点击购买</span></button>
	            </div>
	          </li>
		      <li>
		        <div class="biseller-column"> <img src="ima/10.jpg" alt="" class="veiw-img">
		          <div class="biseller-name">
		            <h4>面包</h4>
		            <p>￥5</p>
	              </div>
		          <button class="add2cart"> <i class="white-cart1"></i> <span>| 点击购买</span></button>
	            </div>
	          </li>
		      <li>
		        <div class="biseller-column"> <img src="ima/14.jpg" alt="" class="veiw-img">
		          <div class="biseller-name">
		            <h4>披萨</h4>
		            <p>￥20</p>
	              </div>
		          <button class="add2cart"> <i class="white-cart1"></i> <span>| 点击购买</span></button>
	            </div>
	          </li>
		      <li>
		        <div class="biseller-column"> <img src="ima/7.jpg" alt="" class="veiw-img">
		          <div class="biseller-name">
		            <h4>冰淇淋 </h4>
		            <p>￥2</p>
	              </div>
		          <button class="add2cart"> <i class="white-cart1"></i> <span>| 点击购买</span></button>
	            </div>
	          </li>
	        </ul>
	      </div>
	<div class="sap_tabs">	
						 <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
						  <ul class="resp-tabs-list">
						  	  <li class="resp-tab-item" aria-controls="tab_item-2" role="tab"><span>家常菜</span></li>
						    <li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>甜点</span></li>
						    <li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>西餐</span></li>
							  <div class="clearfix"></div>
						  </ul>				  	 
							<div class="resp-tabs-container">
							    <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
									<ul class="tab_img">
									  <li>
										<div class="view view-first">
					   		  			   <img src="ima/1.jpg" class="img-responsive" alt=""/>
										   <div class="info1"><h4>hot</h4> </div>
											 <div class="mask">
						                        
							              </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>蛋炒饭</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥6.00</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
											
									    </div>
										  <img src="images/rating.png" alt="" />
									  </li>
										<li>
										  <div class="view view-first">
					   		  			   <img src="ima/2.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							                </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>大杂烩</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥8.00</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<li class="last">
										  <div class="view view-first">
					   		  			   <img src="ima/3.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							                </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>西红柿蛋花汤</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥5.00</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
									    <li>
									     <div class="view view-first">
					   		  			   <img src="ima/4.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							               </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>粉丝面</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥7.00</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<li>
										 <div class="view view-first">
					   		  			   <img src="ima/5.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							               </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>炸鸡</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥8.00</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<li class="last">
										  <div class="view view-first">
					   		  			   <img src="ima/6.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							                </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>猪肉盖饭</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥8.00</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<div class="clearfix"></div>
									</ul>
						      </div>	
							     <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
									<ul class="tab_img">
									  <li>
										<div class="view view-first">
					   		  			   <img src="ima/7.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							              </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>冰淇淋</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥2</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
									    </div>
										  <img src="images/rating.png" alt="" />
									  </li>
										<li>
										  <div class="view view-first">
					   		  			   <img src="ima/8.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							                </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>奶油蛋糕</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥8</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<li class="last">
										  <div class="view view-first">
					   		  			   <img src="ima/9.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							                </div>
								             <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>饼干</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥5</p>
											  </div>
											  <div class="clearfix"></div>
										    </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
									    <li>
									     <div class="view view-first">
					   		  			   <img src="ima/10.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							               </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>面包</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥5</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<li>
										 <div class="view view-first">
					   		  			   <img src="ima/11.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							               </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>豆糕</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥5</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<li class="last">
										  <div class="view view-first">
					   		  			   <img src="ima/12.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							                </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>双皮奶</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥5</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<div class="clearfix"></div>
									</ul>
							     </div>	
							     <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-2">
									<ul class="tab_img">
									  <li>
										<div class="view view-first">
					   		  			   <img src="ima/13.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							              </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>牛排</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥15</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
									    </div>
										  <img src="images/rating.png" alt="" />
									  </li>
										<li>
										  <div class="view view-first">
					   		  			   <img src="ima/14.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							                </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>披萨</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥20</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<li class="last">
										  <div class="view view-first">
					   		  			   <img src="ima/15.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							                </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>汉堡</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥5</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
									    <li>
									     <div class="view view-first">
					   		  			   <img src="ima/16.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							               </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>蔬菜沙拉</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥7</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<li>
										 <div class="view view-first">
					   		  			   <img src="ima/17.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							               </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>意式面</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥8</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<li class="last">
										  <div class="view view-first">
					   		  			   <img src="ima/18.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							                </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												 <h5>土豆泥</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>￥5</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<div class="clearfix"></div>
									</ul>
							     </div>	
							     <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-3">
									<ul class="tab_img">
									  <li>
										<div class="view view-first">
					   		  			   <img src="images/pic10.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							              </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>Lorem ipsum dolor</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>$59.95</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
									    </div>
										  <img src="images/rating.png" alt="" />
									  </li>
										<li>
										  <div class="view view-first">
					   		  			   <img src="images/pic2.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							                </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>Lorem ipsum dolor</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>$59.95</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<li>
										  <div class="view view-first">
					   		  			   <img src="images/pic9.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							                </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												 <h5>Lorem ipsum dolor</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>$59.95</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
									    <li>
									     <div class="view view-first">
					   		  			   <img src="images/pic4.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							               </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>Lorem ipsum dolor</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>$59.95</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<li>
										 <div class="view view-first">
					   		  			   <img src="images/pic13.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							               </div>
								              <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>Lorem ipsum dolor</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>$59.95</p>
											  </div>
											  <div class="clearfix"></div>
											  </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<li class="last">
										  <div class="view view-first">
					   		  			   <img src="images/pic8.jpg" class="img-responsive" alt=""/>
											 <div class="mask">
						                        <div class="info1"> </div>
							                </div>
								             <div class="tab_desc">
											  <div class="tab_desc_1">
												  <h5>Lorem ipsum dolor</h5>
											  </div>
											  <div class="tab_desc_2">
												  <p>$59.95</p>
											  </div>
											  <div class="clearfix"></div>
										    </div>
										  </div>
										  <img src="images/rating.png" alt="" />
										</li>
										<div class="clearfix"></div>
									</ul>
							</div>		        					 	        					 
					</div>	
              </div>
         </div>
	  </div>
	  <div class="container">
	    <script type="text/javascript">
				 $(window).load(function() {
					$("#flexiselDemo3").flexisel({
						visibleItems: 4,
						animationSpeed: 1000,
						autoPlay: false,
						autoPlaySpeed: 3000,    		
						pauseOnHover: true,
						enableResponsiveBreakpoints: true,
				    	responsiveBreakpoints: { 
				    		portrait: { 
				    			changePoint:480,
				    			visibleItems: 1
				    		}, 
				    		landscape: { 
				    			changePoint:640,
				    			visibleItems: 2
				    		},
				    		tablet: { 
				    			changePoint:768,
				    			visibleItems: 3
				    		}
				    	}
				    });
				    
				});
			   </script>
	    <script type="text/javascript" src="js/jquery.flexisel.js"></script>
		  <div class="best-seller"></div>
	    <script type="text/javascript">
				 $(window).load(function() {
					$("#flexiselDemo1").flexisel({
						visibleItems: 4,
						animationSpeed: 1000,
						autoPlay: true,
						autoPlaySpeed: 3000,    		
						pauseOnHover: true,
						enableResponsiveBreakpoints: true,
				    	responsiveBreakpoints: { 
				    		portrait: { 
				    			changePoint:480,
				    			visibleItems: 1
				    		}, 
				    		landscape: { 
				    			changePoint:640,
				    			visibleItems: 2
				    		},
				    		tablet: { 
				    			changePoint:768,
				    			visibleItems: 3
				    		}
				    	}
				    });
				    
				});
			   </script>
	    <script type="text/javascript" src="js/jquery.flexisel.js"></script>
	    <div class="clearfix"></div>
	  </div>
			<div class="shipping">
				<div class="container">
					<div class="shipping-section-grid">
		  <div class="col-md-7 shipping-left-grid">
							<h3>&nbsp;</h3>
						</div>
					  <div class="col-md-5 shipping-right-grid">
					    <h3>加载更多</h3>
					  </div>
					<div class="clearfix"></div>
					</div>
			  </div>
			</div>
</div>
	<!-- content-section-ends -->
	<!-- footer-section-starts -->
	<div class="footer"> 
		<div class="container">
			<div class="col-md-3 shop">
				<h3>用户帮助</h3>
				<ul>
					<li><a href="#">我的客服</a></li>
				</ul>
			</div>
			<div class="col-md-3 shop">
				<h3>商务合作</h3>
				<ul>
			    <li><a href="#">我要开店</a></li>
					<li><a href="#">市场合作</a></li>
					<li><a href="#">开放平台</a></li>
				</ul>
			</div>
			<div class="col-md-3 shop">
				<h3>关于我们</h3>
				<ul>
			    <li><a href="#">顺带捎介绍</a></li>
					<li><a href="#">加入我们</a></li>
					<li><a href="#">联系我们</a></li>
					<li><a href="#">规则中心</a></li>
				</ul>
			</div>
			<div class="col-md-3 shop">
			  <h3>关注我们</h3>
				<ul>
					<li></li>
				</ul>
			</div>
			<div class="clearfix"></div>
			<div class="copy-rights">
				<p>Shundaishao &copy;</p>
			</div>
		</div>
	</div>
	<!-- footer-section-ends -->

</body>
</html>