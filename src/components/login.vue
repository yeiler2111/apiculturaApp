<script lang="ts" setup>
import { defineProps, onMounted, reactive } from 'vue';
import login from '@/components/login.vue';
import { User } from './type';
const form = reactive<User>({
  userName:'',
  password:'',
})

</script>

<template>
  <div class="container">
    <el-row class="sub-container" :gutter="12">
      <el-col class="image-container" :span="12">
         <div class="image"></div>
      </el-col>
      <el-col :span="12">
        <div class="title">
        <h3>Bienvenido!</h3>
      </div>
      <el-form v-model="form">
        <el-form-item >
          <span>Usuario</span>
          <el-input 
          v-model="form.name" placeholder="digite el usuario"/>
        </el-form-item>
        <el-form-item>
          <span>Password</span>
          <el-input v-model="form.password" placeholder="digite la contraseña"/>
        </el-form-item>
        <el-row justify="start">
          <a class="link" href="">recuperar contraseña</a>
        </el-row>
        <el-row>
          <el-col :span="24">
            <el-button type="warning">Ingresar</el-button>
          </el-col>
        </el-row>
      </el-form>
      </el-col>
    </el-row>
    </div>
  
</template>



<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
.image{
  background-image: url('../assets/apiculturaBG.jpg'); /* Ruta de tu imagen */
  width: 100%; /* Ocupa el 100% del ancho del contenedor */
  height: 100%; /* Ocupa el 100% del alto del contenedor */
  background-size: cover; /* Cubre todo el contenedor */
  background-position: center; /* Centra la imagen en el contenedor */
  background-repeat: no-repeat; /* Evita que la imagen se repita */
}
.container{
  background-color: white;
  height: 80%;
  max-width: 75%;
  min-width: 60%;
  width: 100%;
  margin: 0 auto;
  border-radius: 1.5rem;
  overflow: hidden;
  box-shadow: 0px 0px 40px 0px #c4c4c46e;
}

.sub-container{
  height: 100%;
}
.title{
  font-size: 2rem;
}
.link{
  font-size: small;
}

</style>
