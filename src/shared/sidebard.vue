<script setup lang="ts">
</script>
<template>
    <div class="container h-screen w-16 md:w-20 lg:w-20 xl:w-20 text-center pt-14">
        <div class="opciones">
            <div class="opCirculo">
                <a href=""><img src={reservaIcon.src} alt="Reserva" width="30"></a>
            </div>
            <div class="opCirculo">
                <a href=""><img src={historialIcon.src} alt="Historial" width="30"></a>
            </div>
        </div>
        <div class="opcionCuenta">
            <div class="opCirculo">
                <a href=""><img src={usuarioIcon.src} alt="Usuario" width="30"></a>
            </div>
        </div>
    </div>
</template>

<style scoped>

.container {
    position: fixed;
    top: 0;
    left: 0;
    background: linear-gradient(to bottom, #FDBC29 50% ,  #FDBC29);
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: space-between;
    padding-bottom: 2rem;
}

.opciones{
    display: flex;
    flex-direction: column; 
    gap: 3rem;
}

.opcionCuenta{
    grid-row: 1;
    display: flex;
    flex-direction: column;
    gap: 5em;
}

.opCirculo{
    box-shadow: 2px 2px 2px 2px #00103d9f;
    border-radius: 200px;
    display: flex;
    justify-content: center;
    align-items: center;
    width: 3.2em;
    height: 3.2em;
    cursor: pointer;
}

.container img {
    filter: invert(1) brightness(2);
}



</style>