import { createRouter as _createRouter, createWebHistory } from 'vue-router';
import HomeView from '../views/HomeView.vue';
import ReadingList from '../views/MyBooksView.vue';
import NewBookForm from '../views/NewBookView.vue';



const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/myBooks',
    name: 'myBooks',
    component: ReadingList
  },
  {
    path: '/addBook',
    name: 'NewBook',
    component: NewBookForm
  }

];

export function createRouter () {
  return _createRouter({
    history: createWebHistory(),
    routes: routes
  })
}
