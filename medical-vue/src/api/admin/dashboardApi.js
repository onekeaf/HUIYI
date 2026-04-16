import request from "../../utils/request";

// 查询数据面板信息api
export function getAllDashboardInfo() {
  return request({
    url: "/dashboard",
    method: "GET",
  });
}
