// import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router';
import HomePage from './components/HomePage.vue';

new Vue({
    router,
    render: h => h(App)
  }).$mount('#app');


createApp(App).use(router).mount('#app')
