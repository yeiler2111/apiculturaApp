import axios from "axios"
import { ElMessage } from "element-plus"

interface bodyLogin {
    "username": string,
    "password": string,
    "email": string,
    "role": string
}
const urlBase = 'http://localhost:8087'
export const servicesLogin = {
    async autheticactionLogin(body: any) {
        const urlServices = `${urlBase}/public/auth/login`
        try {
            const res = await axios.post(urlServices, body, { headers: { 'Accept': '*/*', "Content-Type":'application/json'} })
            return res
        } catch (error) {
            ElMessage({type:'error',message:'ha ocurrido un error, ver consola'})
            console.log(error)
        }
    }
}