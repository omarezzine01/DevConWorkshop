function addClickEventToUserIcon() {
	var userIcon = document.getElementsByClassName('user-icon')[0];

	userIcon.addEventListener('click', function() {
		navigator.camera.getPicture(
			function(data) { 
				document.getElementsByClassName('user-icon')[0].style="background-image:url(data:image/jpeg;base64,"+ data + ")"
			},
			function(error){
				console.log(error);
			},
			{
				quality: 25,
                destinationType: Camera.DestinationType.DATA_URL
            }
        );
	});
}


addClickEventToUserIcon();