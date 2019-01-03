window.addEventListener("load", function(){
	// Mobile Safari in standalone mode
	// Modified by CreativeJQ 2016-08-20
	if(("standalone" in window.navigator) && window.navigator.standalone){
		// Fix iOS web app AJAX return 0 error
		// https://bugs.jquery.com/ticket/8412
		jQuery.ajaxSetup({isLocal:true});
		// Prevent iOS webapp link to open Safari
		// http://www.wp-codes.com/prevent-ios-web-app-link-to-open-in-safari/
		// If you want to prevent remote links in standalone web apps from opening Mobile Safari, change 'remotes' to true
		var noddy, remotes = true;
		document.addEventListener('click', function(event) {
			noddy = event.target;
			// Bubble up until we hit link or top HTML element. Warning: BODY element is not compulsory so better to stop on HTML
			while(noddy.nodeName !== "A" && noddy.nodeName !== "HTML") {
				noddy = noddy.parentNode;
			}
			if('href' in noddy && noddy.href.indexOf('http') !== -1 && (noddy.href.indexOf(document.location.host) !== -1 || remotes)){
				event.preventDefault();
				document.location.href = noddy.href;
			}
		},false);
	}
});