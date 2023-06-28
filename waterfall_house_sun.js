//Global Variables 
let upcyclingDate = new Date(); 
let upcyclingCharityName = '';
let upcyclingProjectName = ''; 
let upcyclingProjectCost = 0.00; 

// Set Upcycling Project Name
function setUpcyclingProjectName(projectName){
	upcyclingProjectName = projectName; 
}

// Set Upcycling Project Cost
function setUpcyclingProjectCost(projectCost) {
	upcyclingProjectCost = projectCost;
}

// Set Upcycling Charity Name
function setUpcyclingCharityName(charityName) {
	upcyclingCharityName = charityName;
}

// Calculate Donations Needed
function calculateDonationsNeeded() {
	let donationsNeeded = upcyclingProjectCost / 2;
	return donationsNeeded;
}

// Print Donation Goal to Console
function printDonationGoal() {
	let donationsNeeded = calculateDonationsNeeded();
	console.log('The ' + upcyclingProjectName + ' project needs $' + donationsNeeded + ' to be successfully funded by ' + upcyclingCharityName + '!');
}

// Calculate Upcycling Project Completion Date
function calculateProjectCompletionDate() {
	let projectCompletionDate = upcyclingDate.setMonth(upcyclingDate.getMonth() + 6);
	return projectCompletionDate;
}

// Print Upcycling Project Completion Date to Console
function printProjectCompletionDate() {
	let projectCompletionDate = calculateProjectCompletionDate();
	let completionDate = new Date(projectCompletionDate);
	let monthNames = ["January", "February", "March", "April", "May", "June",
  "July", "August", "September", "October", "November", "December"
];
	let completionMonthName = monthNames[completionDate.getMonth()];
	let completionYear = completionDate.getFullYear();
	console.log('The ' + upcyclingProjectName + ' project will be completed by ' + completionMonthName + ', ' + completionYear + '.');
}

// Create Upcycling Project on Website
function createUpcyclingProject(){
	let donationsNeeded = calculateDonationsNeeded();
	let completionDate = calculateProjectCompletionDate();
	let projectDetails = {
		name: upcyclingProjectName, 
		cost: upcyclingProjectCost, 
		charity: upcyclingCharityName, 
		goal: donationsNeeded, 
		completionDate: completionDate
	};
	return projectDetails;
}

// Print Upcycling Project Details to Console
function printProjectDetails(){
	let projectDetails = createUpcyclingProject();
	console.log('Upcycling Project Details: ');
	console.log('Name: ' + projectDetails.name);
	console.log('Cost: $' + projectDetails.cost);
	console.log('Charity: ' + projectDetails.charity);
	console.log('Goal: $' + projectDetails.goal);
	console.log('Project Completion Date: ' + projectDetails.completionDate);
}

// Update Upcycling Project Details 
function updateProjectDetails(name, cost, charity){
	setUpcyclingProjectName(name);
	setUpcyclingProjectCost(cost);
	setUpcyclingCharityName(charity);
}

// Start Upcycling Project
function startUpcyclingProject(name, cost, charity){
	updateProjectDetails(name, cost, charity);
	printDonationGoal();
	printProjectCompletionDate();
	printProjectDetails();
}

//Example Usage 
startUpcyclingProject('Recycled Toy Drive', 10000.00, 'The Green Initiative');