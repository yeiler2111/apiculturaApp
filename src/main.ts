import * as ElementPlusIconsVue from '@element-plus/icons-vue';
import ElementPlus from 'element-plus';
import 'element-plus/dist/index.css';
import { createPinia } from 'pinia';


import { createApp } from 'vue';
import App from './App.vue';
import router from './router';
// Registrar todos los iconos de Element Plus globalmente (opcional)
const pinia = createPinia()
const app =createApp(App)
app.use(ElementPlus);
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component);
}
app.use(pinia)
app.use(router).mount('#app')
