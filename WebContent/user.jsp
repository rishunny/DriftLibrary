<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<%@include file="head.jsp" %>
<body>

    
   <%@include file="header.jsp" %>
    
    <div class="container">
        <div class="row">
            <div class="span8">
                <div class="content content_nav">
                    <div class="content_navbar">
                        <a class="content_navbar_tab content_navbar_tab_current" href="#">我的书架</a>
                        <a class="content_navbar_tab" href="#">想借</a>
                        <a class="content_navbar_tab" href="#">已借</a>
                        <a class="content_navbar_tab" href="#">可借</a>
                    </div>
                    <div>
                        <div class="book_list">
                            <h3 class="floatleft">我想借的</h3>
                            <a href="#" class="unslider1-arrow next button button-flat-primary button-tiny floatright"> >> </a>
                            <a href="#" class="unslider1-arrow prev button button-flat-primary button-tiny floatright"> << </a>
                            <div class="banner1">
                                <ul>
                                <s:iterator value="%{needlist }" id="item" status="count">
                        <s:if test="#count.index%5==1">
                        <li>
                         <a href="bookDetail?bookId=${item.getBookId()}"><img class="img_cover" src="${item.getImage() }" alt="${item.getTitle() }" /></a>
                        </s:if>
                        <s:if test="#count.index%5==4">
                        <a href="bookDetail?bookId=${item.getBookId()}"><img class="img_cover" src="${item.getImage() }" alt="${item.getTitle() }" /></a>
                        </li>
                        </s:if>
                        <s:else>
                        <a href="bookDetail?bookId=${item.getBookId()}"><img class="img_cover" src="${item.getImage() }" alt="${item.getTitle() }" /></a>
                        </s:else>
                        </s:iterator>
                                    <!-- <li>
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s6971618.jpg" alt="book1" />
                                        <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                        <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                    </li>
                                    <li>
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s6971618.jpg" alt="book1" />
                                        <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                        <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                    </li> -->
                                </ul>
                            </div>
                        </div> 
                        <div class="book_list">
                            <h3 class="floatleft">我已借的</h3>
                            <a href="#" class="unslider2-arrow next button button-flat-primary button-tiny floatright"> >> </a>
                            <a href="#" class="unslider2-arrow prev button button-flat-primary button-tiny floatright"> << </a>
                            <div class="banner2">
                                <ul>
                                    <li>
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s6971618.jpg" alt="book1" />
                                        <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                        <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                    </li>
                                    <li>
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s6971618.jpg" alt="book1" />
                                        <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                        <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                    </li>
                                </ul>
                            </div>
                        </div> 
                        <div class="book_list">
                            <h3 class="floatleft">我可借的</h3>
                            <a href="#" class="unslider3-arrow next button button-flat-primary button-tiny floatright"> >> </a>
                            <a href="#" class="unslider3-arrow prev button button-flat-primary button-tiny floatright"> << </a>
                            <div class="banner3">
                                <ul>
                                <s:iterator value="%{ownList }" id="item" status="count">
                        		<s:if test="#count.index%5==1">
                       			 <li>
                        		 <a href="bookDetail?bookId=${item.getBookId()}"><img class="img_cover" src="${item.getImage() }" alt="${item.getTitle() }" /></a>
                       		    </s:if>
                        		<s:if test="#count.index%5==4">
                      			  <a href="bookDetail?bookId=${item.getBookId()}"><img class="img_cover" src="${item.getImage() }" alt="${item.getTitle() }" /></a>
                       				 </li>
                       			 </s:if>
                       			 <s:else>
                        		<a href="bookDetail?bookId=${item.getBookId()}"><img class="img_cover" src="${item.getImage() }" alt="${item.getTitle() }" /></a>
                       			 </s:else>
                        		</s:iterator>
                                    <!-- <li>
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s6971618.jpg" alt="book1" />
                                        <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                        <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                    </li>
                                    <li>
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s6971618.jpg" alt="book1" />
                                        <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                        <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                        <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                    </li> -->
                                </ul>
                            </div>
                        </div> 
                    </div>
                </div>
            </div>
    
            <div class="span4">
                <div class="content box_user">
                    <img class="user_photo" src="http://www.gravatar.com/avatar/f056d7298d8076c2c5283c078a9ad4a9?s=45" alt="" />
                    <p class="user_name pd10" >tzwm</p>
                    <br />
                    <a class="pd10" href="#">设置</a>
                    <br />
                    
                    <div class="userBox_count">
                        <span>
                            <label id="count_donate">0</label>
                            捐赠
                        </span>
                        <span>
                            <label id="count_borrow">0</label>
                            借入
                        </span>
                    </div>
                </div>
    
                <div class="content">
                    <h3>捐书</h3>
                    <form class="form-inline" action="#">
                        <input type="text" style="width:180px;" id="isbn_input" placeholder="ISBN" name="isbn_input" />
                        <input class="button glow button-rounded button-flat-primary button-small" type="submit" name="donate" value="捐出"/>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script type="text/javascript">
        var unslider1 = $('.banner1').unslider();
        $('.unslider1-arrow').click(function() {
            var fn = this.className.split(' ')[1];
            //  Either do unslider.data('unslider').next() or .prev() depending on the className
            unslider1.data('unslider')[fn]();
        });
        var unslider2 = $('.banner2').unslider();
        $('.unslider2-arrow').click(function() {
            var fn = this.className.split(' ')[1];
            //  Either do unslider.data('unslider').next() or .prev() depending on the className
            unslider2.data('unslider')[fn]();
        });
        var unslider3 = $('.banner3').unslider();
        $('.unslider3-arrow').click(function() {
            var fn = this.className.split(' ')[1];
            //  Either do unslider.data('unslider').next() or .prev() depending on the className
            unslider3.data('unslider')[fn]();
        });
    </script>

</body>
