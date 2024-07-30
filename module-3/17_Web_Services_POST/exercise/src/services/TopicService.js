import axios from 'axios';

const http = axios.create({
  baseURL: import.meta.env.VITE_REMOTE_API
});

export default {

  list() {
    return http.get('/topics');
  },

  get(id) {
    return http.get(`/topics/${id}`);
  },

  create(topic) {
    return http.post('/topics', topic);
  },

  update(topicId, updatedTopic) {
    return http.put(`/topics/${topicId}`, updatedTopic);
  },

  delete(topicId) {
    return http.delete(`/topics/${topicId}`);
  }

}
