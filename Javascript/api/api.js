fetch('https://bumblebee-rest.examsdaily.in/domainTag/get/all/firstV1')	
	.then(response => {
	  if (!response.ok) {
	    throw new Error('Network response was not ok');
	  }
	  console.log(response.ok);
	  return response.json();
	})
	.then(data => {
	  console.log(data);
	})
	.catch(error  => {
	  console.error('There was a problem with the fetch operation:', error);
	});