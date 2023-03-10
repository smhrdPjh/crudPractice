import axios from "axios";

const USER_API_BASE_URL = "http://localhost:8071/user";

class ApiService {
  fetchUsers() {
    return axios.get(USER_API_BASE_URL);
  }

  fetchUserByID(userID) {
    return axios.get(USER_API_BASE_URL + "/" + userID);
  }

  deleteUser(userID) {
    return axios.post(USER_API_BASE_URL + "/delete/" + userID);
  }

  addUser(user) {
    return axios.post(USER_API_BASE_URL, user);
  }

  editUser(user) {
    return axios.post(USER_API_BASE_URL + "/" + user.id, user);
  }
}
export default new ApiService();
