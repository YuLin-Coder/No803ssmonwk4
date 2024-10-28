const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmonwk4/",
            name: "ssmonwk4",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmonwk4/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "开放式教学评价管理系统"
        } 
    }
}
export default base
