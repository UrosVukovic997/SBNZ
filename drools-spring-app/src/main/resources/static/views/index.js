$(document).ready(function(){
	console.log("js radi");
	getStanice();
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
			
			function getCard(data) {
				//var restCateg = categ.includes('_')?categ.replace("_", " "):categ;
				let rest = '<div class="card" style="width: 18rem;">'
				  + '<div class="card-body">'
				  + '<p class="card-text">Naziv: ' + data.naziv + '<p>'
				  + '<p class="card-text">Lokacija: ' + data.lokacija + '<p>'
				  + '<p class="card-text">Rizivan vodostaj: ' + data.maxNivo + '<p>'
				  + '<input type="number" id="nivoVode" name="nivoVode" value= " '+ data.nivoVode>+ '">';
				
				return rest;
			}
			
			function getStanice() {
				$.ajax({
					url: "ms/all"
				}).then(function (data) {
					console.log(data);
					let j=0;
						for (var i = 0; i < data.length; i++, j++) {
							$('#scardHolder').find("tbody#tbSbiOglasi").append(getCard(data));
						}
							
					
				});
			}
		});