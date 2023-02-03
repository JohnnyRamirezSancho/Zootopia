<script setup>
import Alert from'../components/Alert.vue'
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

            <div class="form-outline mb-4">
              <input type="email" id="typeEmailX-2" class="form-control form-control-lg" placeholder="Usuario"/>
              <label class="form-label" for="typeEmailX-2"></label>
            </div>

            <div class="form-outline mb-4">
              <input type="password" id="typePasswordX-2" class="form-control form-control-lg" placeholder="Contraseña" />
              <label class="form-label" for="typePasswordX-2" ></label>
            </div>


            <button type="button" class="btn btn-success" id="login">Login</button>

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
 background-image: url(../assets/img/background.jpg);
//  background-repeat: no-repeat;

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
    color: black;
    height: 8vh;
    width: 5vw;
  }

  

 }

}


</style>
