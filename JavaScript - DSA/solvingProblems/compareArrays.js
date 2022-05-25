// Test case 1
const array1 = ['a', 'b', 'c', 'd'];
const array2 = ['x', 'y', 'z'];


// Test case 2
const arr1 = ['a', 'b', 'c', 'x'];
const arr2 = ['x', 'y', 'z'];


// ================================== (1) =====================================
// This is the brute force approach to solving this problem, it isn't efficient.
// The time complexity is O(a * b).
// Yeah, it's a nested loop. It's horrible, never use this.
function findSameItem(array1, array2) {
    for (let i = 0; i < array1.length; i++) {
        for (let j = 0; j < array2.length; j++) {
            if (array1[i] === array2[j]) {
                return true;
            } 
        }
    }
    return false;
}

const containItem = findSameItem(arr1, arr2);
// console.log(containItem);


// ================================== (2) =====================================
// This is rather a more efficient way of solving the problem;
function containSameItem(arr1, arr2) {

    let map = {};

    for (let i = 0; i < arr1.length; i++) {
        if (!map[arr1[i]]) {
           const item = arr1[i];
           map[item] = true;
        }
        
    }
  

    for (let j = 0; j < arr2.length; j++) {
        if (map[arr2[j]]) {
            return true;
        }
    }
    return false;
}

const doesItContain = containSameItem(arr1, arr2);
// console.log(doesItContain);


// ================================== (3) =====================================
// Using built-in javascript method
function containSameItem2(arr1, arr2) {
    return arr1.some(item => item.includes(arr2));

    // Foreach can also be used here.
    return arr1.forEach(element => element.includes(arr2));
}

const doesItContainSame = containSameItem(arr1, arr2);
// console.log(doesItContainSame);

const nums = [0,1,2,2,3,0,4,2];
let val = 2;

var removeElement = function(nums, val) {
    // console.log(nums.length);
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === val) {
            // console.log(nums[i], );
    
            nums.splice(i, );
            
        }
    }
    return nums.length;
    
};

console.log(removeElement(nums, val))





























<<<<<<< HEAD
		sendPushNotificationToCourierAndCentralAdmin(pickUpRequest,
				courierAdminUserAccount);

		// Send SMS
		sendSMSToCourierAndCentralAdmin(pickUpRequest, courierAdminUserAccount);

		// Send email
		sendEmailToCourierAndCentralAdmin(pickUpRequest, courierAdminUserAccount);
		return pickUpRequest;
	}

	private void sendPushNotificationToCourierAndCentralAdmin(PickUpRequest pickUpRequest,
			Optional<UserAccount> courierAdminUserAccount) {
		String message = "Batch request with ID - " + pickUpRequest.getRequestId()
				+ " has been sent by SORMAS";
		if (courierAdminUserAccount.isPresent()) {
			pushNotificationService.sendNewBatchRequestFromSORMAS(
					courierAdminUserAccount.get().getEmail(), message);
		}

		List<UserAccount> centralAdmins = userAccountDao
				.findAllByRoleRole(RoleConstant.CENTRAL_ADMIN);
		centralAdmins.forEach(centralAdmin -> {
			pushNotificationService.sendNewBatchRequestFromSORMAS(centralAdmin.getEmail(),
					message);
		});
	}

	private void sendSMSToCourierAndCentralAdmin(PickUpRequest pickUpRequest,
			Optional<UserAccount> courierAdminUserAccount) {
		String message = "Sample batch with ID - " + pickUpRequest.getBatchId()
				+ " has been initiated at "
				+ pickUpRequest.getOriginalOriginFacility().getState().getName()
				+ ADMIN_INIT_NOTIFICATION_MSG;

		sendSMS(courierAdminUserAccount.get().getPhoneNumber(), message);

		List<UserAccount> centralAdmins = userAccountDao
				.findAllByRoleRole(RoleConstant.CENTRAL_ADMIN);
		centralAdmins.forEach(centralAdmin -> {
			sendSMS(centralAdmin.getPhoneNumber(), message);
		});
	}

	private void sendEmailToCourierAndCentralAdmin(PickUpRequest pickUpRequest,
			Optional<UserAccount> courierAdminUserAccount) {
		sendInitiationMailToAdmin(pickUpRequest, courierAdminUserAccount.get());

		List<UserAccount> centralAdmins = userAccountDao
				.findAllByRoleRole(RoleConstant.CENTRAL_ADMIN);
		centralAdmins.forEach(centralAdmin -> {
			sendInitiationMailToAdmin(pickUpRequest, centralAdmin);
		});
	}

	private void sendInitiationMailToAdmin(PickUpRequest pickUpRequest,
			UserAccount courierAdmin) {
		MailContentDto contentDto = new MailContentDto();
		contentDto.setSubject("Batch Initialization Notification");
		contentDto.setEmail(courierAdmin.getEmail());
		contentDto.setFirstName(courierAdmin.getFirstName());
		contentDto.setBatchId(pickUpRequest.getBatchId());
		contentDto
				.setState(pickUpRequest.getOriginalOriginFacility().getState().getName());
		contentDto.setFacilityName(pickUpRequest.getOriginFacility().getName());
		contentDto.setDeliveryStatus("initialize");


		courierAdmins.forEach(admin -> {
			String message = "Batch request with ID - " + pickUpRequest.getRequestId()
					+ " has been sent by SORMAS";
			pushNotificationService.sendNewBatchRequestFromSORMAS(admin.getEmail(),
					message);
		});

		// Send SMS
		String smsMessage = "A new batch - " + pickUpRequest.getBatchId()
				+ " has been initiated at "
				+ pickUpRequest.getOriginalOriginFacility().getState().getName()
				+ " on ELSRT- Plus, Kindly visit the application to assign to a pickup agent.";
		sendSMSToCourierAndCentralAdmin(courierAdmins, smsMessage);

		// Send email
		sendInitiationMailToAdminAndCentralAdmin(pickUpRequest, courierAdmins);
		return pickUpRequest;
	}

	private void sendSMSToCourierAndCentralAdmin(
			List<UserAccount> courierAdminUserAccount, String smsMessage) {
		courierAdminUserAccount.forEach(
				courierAdmin -> sendSMS(courierAdmin.getPhoneNumber(), smsMessage));
		List<UserAccount> centralAdmins = userAccountDao
				.findAllByRoleRole(RoleConstant.CENTRAL_ADMIN);
		centralAdmins.forEach(
				centralAdmin -> sendSMS(centralAdmin.getPhoneNumber(), smsMessage));
	}

	private void sendInitiationMailToAdminAndCentralAdmin(PickUpRequest pickUpRequest,
			List<UserAccount> courierAdmins) {

		List<UserAccount> admins = userAccountDao
				.findAllByRoleRole(RoleConstant.CENTRAL_ADMIN);
		admins.addAll(courierAdmins);

		admins.forEach(administrator -> {
			MailContentDto contentDto = new MailContentDto();
			contentDto.setSubject("Batch Initialization Notification");
			contentDto.setEmail(administrator.getEmail());
			contentDto.setFirstName(administrator.getFirstName());
			contentDto.setBatchId(pickUpRequest.getBatchId());
			contentDto.setFacilityName(pickUpRequest.getOriginFacility().getName());
			contentDto.setDeliveryStatus("initialize");

			emailService.sendEmail(contentDto, BATCH_INIT_TEMPLATE);
		});
>>>>>>> c2312f414932c815c38d0702d45d723ca63d6d5d