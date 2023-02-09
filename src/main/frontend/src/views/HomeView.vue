<script setup>
import Alert from'../components/Alert.vue'
import { useUserStore } from '../stores/storeUser';
import { onBeforeMount } from 'vue';

const store = useUserStore();

onBeforeMount(async () => {
  await store.fetchUsers();
  console.log(store.Users);
})

onBeforeMount(async () => {
  await store.fetchUsers();


})


//the next script checks user and passwords for login

function validate(){
  let mostrarBryan = store.Users[1].user;
  console.log(mostrarBryan.user);
  let mostrarBryanPass = store.Users[1].password;
  console.log(mostrarBryanPass.password);
  let mostrarGiacomo = store.Users[0];
  console.log(mostrarGiacomo.user);
  let mostrarJohnny = store.Users[2];
  console.log(mostrarJohnny.user);
  let mostrarVito = store.Users[3];
  console.log(mostrarVito.user);

  const username = document.getElementById("typeEmailX-2").value;
  const password = document.getElementById("typePasswordX-2").value;
  if(username == mostrarBryan && password == mostrarBryanPass){
    location.href="/Dashboard"
  } 
  else {
    alert(mostrarBryan)
  }
}

</script>

<template>
<Alert></Alert>
<section class="vh-100">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card shadow-2-strong" id="bigCard" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">

            <h3 class="mb-5">WELCOME TO ZOOTOPIA COMMUNITY</h3>
            <form>
            <div class="form-outline mb-4">
              <input type="text" id="typeEmailX-2" class="form-control form-control-lg" placeholder="Usuario"/>
              <!-- <label class="form-label" for="typeEmailX-2" :value="user.user" v-for="user in store.Users" :key="user"><p>{{ user.name }}</p></label> -->
            </div>

            <div class="form-outline mb-4">
              <input type="password" id="typePasswordX-2" class="form-control form-control-lg" placeholder="Contraseña" />
              <!-- <label class="form-label" for="typePasswordX-2" ></label> -->
            </div>
            <input type="submit" name="" value="Login" @click="validate()"/>
          </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

</template>

<style lang="scss" scoped>
@font-face {
    font-family: Title;
    src: url(../assets/fonts/fz-zootopia-jposterscomar);
}
@font-face {
    font-family: Mont;
    src: url(../assets/fonts/MontserratAlternates-Bold.ttf);
}

section{
 background: url(../assets/img/background.jpg) no-repeat center center fixed;
 background-size: cover;


 #bigCard{
    background-color: rgba(211, 60, 12, 0.5);


  h3{
    font-family: Mont;
    color: #fff;

  }

  ::placeholder{
   color: black;
   font-family: Mont;
  }

  #login{
    background-color: #28A745;
    border: none;
    color: black;
    height: 7vh;
    border-radius: 10%;

  }

  

 }

}


</style>
