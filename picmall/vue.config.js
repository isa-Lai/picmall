//
module.exports = {
    devServer: {
        port: 9000, //additional port for frontend
        proxy: {
            '/api': {              //interceptor format
                target: 'http://localhost:9090',
                changeOrigin: true,
                pathRewrite: {
                    '/api': ''                     //ignore from interceptor
                }
            }
        }
    }
}
