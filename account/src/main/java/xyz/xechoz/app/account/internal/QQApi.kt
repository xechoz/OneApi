package xyz.xechoz.app.account.internal

import xyz.xechoz.app.account.api.IAccountApi
import xyz.xechoz.app.account.api.OneTypes

/**
 * Created by xechoz.zheng on 16/08/2017.
 * Email: xechoz.zheng@gmail.com
 * 功能:
 * 文档:
 */
class QQApi : IAccountApi {
    override fun getTypeId(): Int {
        return OneTypes.QQ
    }

    override fun login(name: String, password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun logout(name: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}