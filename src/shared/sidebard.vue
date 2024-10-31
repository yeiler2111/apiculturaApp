<script setup lang="ts">
</script>
<template>
    <div class="container h-screen w-16 md:w-20 lg:w-20 xl:w-20 text-center pt-14">
        <div class="opciones">
            <div class="opCirculo">
                <el-icon class="color-icon" :size="30" :color="color">
                    <House />
                </el-icon>
            </div>
            <div class="opCirculo">
                <el-icon :size="30" class="color-icon"><SuitcaseLine /></el-icon>
            </div>
        </div>
        <div class="opcionCuenta">
            <div class="opCirculo">
                <el-icon :size="30" class="color-icon"><ElementPlus /></el-icon>
            </div>
        </div>
    </div>
</template>

<style scoped>
    .color-icon{
        color: #fff;
    }
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
    @media(max-width: 790px){
        .opCirculo{
            width: 2.5em;
            height: 2.5em;
        }
    }
    @media(max-width: 610px){
        .opCirculo{
            width: 1.8em;
            height: 1.8em;
        }
        .color-icon{
            font-size: 1px;
        }
    }
</style>