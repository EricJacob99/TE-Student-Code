import { createRouter as _createRouter, createWebHistory } from 'vue-router';
import ProductView from '../views/ProductView.vue';
import HappyHappyJoyJoy from '../views/HappyHappyJoyJoyView.vue';
import ProductDetailView from '../views/ProductDetailView.vue';
import AddReviewView from '../views/AddReviewView.vue';

const routes = [
  {
    path: '/',
    name: 'products',
    component: ProductView
  },
  {
    path: '/happy',
    name: 'happy',
    component: HappyHappyJoyJoy
  },
  {
    path: '/products/:id',
    name: 'product-detail',
    component: ProductDetailView
  },
  {
    path: '/products/:id/add-review',
    name: 'add-review',
    component: AddReviewView
  }


];

export function createRouter () {
  return _createRouter({
    history: createWebHistory(),
    routes: routes
  })
}
