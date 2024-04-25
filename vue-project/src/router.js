import Vue from 'vue';
import Router from 'vue-router';
import HomePage from './components/HomePage.vue';
import{createRouter,createWebHistory}from 'vue-router';

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HomePage',
      component: HomePage
    },
    
  ]
});

const router = createRouter({
  history:createWebHistory(),
  routes,
})
