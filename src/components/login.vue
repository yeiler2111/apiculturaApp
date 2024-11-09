<script lang="ts" setup>
import { reactive } from "vue";
import { User } from "./type";
import { useLoginStore } from "../store/login/store.login";
import axios from "axios";
import jwt_decode, { jwtDecode } from "jwt-decode";
import { ElMessage } from "element-plus";
import router from "../router/index";

const useStoreLogin = useLoginStore();
const form = reactive<User>({
  userName: "",
  password: "",
});

const onSubmit = async () => {
  const data = await useStoreLogin.authetication(form);
  try {
    const payloadToken = jwtDecode(data.data);
    localStorage.setItem('tokenAccess',JSON.stringify(payloadToken))
    ElMessage({
      type: "success",
      message: "Iniciado sesion correctamente.!",
    });
    router.push({ name: "dashboardAdmin" });
  } catch (error) {
    console.log(error);
  }
};
</script>
<template>
  <div class="container">
    <el-row justify="center" class="sub-container" :gutter="12">
      <el-col class="image-container showImage" :span="12">
        <div class="image"></div>
      </el-col>
      <el-col class="center-content" :span="12">
        <div class="title">
          <h3>¡Bienvenido!</h3>
        </div>
        <el-form v-model="form">
          <el-row justify="center">
            <el-form-item class="input">
              <el-input
                v-model="form.userName"
                @change="
                  useStoreLogin.changeValueUser('userName', form.userName)
                "
                placeholder="@Usuario"
                class="size-input"
              >
                <template #prefix>
                  <el-icon class="color-icon">
                    <UserFilled />
                  </el-icon>
                </template>
              </el-input>
            </el-form-item>
            <el-form-item class="input">
              <el-input
                class="size-input"
                v-model="form.password"
                @change="
                  useStoreLogin.changeValueUser('password', form.password)
                "
                placeholder="Contraseña"
                type="password"
                show-password
              >
                <template #prefix>
                  <el-icon class="color-icon"><Unlock /> </el-icon>
                </template>
              </el-input>
            </el-form-item>
          </el-row>
          <el-row justify="center" style="">
            <!-- <button @click="this.$router({name:'dashboardAdmin'})" class="button">Ingresar</button> -->
            <el-button class="button" @click="onSubmit" type="warning"
              >Ingresar</el-button
            >
          </el-row>
          <el-row justify="center">
            <a class="link" href="">¿Olvidaste tu contraseña?</a>
          </el-row>
        </el-form>
      </el-col>
    </el-row>
  </div>
</template>

<style scoped lang="css">
.color-icon {
  color: #fdbc29;
}
.button {
  width: 80%;
  color: #fff;
  /* background: linear-gradient(to right, #fff, #FDBC29); */
  background-size: 500% 400%;
  background-position: 50% 80%;
  border-radius: 0.4rem;
  border: none;
  padding: 10px 20px;
  height: 3rem;
}
.center-content {
  margin: auto auto;
}
.size-input {
  height: 3rem;
}
.input {
  width: 80%;
  box-shadow: 2px 2px 2px 1px rgba(0, 0, 0, 0.1);
}
.image {
  background-image: url("../assets/apiculturaBG.jpg");
  width: 100%;
  height: 100%;
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;
}
.container {
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

.sub-container {
  height: 100%;
}
.title {
  font-size: 3rem;
}
.link {
  font-size: small;
  text-decoration: none;
  color: gray;
}

@media (max-width: 680px) {
  .showImage {
    display: none;
  }
}
</style>
