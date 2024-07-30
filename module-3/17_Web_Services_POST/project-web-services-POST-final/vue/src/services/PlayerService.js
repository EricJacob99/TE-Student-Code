import axios from 'axios';

export default {


  getPlayers() {
     return axios.get('/players');
  },

  addPlayer(newPlayer) {
     return axios.post('/players', newPlayer);
  }

}