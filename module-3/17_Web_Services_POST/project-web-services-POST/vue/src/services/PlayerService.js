import axios from 'axios';

export default {


  getPlayers() {
     return axios.get('/players');
  }

}