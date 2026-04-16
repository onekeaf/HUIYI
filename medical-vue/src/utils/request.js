import axios from "axios";
import { Message } from "element-ui";
import router from "../router/index";

axios.default.withCredentials = true;
// 创建 axios 实例
let service = axios.create({
  baseURL: "http://localhost:8080/api",
  timeout: 5000,
});

// request 拦截器
service.interceptors.request.use(
  (config) => {
    if (localStorage.getItem("token")) {
      config.headers = {
        Authorization: localStorage.getItem("token"),
      };
    }
    return config;
  },
  (error) => {
    Promise.reject(error);
  }
);

// response 拦截器
service.interceptors.response.use(
  (response) => {
    const res = response.data;
    if (res.code == 10006) {
      Message({
        type: "error",
        message: "登录已失效，请重新登录",
      });
      setTimeout(() => {
        localStorage.removeItem("token");
        localStorage.removeItem("userInfo");
        router.push("/user/login");
      }, 500);
    }
    return response;
  },
  (err) => {
    return Promise.reject(err);
  }
);

export default service;
