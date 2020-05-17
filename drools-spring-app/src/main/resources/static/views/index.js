$(document).ready(function(){
	console.log("js radi");
			$("form").submit(event=>{
				var title = $("#title").val();
			    var desc = $("#desc").val();
			    var start = $("#start").val();
			    start += ".000Z";
			    $.ajax({
			        url: request,
			        type: "POST",
			        dataType:'json',
			        success: function (response) {
			            console.log(response);
			        },
			        error: function(error){
			            console.log("Something went wrong", error);
			        }
			    });
			});
			
			function getStanice() {
				$.ajax({
					url: "TEST/merneStanice"
				}).then(function (data) {
					console.log(data);
					let j=0;
						for (var i = 0; i < data.length; i++, j++) {
						}
							
					
				});
			}
		});