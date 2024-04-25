<script >
import Vue from 'vue';
import api from './api/api.js';
import HomePage from './components/HomePage.vue';
Vue.component('HomePage', HomePage)
export default{
  components:{
    HomePage
  },
  data(){
    
    return{
      users: [],
      userName: '',
      userAge: 0,
      userPassword: ''
      
    }
  },
  methods:{
    
    async signupUser() {
      const newUser = {
        userName: this.userName,
        age: this.userAge,
        password: this.userPassword
      }
      try {
        const response = await api.post('/auth/signup', newUser);
        console.log('Успешно зарегистрирован:',newUser);
      } catch (error) {
        console.log(this.userName);
      }
    },
    
    
  },
  // created() {
  //   api.get('unauthorized/get/users/')
  //     .then(response => {
  //       this.users = response.data;
  //     })
  //     .catch(error => {
  //       console.error(error);
  //     });
    
  // },
  // created(){
  //   const newUser = {
  //     userName: '',
  //     userAge: '',
  //     userPass: ''
  //     }
  //   api.post('/auth/signup', newUser)
  //     .then(response => {
  //       this.users = response.data;
  //     })
  //     .catch(error => {
  //       console.error(error);
  //     });
  // }

  
}
</script>

<template>
<div class="All">
  <header>
    <HomePage></HomePage>
    <li><router-link :to="{name:'home'}">Главная</router-link></li>
    <router-view/> 
  </header>
  <main>
    <div class="reg_window">
        <div class="reg_input">
            <input type="text" v-model="userName" placeholder="name">
            <input type="number" v-model="userAge" placeholder="age">
            <input type="password" v-model="userPassword" placeholder="password">
            
        </div>
        <div class="reg_Button">
            <button class="regBT" @click="signupUser()">
                отправить
            </button>
            <button class="regBT" @click="signupUser()">
                отправить
            </button>
        </div>
    </div>
    
  </main>
  <footer>
   
  </footer>
</div>
  
</template>





<style scoped>
input{
  margin-bottom: 1vh;
  background: rgb(255,255,255);
  background: linear-gradient(241deg, rgb(239, 161, 255) 0%, rgb(255, 255, 255) 100%);
  animation: gradient 2s infinite linear;
  background-size: 400%;
  height: 5vh;
  width: 30vh;
  border-color:rgba(252,0,255,1); 
  border-radius: 15px;
  align-items: center;
  font-size: 32px;
}
.All{
  display: column;
    align-items: center;
    justify-content:space-around;
    width: 100%;
    max-height:100vh;
  

}


.regBT{
  background: rgb(255,255,255);
  background: linear-gradient(241deg, rgba(0,254,255,1) 0%, rgba(252,0,255,1) 100%);
  animation: gradient 5s infinite linear;
  background-size: 400%;
  width: auto;
  height: auto;
  color: aliceblue;
  background-color: rgb(203, 148, 255);
  border-color: azure;
  border-radius: 35px;
  font-size: 35px;
  

}

.reg_window{
  width: 100%;
  height: 100%;
  margin-top: 15%;
  display: flex;
  justify-content:center;
  align-items: center;
  flex-direction: column;
 
}

.reg_input{
  width: 100%;
  height: 100%;
  margin-top: 10vh;
  margin-bottom: 5%;
  flex-direction: column;
  display: flex;
  justify-content:center;
  align-items: center;
  font-size: 35px;
  color: blueviolet;
  font-weight:bold;
}
.log{
  height: auto;
  width: auto;
  align-items: center;
  justify-content:space-around;
  margin-bottom:3vh;
}
.reg{
  height: auto;
  width: auto;
}

@keyframes gradient {
    0% {
        background-position: 80% 0%;
    }
    50% {
        background-position: 20% 100%;
    }
    100% {
        background-position: 80% 0%;
    }
  }

</style>

















<!-- <script >
export default{
  data(){
    return{

    }
  },
  methods:{
    
  }
}

</script>

<template>
<div class="All">
  <header>
    <div class="First">
      <h1 class="tilte">Welcom Svinopark</h1>
    </div>
  </header>
  <main>
    <div class="Reg_log">
      <div class="log">
      <button class="logBT"  @click="">Войти</button>
    </div>
    <div class ="reg">
      <button class="regBT" @click="">
        зарегистрироваится
      </button>
    </div>
    </div>
    
  </main>
  <footer>
    
  </footer>
</div>
  
</template>

<style scoped>
.All{
  display: column;
    align-items: center;
    justify-content:space-around;
    width: 100%;
    max-height:100vh;
  

}
.logBT{
  background: rgb(255,255,255);
background: linear-gradient(241deg, rgba(0,254,255,1) 0%, rgba(252,0,255,1) 100%);
  animation: gradient 5s infinite linear;
  background-size: 400%;
  width: auto;
  height: auto;
  /* background-color: rgb(203, 148, 255); */
  color: aliceblue;
  border-color: azure;
  border-radius: 35px;
  font-size: 35px;
}
.regBT{
  background: rgb(255,255,255);
  background: linear-gradient(241deg, rgba(0,254,255,1) 0%, rgba(252,0,255,1) 100%);
  animation: gradient 5s infinite linear;
  background-size: 400%;
  width: auto;
  height: auto;
  color: aliceblue;
  background-color: rgb(203, 148, 255);
  border-color: azure;
  border-radius: 35px;
  font-size: 35px;
  

}

.First{
  width: 100%;
  height: 100%;
  margin-top: 20%;
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 50px;
  color: blueviolet;
  font-weight:bold;
}

.Reg_log{
  width: 100%;
  height: 100%;
  margin-top: 10vh;
  margin-bottom: 20%;
  flex-direction: column;
  display: flex;
  justify-content:space-around;
  align-items: center;
  font-size: 35px;
  color: blueviolet;
  font-weight:bold;
}
.log{
  height: auto;
  width: auto;
  align-items: center;
  justify-content:space-around;
  margin-bottom:3vh;
}
.reg{
  height: auto;
  width: auto;
}

@keyframes gradient {
    0% {
        background-position: 80% 0%;
    }
    50% {
        background-position: 20% 100%;
    }
    100% {
        background-position: 80% 0%;
    }
  }

</style> -->
