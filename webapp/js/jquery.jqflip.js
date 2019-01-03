(function ($) {
    $.fn.extend({
        "jqflip": function (options) {
            if (!isValid(options))
                return this;
            var opts = $.extend({}, defaluts, options);
            return this.each(function () {
                var $this = $(this);
                var targetItem=$(opts.targetSelector);
                var targetParent=targetItem.parent();
                var targetStyle=targetItem.attr("style");
                var exItem=$this;
                var exParent=exItem.parent();
                var exStyle=exItem.attr("style");
                targetItem.addClass("jqflip-item-in");
                targetParent.css("height",exItem.css("height"));
                exItem.addClass("jqflip-item-out");
                exItem.before(targetItem).css("position","relative").css("top","-"+exItem.css("height"));
                exParent.css("height",exItem.css("height"));
                targetItem.removeClass("jqflip-item-in");
                setTimeout(function(){
                	targetParent.append($this);
                	exItem.removeClass("jqflip-item-out").css("top","");
                	var exClass=exItem.attr("class");
                	exItem.attr("class",targetItem.attr("class"));
                	targetItem.attr("class",exClass);
                },500);
            });
        }
    });
    var defaluts = {
        targetSelector: '.jqflip-back'
    };
    function isValid(options) {
        return !options || (options && typeof options === "object") ? true : false;
    }
})(window.jQuery);