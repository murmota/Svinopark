import{createRouter,createWebHistory} from 'vue-router';
import HomePage from "./components/HomePage.vue";
import RegPage from "./components/RegPage.vue";
import LogPage from "./components/LogPage.vue";

export default  createRouter({
    history:createWebHistory(),
    routes:[
        {path:"/home",component:HomePage, alias:'/'},
        {path:"/reg",component:RegPage},
        {path:"/log",component:LogPage},

    ]
})