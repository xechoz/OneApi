package xyz.xechoz.app.account.api

import xyz.xechoz.app.account.internal.QQApi
import xyz.xechoz.app.account.internal.SimpleApi
import xyz.xechoz.app.account.internal.WechatApi
import xyz.xechoz.app.account.internal.WeiboApi
import java.util.*


/**
 * Created by xechoz.zheng on 15/08/2017.
 * Email: xechoz.zheng@gmail.com
 * 功能:
 * 文档:
 */
class OneApi private constructor() {
    private val apiList: HashMap<Int, IAccountApi> = HashMap()

    private object Holder {
        val INSTANCE = OneApi()
    }

    companion object {
        val instance: OneApi by lazy { Holder.INSTANCE }
    }

    init {
        // register default api implements
        addApi(SimpleApi())
        addApi(WechatApi())
        addApi(QQApi())
        addApi(WeiboApi())
    }

    fun addApi(api: IAccountApi) {
        apiList.put(api.getTypeId(), api)
    }

    fun removeApi(api: IAccountApi) {
        apiList.remove(api.getTypeId())
    }

    fun removeApi(type: Int) {
        apiList.remove(type)
    }

    fun login(userName: String, password: String) {
        login(OneTypes.BASE, userName, password)
    }

    /**
     * @param type
     * @see OneTypes
     */
    fun login(type: Int, userName: String, password: String) {
        val api = apiList[type]
        api?.login(userName, password)
    }
}