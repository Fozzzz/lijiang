<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>丽江古城--美食-酒吧</title>
<link href="../css/css.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="../js/jquery/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="../js/jquery/index_tab.js"></script>
<script type="text/javascript" src="../js/jquery/left_roll.js"></script>
<script type="text/javascript" src="../js/Page-loading.js"></script>  
<script type="text/javascript" src="../js/Bb-tile.js"></script>
<script type="text/javascript" src="../js/room-flash.js"></script>
</head>

<body>
   <!--background picture begin-->
   <div class="picture" id="picture"><img id="bgImg" src="../images/home_top_bg.jpg" height="742"></div>
   <!--background picture end-->

   <div class="total" id="total">
   
      <!--total-width begin-->
      <div class="w1180">

         <!--top begin-->
         <div class="Lj-head">
         
            <!--head-left begin-->
            <div class="head-left">
              <a href="javascript:" style=" margin-bottom:6px"><img src="../images/img_01_01.jpg"/></a>
              <a href="javascript:"><img src="../images/img_01_02.jpg"/></a>
            </div>
            <!--head-left end-->
            
            <!--head-right begin-->
            <div class="head-nav">
                
                <!--===================-->
                <div class="head-top" id="push">
                <span class="new"><img src="../images/icon_01_02.png"></span>
                  <ul>
                     <li id="f1" class="dq" onclick="changeflash(1)">首页</li>
                     <li id="f2" onclick="changeflash(2)">文化古城</li>
                     <li id="f3" onclick="changeflash(3)">古城保护</li>
                     <li id="f4" onclick="changeflash(4)">古城维护费</li>
                     <li id="f5" onclick="changeflash(5)">漫游古城</li>
                     <li id="f6" onclick="changeflash(6)">旅游攻略</li>
                     <li id="f7" onclick="changeflash(7)">丽江文化</li>
                  </ul>
                </div>
                <!--===================-->
                
                <!--===================-->
                <div class="head-text">
                   <div id="push1" class="protect" style=" display:block">
                      <div class="conduct">
                      <a href="javacript:"><img src="../images/img_01_28.jpg"/></a>
                      <a href="javacript:"><img src="../images/img_01_29.jpg"/></a>
                      </div>
                   </div>
                   <div id="push2" class="protect">
                      <div class="conduct"><img src="../images/img_01_04.jpg"/>
                      <div class="conduct-text">
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_04.png"/></div><span>丽江古城</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_05.png"/></div><span>历史名人</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_06.png"/></div><span>纳西古乐</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_06.png"/></div><span>东巴文化</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_06.png"/></div><span>民风民俗</span></a>
                      </div>
                      </div>
                   </div>
                   <div id="push3" class="protect">
                      <div class="conduct"><img src="../images/img_01_05.jpg"/>
                      <div class="conduct-text">
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_07.png"/></div><span>法律法规</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_08.png"/></div><span>管理指南</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_09.png"/></div><span>便民服务</span></a>
                      </div>
                      </div>
                   </div>
                   <div id="push4" class="protect">
                      <div class="conduct"><img src="../images/img_01_03.jpg"/>
                      <div class="conduct-text">
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_11.png"/></div><span>古维政策</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_12.png"/></div><span>在线缴纳</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_13.png"/></div><span>缴纳查询</span></a> 
                      </div>
                      </div>
                   </div>
                   <div id="push5" class="protect">
                      <div class="conduct"><img src="../images/img_01_03.jpg"/>
                      <div class="conduct-text">
                      <!--A标签可复制到这里-->
                      </div>
                      </div>
                   </div>
                   <div id="push6" class="protect">
                      <div class="conduct"><img src="../images/img_01_03.jpg"/>
                      <div class="conduct-text">
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_15.png"/></div><span>美&nbsp;食</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_16.png"/></div><span>住&nbsp;宿</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_17.png"/></div><span>酒&nbsp;吧</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_18.png"/></div><span>音&nbsp;乐</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_15.png"/></div><span>恋在丽江</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_16.png"/></div><span>周边景点</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_17.png"/></div><span>古城地图</span></a>
                      </div>
                      </div>
                   </div>
                   <div id="push7" class="protect">
                      <div class="conduct"><img src="../images/img_01_06.jpg"/>
                      <div class="conduct-text">
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_19.png"/></div><span>文化动态</span></a>
                      <a href="javascript:"><div class="img"><img src="../images/icon_01_20.png"/></div><span>文化期刊</span></a>
                      </div>
                      </div>
                   </div>
                   
                </div>
                <!--===================-->
               
            </div>
            <!--head-right end-->
           
         </div>
         <!--top end-->
         
         <!--center begin-->
         <div class="Lj-cen">
         
            <!--left begin-->
            <div class="w355">
            
               <!--========================-->
               <div class="Lj-cost">
                  <span><img src="../images/icon_01_22.jpg"/></span>
                  <div class="Lj-roll">
                  <ul>
                      <c:forEach var="temp" items="${pageFee.list}">
                          <li><img src="../images/icon_01_23.png"/><a href="javascript:">${temp.n_title}</a></li>
                      </c:forEach>
                  </ul>
                  </div>
               </div>
               <!--========================-->
               
               <!--========================-->
               <div class="Lj-img">
                 <span><img src="../images/img_01_07.jpg"/></span>
                 <a href="javascript:"><img src="../images/img_01_08.jpg"/></a>
               </div>
               <!--========================-->
               
               <!--========================-->
               <div class="Lj-love">
                 <span><img src="../images/img_01_09.jpg"/></span>
                 <div class="Lj-trends">
                    <ul>
                        <c:forEach var="temp" items="${pageLove.list}">
                            <li><a href="javascript:">${temp.n_title}</a></li>
                        </c:forEach>
                    </ul>
                 </div>
               </div>
               <!--========================-->
               
               <!--========================-->
               <div class="Lj-advert">
                 <a href="javascript:"><img src="../images/img_01_25.jpg"/></a>
                 <a href="javascript:"><img src="../images/img_01_26.jpg"/></a>
                 <a href="javascript:"><img src="../images/img_01_27.jpg"/></a>
               </div>
               <!--========================-->
                
            </div>
            <!--left end-->
            
            <!--right begin-->
            <div class="w786">
            
             <!--title begin-->
             <div class="Lj-news-title"><span><img src="../images/icon_06_07.jpg"/></span><div>小桥流水，入住纳西客栈，寻找古城印象</div></div>
             <!--title end-->
             
             <!--text begin-->
             <div class="Lj-Bar-List">
             
                <ul>
                    <c:forEach var="temp" items="${pageFood.list}">
                        <li>
                            <div class="Bar-flash">

                                <!--显示大图 begin-->
                                <div class="Bar-big"><a href="javascript:"><img id="bigImg" class="pic-img" width="176" height="127" src="../images/img_07_01.jpg"/></a></div>
                                <!--显示大图 end-->

                                <!--Bar-circle begin-->
                                <div class="Bar-circle">
                                    <a class="clickL" href="javaScript:Scroll('Direction',1)"><img id="oBtn_Left" src="../images/icon_07_03.jpg"/></a>
                                    <div id="smallImg" class="picarea">
                                        <div class="imgbox" id="smallSpace">
                                            <a href="javascript:"><img src="../images/img_01_16.jpg" onclick="changeBigImg(this)"/></a>
                                            <a href="javascript:"><img src="../images/img_01_17.jpg" onclick="changeBigImg(this)"/></a>
                                            <a href="javascript:"><img src="../images/img_01_18.jpg" onclick="changeBigImg(this)"/></a>
                                            <a href="javascript:"><img src="../images/img_01_19.jpg" onclick="changeBigImg(this)"/></a>
                                            <a href="javascript:"><img src="../images/img_01_20.jpg" onclick="changeBigImg(this)"/></a>
                                            <a href="javascript:"><img src="../images/img_01_21.jpg" onclick="changeBigImg(this)"/></a>
                                            <a href="javascript:"><img src="../images/img_01_22.jpg" onclick="changeBigImg(this)"/></a>
                                        </div>
                                    </div>
                                    <a class="clickR" href="javaScript:Scroll('Direction',-1)"><img id="oBtn_Right" src="../images/icon_07_02.jpg"/></a>
                                </div>
                                <!--Bar-circle end-->

                            </div>

                            <!--详情 begin-->
                            <div class="Bar-Text">
                                <h1 class="Bar-h1"><a href="javascript:">${temp.n_title}</a></h1>
                          <span class="Bar-Txt">${temp.n_content}</span>
                                <i class="Bar-Text-i">地址：丽江 束河古镇 七一街道</i>
                                <i class="Bar-Text-i">电话：13880134567</i>
                            </div>
                            <!--详情 end-->
                        </li>
                    </c:forEach>

                </ul>
                
                <div class="Lj-news-page">共6条记录 1/1页<a href="javascript:">首页</a><a href="javascript:">上一页</a><a href="javascript:">下一页</a><a href="javascript:">尾页</a>第<select class="select"><option>1</option><option>2</option></select>页</div>
             </div>
             <!--text end-->
              
              
            </div>
            <!--right end-->
            
         </div>
         <!--center end-->
      
         <!--footer begin-->
          <div class="Lj-footer">
             <div class="footer-top">
               <a href="javascript:">云南网</a>|
               <a href="javascript:">丽江政务网</a>|
               <a href="javascript:">古城之窗</a>|
               <a href="javascript:">玉龙雪山风景区</a>|
               <a href="javascript:">泸沽湖</a>|
               <a href="javascript:">携程网</a>|
               <a href="javascript:">泸沽湖</a>|
               <a href="javascript:">印象丽江</a>|
               <a href="javascript:">古城之窗</a>|
               <a href="javascript:">玉龙雪山</a>
             </div>
          <div class="footer-text">
             <div class="footer-in">
               世界文化遗产丽江古城保护管理局、丽江古城管理有限责任公司版权所有.<br/>
               ICP证:滇ICP备08101331号   地址:云南省丽江市古城区五一街文治巷72号<br/>
               技术支持：云南孚旭信息技术有限公司
             </div>
           <div class="footer-img"><img src="../images/img_01_21.jpg"><img src="../images/img_01_22.jpg"></div>
           </div>
           </div>
         <!--footer end-->
      
      </div>
      <!--total-width end-->
   
   </div> 
   <!--屏蔽右键,F12 begin<script type="text/javascript" src="../js/Shielding-key.js"></script>--><!--屏蔽右键,F12 end-->
</body>
</html>