/**
 * 全局类，用于存储常用方法和
 * 全局变量
 */
;
NavObj = (function ($, window, document) {
    var c = null;
    return {

        init: function () {
            c = this;
            c.intNavView();
            c.initUserInfo();
        },
        intNavView: function () {
            //初始化
            $('.subMenu').hide();
            $('li.active>.subMenu').show();
            //给菜单项添加事件
            $('.navMenu a').click(function () {
                //获取所属列表ul
                var $subMenuElement = $(this).next();
                var $liElement = $(this).parent();
                var $ulElement = $(this).parent().parent();
                //没有子菜单，则直接返回
                if (!$subMenuElement.is('ul')) {
                    $ulElement.find('li').removeClass('active');
                    $ulElement.find('ul.subMenu').slideUp();
                    $liElement.addClass('active');
                    return;
                }
                //如果存在子菜单，则打开或者关闭
                if (!$liElement.hasClass('active')) {
                    $ulElement.find('li').removeClass('active');
                    $ulElement.find('ul.subMenu').slideUp();
                    $liElement.addClass('active');
                    $subMenuElement.slideDown();
                } else {
                    //打开状态 则关闭本菜单
                    $subMenuElement.slideUp();
                    $liElement.removeClass('active');

                }
            });
        }

    };
})(jQuery, window, document);
//调用初始化方法
$(NavObj.init());