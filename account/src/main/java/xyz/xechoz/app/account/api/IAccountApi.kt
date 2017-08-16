package xyz.xechoz.app.account.api

/**
 * Created by xechoz.zheng on 14/08/2017.
 * Email: xechoz.zheng@gmail.com
 * 功能:
 * 文档:
 */
interface IAccountApi {
    fun getTypeId(): Int
    fun login(name: String, password: String)
    fun logout(name: String)
}