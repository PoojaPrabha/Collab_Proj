/**
 * FriendService
 */
app.factory('FriendService', function($http) {
	var friendService = {}
	var BASE_URL = "http://localhost:8081/collaboration_middleware"
	friendService.getSuggestedUsers = function() {
		return $http.get(BASE_URL + "/suggestedusers")
	}

	friendService.addFriend = function(user) {// toId in friend table
		return $http.post(BASE_URL + "/addfriend", user)
	}
	friendService.getPendingRequests = function() {
		return $http.get(BASE_URL + "/pendingrequests")
	}
	friendService.updateFriendRequest = function(friendRequest) {

		return $http.put(BASE_URL + "/updatependingrequest", friendRequest)
	}
	friendService.listOfFriends = function() {
		return $http.get(BASE_URL + "/friends")
	}

	return friendService;
})
