<script setup lang="ts">
import sidebard from "@/shared/sidebard.vue";
</script>
<template>
    <div class="content">
        <el-row>
            <el-col :span="2">
                <sidebard class="size-sidebard"/>
            </el-col>
            <el-col :span="22">
                <el-row class="margin">
                    <el-alert class="alert" title="Unclosable alert" type="success" :closable="false" />
                </el-row>
                <el-row class="title">
                    <div>Extracciones</div>
                </el-row>
                <el-row>
                    <div class="margin">
                        <el-form>
                            <el-form-item>
                                <span>ID Alzas</span>
                                <el-input placeholder="idAlzas">
                                </el-input>
                            </el-form-item>
                            <el-form-item>
                                <span>Cantidad de cera(kg)</span>
                                <el-input placeholder="Cantidad de Cera Extraida KG">
                                </el-input>
                            </el-form-item>
                            <el-form-item>
                                <span>ID Panel</span>
                                <el-input placeholder="idPanel">
                                </el-input>
                            </el-form-item>
                            <el-date-picker
                                v-model="value2"
                                type="date"
                                placeholder="Selecciona la fecha"
                                :disabled-date="disabledDate"
                                :shortcuts="shortcuts"
                            />
                            
                        </el-form>
                    </div>
                </el-row>
                
            </el-col>
        </el-row>
    </div>
</template>


<style scoped>
.size-sidebard{
    width: 8.1%;
}
.width-container{
    width: 100%;
}
.title{
    font-size: 3rem;
    color: #9b9b9b;
}
.margin{
    margin-left: 1rem;
}



</style>