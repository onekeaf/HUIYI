import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

import _ from 'lodash'
import "./style/reset.css"
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import Fragment from "vue-fragment"
import "animate.css"

Vue.config.productionTip = false
Vue.use(ElementUI)
Vue.use(Fragment.Plugin)
Vue.prototype._ = _

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
