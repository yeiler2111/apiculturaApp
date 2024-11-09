import { USER_MODEL } from '@/components/data';
import { ElMessage } from 'element-plus';
import { defineStore } from 'pinia';
import { User } from '../../components/type';
import { servicesLogin } from '../../services/login/services.login';


interface Body {
    user: User,
}
export const useLoginStore = defineStore('viewStoreLogin', {
    state: (): Body => ({
        user: { ...USER_MODEL },
    }),
    actions: {
        changeValueUser(key: string, data: string) {
            this.$patch({
                user: {
                    ...this.user,
                    [key]: data,
                }
            })
            console.log(this.user)
        },
        async authetication(body: any) {
            try {
                const newBody: any = {
                    email: body.userName,
                    password: body.password
                }
                const res = await servicesLogin.autheticactionLogin(newBody)
                return res
            } catch (error){
                console.log(error)
                ElMessage({ type: 'error', message: 'ha ocurrido un error, ver consola' })
            }

        }
    }
}
)