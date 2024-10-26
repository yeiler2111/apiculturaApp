<script lang="ts" setup>
import login from '@/components/login.vue';

</script>
<template>
    <div class="bg">
        <login />
    </div>
</template>

<style scopep>
.bg{
    position: relative;
    width: 100%;
    height: 100vh;
    background-image: url('../../assets/fondoApiculturaLogin.jpg'); /* Imagen de fondo */
    background-size: cover;
    background-position: center;
    display: flex;
    align-items: center;
    justify-content: center;
    
}

.bg login{
    position: relative;
    z-index: 1; /* Asegura que el componente esté en la capa superior */
    background-color: rgba(255, 255, 255, 0.9); /* Fondo blanco semi-transparente */
    padding: 20px;
    border-radius: 8px;
    max-width: 400px;
    width: 100%;
    box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2);
}
</style>
